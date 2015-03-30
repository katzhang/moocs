import java.util.NoSuchElementException;
import java.lang.NullPointerException;
import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    private int N;
    private Node<Item> first;
    private Node<Item> last;
    
    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> prev;
        private Node<Item> next;
    }
    
    /**
     * Initializes an empty deque
     */
    public Deque() {
        first = null;
        last = null;
        N = 0;
    }
    
    /**
     * Is this stack empty?
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return N == 0;
    }
    
    /**
     * Returns the number of items in the deque
     * @return the number of items in the deque
     */
    public int size() {
        return N;
    }
    
    /**
     * Adds the item to the front of the deque
     * @param item the item to add
     */
    public void addFirst(Item item) {
        if (item == null) throw new NullPointerException("item is null");
        
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        
        if (isEmpty()) {
            last = first;
        } else {
            oldfirst.prev = first;
        }
        
        N++;
    }
    
    /**
     * Adds the item to the end of the deque
     * @param item the item to add
     */
    public void addLast(Item item) {
        if (item == null) throw new NullPointerException("item is null");
        
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.prev = oldlast;
        
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        
        N++;
    }
    
    /**
     * Removes and return the item from the front of the deque
     * @return item the item to remove
     */
    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        Item firstItem= first.item;
        first = first.next;
        N--;
        
        if (isEmpty()) {
            first = null;
        }
        return firstItem;
    }

    /**
     * Removes and return the item from the end of the deque
     * @return item the item to remove
     */
    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        
        Item lastItem= last.item;
        last = last.prev;
        N--;
        
        if (isEmpty()) {
            last = null;
        } else {
            last.next = null;
        }
        return lastItem;
    }
    
    /**
     * Returns an interator over items in  order from front to end
     * @return interator
     */
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }
    
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;
        
        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
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
        Deque<String> d = new Deque<String>();
        d.addFirst("first");
        d.addFirst("second");
        d.addLast("third");
        StdOut.println(d);
        StdOut.println(d.removeFirst());
        StdOut.println(d.removeLast());
        
    }
}