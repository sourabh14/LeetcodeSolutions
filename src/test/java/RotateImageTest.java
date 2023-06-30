import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    void rotate() {
        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}}, output1 = {{7,4,1},{8,5,2},{9,6,3}};
        new RotateImage().rotate(input1);
        assertTrue(matrixEquals(input1, output1));
    }

    private boolean matrixEquals(int[][] input1, int[][] output1) {
        for (int i=0; i<input1.length; i++) {
            for (int j=0; j<input1[0].length; j++) {
                if (input1[i][j] != output1[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}