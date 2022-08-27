// finding the sum of 2 matrices of 2*3 using arrays
public class main3 {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value of i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

            System.out.println(" ");
        }
    }
}
