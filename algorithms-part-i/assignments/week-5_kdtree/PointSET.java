public class PointSET {
    private SET<Point2D> set;
    
    public PointSET() {
        set = new SET<Point2D>();
    }
    
    // is the set empty? 
    public boolean isEmpty() {
        return set.isEmpty();
    }
    
    // number of points in the set 
    public int size() {
        return set.size();
    }
    
    // add the point to the set (if it is not already in the set)
    public void insert(Point2D p) {
        if (!this.contains(p)) {
            set.add(p);      
        }
    }
    
    // does the set contain point p?
    public boolean contains(Point2D p) {
        return set.contains(p);
    }
    
    // draw all points to standard draw 
    public void draw() {
        for(Point2D point: set) {
            point.draw();
        }
    }
    
    // all points that are inside the rectangle 
    public Iterable<Point2D> range(RectHV rect) {
        Set<Point2D> rangeSet = new Set<Point2D>();
        for(Point2D point: set) {
            if(rect.contains(point)) {
                rangeSet.add(point);
            }
        }
        return rangeSet;
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