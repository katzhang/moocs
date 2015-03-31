import java.util.NoSuchElementException;
import java.lang.NullPointerException;
import java.util.Iterator;

/**
 * Resize array queue
 */

public class RandomizedQueue<Item> implements Iterable<Item> {
    private int N = 0;      // number of elements
    private Item[] queue;   // slots for elements
    private int first = 0;  // index of first element
    private int last = 0;   // inde x of next available slot
    
    /**
     * Initializes an empty queue
     */
    public RandomizedQueue() {
        queue = (Item[]) new Object[2];
        N = 0;
    }
    
    /**
     * Is this queue empty?
     * @return true if this queue is empty; false otherwise
     */
    public boolean isEmpty() {
        return N == 0;
    }
    
    /**
     * Returns the number of items in the queue
     * @return the number of items in the queue
     */
    public int size() {
        return N;
    }
    
    /**
     * Resizes the underlying array
     */
    private void resize(int max) {
        assert max >= N;
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = queue[(first + i) % queue.length];
        }
        queue = temp;
        first = 0;
        last = N;
    }
    
    /**
     * Adds the item (to the front)
     * @param item the item to add
     */
    public void enqueue(Item item) {
        if (item == null) throw new NullPointerException("item is null");
        
        if (queue.length == N) resize(2 * queue.length);
        queue[last++] = item;
        
        if (last == queue.length) last = 0;
        
        N++;
    }
    
    /**
     * Removes and return a random item
     * @return item the item to remove
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("queue underflow");
        
        int randomIndex = StdRandom.uniform(N);
        Item randomItem = queue[randomIndex];
        
        queue[randomIndex] = null;
        
        N--;
        if (randomIndex == first) first++;
        
        if (N > 0 && N == queue.length / 4) resize(queue.length/2);
        
        return randomItem;
    }

    /**
     * Return (but do not remove) a random item
     * @return item
     */
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException("queue underflow");
        int randomIndex = StdRandom.uniform(N);
        return queue[randomIndex];
    }
    
    /**
     * Return an independent iterator over items in random order
     * @return iterator
     */
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }
    
    private class RandomizedQueueIterator implements Iterator<Item> {
        private int i = 0;
        private int[] indexArray;
        
        public RandomizedQueueIterator() {
            indexArray = new int[N];
            for (int j = 0; j < N; j++) {
                indexArray[j] = j;
            }
            StdRandom.shuffle(indexArray);
        }
        
        public boolean hasNext()  { return i < N;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException(); 
            return queue[indexArray[i++]];
        }   
        
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }
    
    /**
     * Unit testing
     */
    public static void main(String[] args) {
        RandomizedQueue<Integer> q = new RandomizedQueue<Integer>();
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < 5; i++)
            System.out.println(q.sample());
    }
}