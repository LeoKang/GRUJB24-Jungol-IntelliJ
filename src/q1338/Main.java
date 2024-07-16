package q1338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        char[][] ar = new char[N][N];
        char ch = 'A';
        for (int i = 0; i < N; i++) {
            for (int j = i, k = N - 1; k >= 0; j++, k--) {
                if (j < N && k < N) {
                    if(ch == 'Z' + 1) {
                        ch = 'A';
                    }
                    ar[j][k] = ch++;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(ar[i][j] == '\0') {
                    System.out.print("  ");
                }else {
                    System.out.print(ar[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
