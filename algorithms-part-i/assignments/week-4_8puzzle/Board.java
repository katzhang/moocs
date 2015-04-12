import java.util.Arrays;
public class Board {
    private int[][] boardBlocks;
    private int N;
    
    // construct a board from an N-by-N array of blocks
    public Board(int[][] blocks) {
        boardBlocks = blocks;
        N = blocks.length;
        this.boardBlocks = blocks;
    }
    
    // board dimension N
    public int dimension() {
        return N;
    }
    
    // number of blocks out of place
    public int hamming() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (boardBlocks[i][j] == 0) continue;
                if (boardBlocks[i][j] != i * N + j + 1) {
                    count++;
                }
            }
        }
        return count;
    }
    
    // sum of Manhattan distances between blocks and goal
    public int manhattan() {
        int count = 0;
        int current, goalRow, goalCol;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (boardBlocks[i][j] == 0) continue;
                current = boardBlocks[i][j];
                goalRow = (current - 1) / N;
                goalCol = (current - 1) % N;
                
                count += Math.abs(goalRow - i);
                count += Math.abs(goalCol - j);
            }
        }
        return count;       
    }
    
     // is this board the goal board?
    public boolean isGoal() {
        outerloop:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (boardBlocks[i][j] != i * N + j + 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // a board that is obtained by exchanging two adjacent blocks in the same row
    public Board twin() {
        int[][] twin = clone2DArray(boardBlocks, N);
        int i = 0;
        while(boardBlocks[0][i] * boardBlocks[0][i + 1] == 0) {
            i++;
        }
        swapBlocks(twin, 0, i, 0, i + 1);
        
        return new Board(twin);
    }
    
    // does this board equal y?
    public boolean equals(Object y) {
        if (y == this) return true;
        if (y ==  null) return false;
        if (y.getClass() != this.getClass()) return false;
        Board that = (Board) y;
        return Arrays.equals(this.boardBlocks, that.boardBlocks);
    }
    
    private int[][] clone2DArray(int[][] that, int M) {
        int[][] clone = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                clone[i][j] = that[i][j];
            }
        }
        return clone;
    }
    
    private void swapBlocks(int[][] array, int row, int col, int row2, int col2) {
        int temp;
        temp = array[row][col];
        array[row][col] = array[row2][col2];
        array[row2][col2] = temp;
    }
    
    private void pushToStack(Stack<Board> stack, int row1, int col1, int row2, int col2) {
        int[][] clone = clone2DArray(boardBlocks, N);
        swapBlocks(clone, row1, col1, row2, col2);
        stack.push(new Board(clone));
    }
    
    // all neighboring boards
    public Iterable<Board> neighbors() {
        Stack<Board> neighborStack = new Stack<Board>();
        int zeroRow = 0;
        int zeroCol = 0;
        int[][] neighbor1, neighbor2, neighbor3, neighbor4;
        outerloop:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (boardBlocks[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                    break outerloop;
                }
            }
        }
        
        StdOut.println("zeroRow " + zeroRow);
        StdOut.println("zeroCol " + zeroCol);
        
        if (zeroRow + 1 < N && zeroRow + 1 >= 0) {
            pushToStack(neighborStack, zeroRow + 1, zeroCol, zeroRow, zeroCol);
        }

        if (zeroRow - 1 < N && zeroRow - 1 >= 0) {
            pushToStack(neighborStack, zeroRow - 1, zeroCol, zeroRow, zeroCol);
        }
        if (zeroCol + 1 < N && zeroCol + 1 >= 0) {
            pushToStack(neighborStack, zeroRow, zeroCol + 1, zeroRow, zeroCol);
        }
        if (zeroCol - 1 < N && zeroCol - 1 >= 0) {
            pushToStack(neighborStack, zeroRow, zeroCol - 1, zeroRow, zeroCol);
        }


        return neighborStack;
    }

    // string representation of this board (in the output format specified below)
    public String toString() {
        StringBuffer output = new StringBuffer();
        output.append(N + "\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                 output.append(String.format("%2d ", boardBlocks[i][j]));
            }
            output.append("\n");
        }
        return output.toString();
    }         

    public static void main(String[] args) {
        int[][] blocks = {{8, 1, 3}, {4, 2, 0}, {7, 6, 5}};
        Board a = new Board(blocks);
        StdOut.println(a.dimension());
        StdOut.println(a.hamming());
        StdOut.println(a.manhattan());
        StdOut.println(a);
        StdOut.println(a.twin());
        for (Board board: a.neighbors()) {
            StdOut.println(board);
        }  
    }
}