import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SetMatrixZeroes {
    // https://leetcode.com/problems/set-matrix-zeroes/

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);

        List<Integer> rows = Arrays.asList(new Integer[m]);
        Collections.fill(rows, 1);
        List<Integer> columns = Arrays.asList(new Integer[n]);
        Collections.fill(columns, 1);

//        System.out.println("rows = " + rows);
//        System.out.println("columns = " + columns);

        int i, j;
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    rows.set(i, 0);
                    columns.set(j, 0);
                }
            }
        }

//        System.out.println("rows = " + rows);
//        System.out.println("columns = " + columns);

        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                if ((rows.get(i) == 0) || (columns.get(j) == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
