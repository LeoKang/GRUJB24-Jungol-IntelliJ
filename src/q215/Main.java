package q215;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        sc.close();

        System.out.println(inp1 + " " + inp2);

        int pos = 0;
        for (int i = 0; i < inp1.length(); i++) {
            char c = inp1.charAt(i);
            if ('0' <= c && c <= '9') {
                pos++;
            } else {
                break;
            }
        }
        System.out.println("pos = " + pos);

        int num1 = 0;
        for (int i = 0; i < inp1.length(); i++) {
            char c = inp1.charAt(i);
            if ('0' <= c && c <= '9') {
                if (i == 0) {
                    num1 = (c - '0');
                } else {
                    num1 = num1 * 10 + (c - '0');
                }
            } else {
                break;
            }
        }
        System.out.println(num1);

        int num2 = 0;
        for (int i = 0; i < inp2.length(); i++) {
            char c = inp2.charAt(i);
            if ('0' <= c && c <= '9') {
                if (i == 0) {
                    num2 = (c - '0');
                } else {
                    num2 = num2 * 10 + (c - '0');
                }
            } else {
                break;
            }
        }
        System.out.println(num2);

        int res = num1 * num2;
        System.out.println(res);
    }
}
