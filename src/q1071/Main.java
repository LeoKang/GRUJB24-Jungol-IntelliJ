package q1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sc.close();

//        System.out.println(n);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println();
//        System.out.println(m);

        int sumDivisor = 0;
        for (int i = 0; i < num.length; i++) {
            if (m % num[i] == 0) {
//                System.out.print(num[i] + " ");
                sumDivisor += num[i];
            }
        }

        int sumMultiple = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % m == 0) {
                sumMultiple += num[i];
            }
        }

        System.out.println(sumDivisor);
        System.out.println(sumMultiple);
    }
}
