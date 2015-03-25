public class PercolationStats{
    private double[] thresholds;
    
    public double mean() {
        return StdStats.mean(thresholds);
    }
    
    public double stddev() {
        return StdStats.stddev(thresholds);
    }
    
    public double confidenceLo() {
        return mean()-((1.96*stddev())/Math.sqrt(thresholds.length));
    }
    
    public double confidenceHi() {
        return mean()+((1.96*stddev())/Math.sqrt(thresholds.length));
    }
    
    public PercolationStats(int N, int T) {
        if (N <= 0||T <= 0) throw new IllegalArgumentException();
        for (int i = 0; i < T; i++) {
            Perlocation pe = new Perlocation(N);
            int trials = 0;
            while (!pe.percolates()) {
                int row = StdRandom.uniform(N) + 1;
                int col = StdRandom.uniform(N) + 1;
                
                if (!pe.isOpen(row, col)) {
                    pe.open(row, col);
                    trials++;
                }
            }
            thresholds[i] = trials / (N * N);
        }
    }
    
    public static void main(String[] args) {
        
    }


}