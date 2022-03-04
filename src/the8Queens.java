import java.util.Arrays;

public class the8Queens {
    public static void main(String[] args) {
        int[][] test1 = new int[4][4];

        int[][] result = solveQueens(test1);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solveQueens(int[][] arr) {
        int len = arr.length;
        int[][] result = new int[len][len];

        int count = 1;
        for (int i = 0; i < (len / 2); i++) {
            result[i][count] = 1;
            count += 2;
        }

        updateTakenDown(result);

        int[] next = findFirstOneDiagonal(result);

        return result;
    }

    public static int[] findFirstOneDiagonal(int[][] arr) {
        int[] result = new int[2];

        return result;
    }

    public static void updateTakenDown(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr.length;l++) {

                                if (k == i || l == j) {
                                    arr[k][l] = 2;

                                }
                                arr[i][j] = 1;

                                if (k == i + 1 && l == j + 1){
                                    int count = 0;
                                    for (int m = k; m < arr.length; m++) {
                                        if (l + count < arr.length) {
                                            arr[m][l + count] = 2;
                                            count++;
                                        }

                                    }
                                    count = 0;
                                    for (int n = l - 2; n > -1; n--) {
                                        if (k + count < arr.length) {
                                            arr[k + count][n] = 2;
                                            count++;
                                        }

                                    }
                                }

                        }
                    }
                }
            }
        }
    }
}
