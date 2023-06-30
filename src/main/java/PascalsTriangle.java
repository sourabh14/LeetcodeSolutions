import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows > 0) {
            pascal.add(Collections.singletonList(1));
//            printMatrix(pascal);
            for (int i=1; i<numRows; i++) {
                pascal.add(Arrays.asList(new Integer[i+1]));
//                printMatrix(pascal);
                for (int j=0; j<=i; j++) {
//                    System.out.println("i: " + i + ", j: " + j);

                    int val;
                    if (j==0 || j==i) {
                        val = 1;
                    }
                    else {
                        val = pascal.get(i-1).get(j) + pascal.get(i-1).get(j-1);
                    }
                    pascal.get(i).set(j, val);
                }
            }
        }

        List<Integer> test = new ArrayList<>();
        test.add(34);
        new ArrayList<>(test);
        return pascal;
    }

    private void printMatrix(List<List<Integer>> pascal) {
        System.out.println("--Pascal--");
        for (List<Integer> i : pascal) {
            System.out.println(i);
        }
        System.out.println("");
    }
}
