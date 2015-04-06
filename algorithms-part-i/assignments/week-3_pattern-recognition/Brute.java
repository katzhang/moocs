public class Brute {
    public static void main(String[] args) {
        In input = new In(args[0]);
        int N = input.readAllLines().length;
        Point[] points = new Point[N];
        
        for (int i = 0; i < N; i++) {
            int x = input.readInt();
            int y = input.readInt();
            points[i] = new Point(x, y);
        }
        
        Point[] collinears = new Point[4];
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int m = k + 1; m < N; m++) {
                        double slope1 = points[i].slopeTo(points[j]);
                        double slope2 = points[i].slopeTo(points[k]);
                        double slope3 = points[i].slopeTo(points[m]);
                        
                        if (slope1 == slope2 && slope2 == slope3) {
                           collinears[0] = points[i];
                           collinears[1] = points[j];
                           collinears[2] = points[k];
                           collinears[3] = points[m];
                        }
                        
                        sortPoints(collinears);
                    }
                }
            }
        }
        
        
    }
    
    private static void sortPoints(Point[] points) {
        Point temp;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                if (points[i].compareTo(points[j]) == 1) {
                    temp = points[i];
                    points[i] = points[j];
                    points[j] = temp;
                }
            }
        }       
    }
}