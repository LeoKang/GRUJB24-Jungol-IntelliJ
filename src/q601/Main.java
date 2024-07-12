package q601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        sc.close();

//        System.out.println(inp);

        String str = inp + inp;
        for (int i = 0; i < inp.length(); i++) {
            for (int j = inp.length() - 1 - i, k = 0; k < inp.length(); j++, k++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
