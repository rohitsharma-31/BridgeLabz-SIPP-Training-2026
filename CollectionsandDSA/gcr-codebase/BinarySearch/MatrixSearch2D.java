public class MatrixSearch2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; if (rows == 0) return false;
        int cols = matrix[0].length;
        int l = 0, r = rows * cols - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int row = m / cols, col = m % cols;
            int val = matrix[row][col];
            if (val == target) return true;
            if (val < target) l = m + 1; else r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { {1,3,5,7}, {10,11,16,20}, {23,30,34,50} };
        System.out.println(searchMatrix(mat, 3));
        System.out.println(searchMatrix(mat, 13));
    }
}
