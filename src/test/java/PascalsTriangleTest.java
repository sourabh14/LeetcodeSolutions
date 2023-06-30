import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void generate() {
        List<List<Integer>> pascal = new PascalsTriangle().generate(5);
        printMatrix(pascal);
    }

    private void printMatrix(List<List<Integer>> pascal) {
        for (List<Integer> i : pascal) {
            System.out.println(i);
        }
    }
}