import java.util.Arrays;

public class Fast {
    public static void main(String[] args) {
        In input = new In(args[0]);
        int N = input.readAllLines().length;
        Point[] points = new Point[N];
        Point[] auxPoints = new Point[N];
        double[] slopes = new double[N];
        
        for (int i = 0; i < N; i++) {
            int x = input.readInt();
            int y = input.readInt();
            points[i] = new Point(x, y);
        }
        
        
        for (int i = 0; i < N; i++) {
            // points[i] is the origin
            Point p = points[i];
            
            System.arraycopy(points, 0, auxPoints, 0, points.length);
            
            Arrays.sort(auxPoints, i, N, p.SLOPE_ORDER);
            
            for (int j = 0; j < N - 2; j++) {
                double slope1 = p.slopeTo(auxPoints[j]);
                double slope2 = p.slopeTo(auxPoints[j + 1]);
                double slope3 = p.slopeTo(auxPoints[j + 2]);
                
                if (slope1 == slope2 && slope2 == slope3) {
                    // auxPoints[j], auxPoints[j + 1], auxPoints[j + 2] and p are collinear
                }
            }
        }
        
        
        
    }
}