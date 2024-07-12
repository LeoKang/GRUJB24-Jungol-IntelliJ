package q150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] ar = new char[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.next().charAt(0);
        }

        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}
