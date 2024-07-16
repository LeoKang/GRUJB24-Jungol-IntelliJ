package q608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        sc.close();

        System.out.println(inp);

        boolean b = false;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 'c') {
                b = true;
            }
        }

        if (b == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (inp.indexOf("ab") == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
