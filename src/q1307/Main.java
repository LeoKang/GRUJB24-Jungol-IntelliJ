package q1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

//        System.out.println(n);

        int[][] mat = new int[n][n];

        int num = 1;
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[i].length - 1; j >= 0; j--) {
//                System.out.println(i + " " + j);
                if(num > 26)
                    num = 1;
                mat[j][i] = num++;
            }
//            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print((char)(mat[i][j]+64) + " ");
            }
            System.out.println();
        }
    }
}
