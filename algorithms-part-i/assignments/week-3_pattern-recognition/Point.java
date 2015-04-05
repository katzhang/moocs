/*************************************************************************
 * Name:
 * Email:
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Comparator;

public class Point implements Comparable<Point> {

    // compare points by slope
    public final Comparator<Point> SLOPE_ORDER = new SlopeComparator();

    private class SlopeComparator implements Comparator<Point> {
        public int compare(Point a, Point b) {
            if (Point.this.slopeTo(a) < Point.this.slopeTo(b)) {
                return -1;
            } else if (Point.this.slopeTo(a) > Point.this.slopeTo(b)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
        
        
    }

    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(Point that) {
        if (that.y == this.y && that.x == this.x) {
            return Double.NEGATIVE_INFINITY;
        // horizontal line - slope = positive zero
        } else if (that.y == this.y) {
            return 0.0;
        // vertical line - slope = positive infinity
        } else if (that.x == this.x) {
            return Double.POSITIVE_INFINITY;
        }
        
        return (that.y - this.y) / (that.x - this.x);
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(Point that) {
        if (this.y < that.y) {
            return -1;
        } else if (this.y > that.y) {
            return 1;
        } 
        
        if (this.x < that.x) {
            return -1;
        } else if (this.x > that.x) {
            return 1;
        }
        
        return 0;
    }

    // return string representation of this point
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }

    // unit test
    public static void main(String[] args) {
        Point a, b;
        
        a = new Point(2,3);
        b = new Point(1,4);
        
        assert a.slopeTo(b) == Double.POSITIVE_INFINITY: "vertical line so slop is pos infinity";
        StdOut.println(a.slopeTo(b));
        
        a = new Point(2,3);
        b = new Point(1,3);
        
        assert a.slopeTo(b) == 0.0: "horizontal line so slop is pos infinity";       
        
    }
}
