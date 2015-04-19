public class KdTree {
    private static final boolean VERTICAL = true;
    private static final boolean HORIZONTAL = false;
    
    private Node root;
    private int size = 0;
    
    private static class Node {
        private Point2D p;
        private RectHV rect;
        private Node left;
        private Node right;
        private double key;
        private int size;
        
        boolean division;
        
        public Node(Point2D p, boolean division, int size) {
            this.p = p;
            this.division = division;
            this.left = null;
            this.right = null;
            this.size = size;
            
            if (division == VERTICAL) key = p.x();
            if (division == HORIZONTAL) key = p.y();
        }
        
    }
    
    public KdTree() {
        root = null;
    }
    
    
    
    // is the set empty? 
    public boolean isEmpty() {
        return root == null;
    }
    
    // number of points in the set 
    public int size() {
        return count(root);
    }
    
    private int count(Node n) {
        if (n == null) return 0;
        else return n.size;
    }
    
    // add the point to the set (if it is not already in the set)
    public void insert(Point2D p) {
        if (root == null) {
            root =  new Node(p, VERTICAL, 1);
        } else {
            add(root, p);
        }
    }
    
    // HELPER METHODS: add
    private void add(Node n, Point2D p) {
        double pKey = n.division == VERTICAL ? p.x(): p.y();
        if (pKey - n.key > 0) {
            if (n.right  == null) n.right = new Node(p, !n.division, 1);
            else insert(n.right, p);
        } else if (pKey - n.key < 0) {
            if (n.left == null) n.left = new Node(p, !n.division, 1);
            else insert(n.left, p);
        }
        n.size++;
    }
    
    // does the set contain point p?
    public boolean contains(Point2D p) {
       return get(root, p);
    }
    
    // HELPER METHODS: get
    private Node get(Node n, Point2D p) {
        if (n == null) return false;
        if (n.p.equals(p)) return true;
        double pValue = n.division == VERTICAL ? p.x(): p.y();
        Node next = pValue < n.key? n.left: n.right;
        return get(next, p);
    }
    
    // draw all points to standard draw 
    public void draw() {

    }
    
    // all points that are inside the rectangle 
    public Iterable<Point2D> range(RectHV rect) {
        Stack<Point2D> stack = new Stack<Point2D>();
        getRange(root, rect, stack);
        return stack;
    }
    
    // HELPER METHODS: getRange
    private void getRange(Node n, RectHV rect, Stack<Point2D> pointsStack) {
        if (n == null) return;
        getRange(n.left, rect, pointsStack);
        getRange(n.right, rect, pointsStack);
        
        if (rect.contains(n.p)) {
            pointsStack.push(n.p);
        }
    }
    
    public Point2D nearest(Point2D p) {
        double shortestDistance = 1000;
        Point2D nearestPoint;
        for(Point2D point: set) {
            if(p.distanceTo(point) < shortestDistance) {
                nearestPoint = point;
            }
        }
        return nearestPoint;
    }
    
}