import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {
    @Test
    void setZeroes() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        printMatrix(matrix);
        new SetMatrixZeroes().setZeroes(matrix);
        printMatrix(matrix);
    }

    private void printMatrix(int[][] matrix) {
        System.out.println("--Matrix--");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }
    }

}