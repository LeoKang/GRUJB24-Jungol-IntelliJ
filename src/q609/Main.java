package q609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inp = new String[3];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < inp.length; i++) {
            System.out.print(inp[i] + " ");
        }

        boolean eq = false;
        int idx = 0;
        for (int i = 0; i < inp.length; i++) {
            char c1 = inp[0].charAt(i);
            char c2 = inp[1].charAt(i);
            char c3 = inp[2].charAt(i);

            if(c1 > c2) {
                if(c2 > c3) {
//                    System.out.println(inp[2]);
                    idx = 2;
                }else if(c2 == c3) {
                    eq = true;
//                    System.out.println(inp[1]);
                    idx = 1;
                }else{
//                    System.out.println(inp[1]);
                    idx = 1;
                }
            }else{
                if(c1 > c3) {
//                    System.out.println(inp[2]);
                    idx = 2;
                }else if(c1 == c3){
                    eq = true;
//                    System.out.println(inp[0]);
                    idx = 0;
                }else{
//                    System.out.println(inp[0]);
                    idx = 0;
                }
            }

            if(eq == false) {
                System.out.println(inp[idx]);
                break;
            }else{

            }
        }
    }
}
