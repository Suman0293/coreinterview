package javabasic;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = (i + 1) * (j + 1);
                System.out.print(a[i][j] + "\t");
            }

            System.out.println(" ");
        }
    }
}
