public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // take transpose of whole matrix
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.println("i = " + i + ", j = " + j);
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }

        // reverse every row of matrix
        for (int i=0; i<n; i++) {
            for (int j=0; j<n / 2; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = k;
            }
        }

    }

    private void printMatrix(int[][] matrix) {
        int n = matrix.length;
        System.out.println("--Matrix--");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println("");
        }
    }
}
