public class Solver {
    private Node goalNode;
    private MinPQ<Node> pq = new MinPQ<Node>();
    private MinPQ<Node> pqTwin = new MinPQ<Node>();
    
    private class Node implements Comparable<Node> {
        public Board board;
        public Node previous;
        public int moves;
        
        public int compareTo(Node that) {
            if (this.priority() == that.priority()) return 0;
            return (this.priority() > that.priority()) ? 1: -1;
        }
        
        public Node(Board b, Node p, int m) {
            board = b;
            previous = p;
            moves = m;
        }
        
        public int priority() {
            return board.manhattan() + moves;
        }
    }
    
    
    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial) {
        Queue<Board> neighbors = new Queue<Board>();
        
        Node currentNode = new Node(initial, null, 0);
        Node currentTwin = new Node(initial.twin(), null, 0);
        pq.insert(currentNode);
        pqTwin.insert(currentTwin);
        
        while(!currentNode.board.isGoal() || !currentTwin.board.isGoal()) {
            currentNode = pq.delMin();
            currentTwin = pqTwin.delMin();
            
            for (Board board: currentNode.board.neighbors()) {
                if (!board.equals(currentNode.board)) {
                    pq.insert(new Node(board, currentNode, currentNode.moves + 1));
                }
            }
            
            for (Board board: currentTwin.board.neighbors()) {
                if (!board.equals(currentTwin.board)) {
                    pqTwin.insert(new Node(board, currentTwin, currentTwin.moves + 1));
                }
            }
        }
        
        if (currentNode.board.isGoal()) {
            goalNode = currentNode;
        } else {
            goalNode = currentTwin;
        }
    }
    
    // is the initial board solvable?
    public boolean isSolvable() {
        return goalNode != null;
    }
    
    // min number of moves to solve initial board; -1 if unsolvable
    public int moves() {
        if (isSolvable()) {
            return goalNode.moves;
        } else {
            return -1;
        }
    }
    
    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution() {
        Queue<Board> steps = new Queue<Board>();
        if (isSolvable()) {
            steps.enqueue(goalNode.board);
            while (goalNode.previous != null) {
                goalNode = goalNode.previous;
                steps.enqueue(goalNode.board);
            }
            return steps;
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        // create initial board from file
        In in = new In(args[0]);
        int N = in.readInt();
        int[][] blocks = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            blocks[i][j] = in.readInt();
        Board initial = new Board(blocks);
        
        // solve the puzzle
        Solver solver = new Solver(initial);
        
        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
    
}