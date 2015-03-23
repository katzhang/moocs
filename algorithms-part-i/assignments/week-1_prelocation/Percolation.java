public class Percolation {
    private int[][] grid;
    private int N;
    private WeightedQuickUnionUF uf;
    
    private int BLOCKED = 0;
    private int OPEN = 1;
    
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n should be larger than 0");
        }
        N = n;
        grid = new int[N][N]; // create N-by-N grid, with 0 representing "blocked"
        // imaginary top - 1 and bottom + 1 rows: N * N and N * N + 1
        uf = new WeightedQuickUnionUF(N * N + 2);
    }
    
    public void open(int i, int j) {
        int row = i - 1;
        int col = j - 1;
        
        validate(row, col);
        
        grid[i][j] = OPEN;
        
        int siteIndex = getSiteIndex(row, col);
        // top row site connects to top imaginary row
        if (row == 0) {
            uf.union(siteIndex, N * N);
        }
        
        // bottom row site connects to bottom imaginary row
        if (row == N - 1) {
            uf.union(siteIndex, N * N + 1);
        }
        
        // make the newly open site connects to already open neighbors
        if (isOpen(row + 1, col)) {
            uf.union(siteIndex, getSiteIndex(row + 1, col));
        }
        
        if (isOpen(row - 1, col)) {
            uf.union(siteIndex, getSiteIndex(row - 1, col));
        }
        
        if (isOpen(row, col + 1)) {
            uf.union(siteIndex, getSiteIndex(row, col + 1));
        }
        
        if (isOpen(row, col - 1)) {
            uf.union(siteIndex, getSiteIndex(row, col - 1));
        }
    }
  
    
    private int getSiteIndex(int i, int j) {
        return ((i * N) + j) + 1;
    }
    
    public boolean isOpen(int i, int j) {
        int row = i - 1;
        int col = j - 1;
        validate(row, col);
        return grid[row][col] == OPEN;
    }
    
    private void validate(int i, int j) {
        if (i < 0 || i >= N || j < 0 || j >= N) {
            throw new IndexOutOfBoundsException("index is out of bounds");
        }
    }
    
    public boolean isFull(int i, int j) {
        int row = i - 1;
        int col = j - 1;
        
        validate(row, col);
        
        int siteIndex = getSiteIndex(row, col);
        return uf.connected(siteIndex, N * N);
        
    }
    
    public boolean percolates() {
        return uf.connected(N * N, N * N + 1);
    }
    
    public static void main(String[] args) {
        
    }
}