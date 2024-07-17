package q197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect[] r = new Rect[2];

        for (int i = 0; i < r.length; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            r[i] = new Rect(x1, y1, x2, y2);
        }

        for (int i = 0; i < r.length; i++) {
            r[i].print();
        }

        int minLDX = Math.min(r[0].getLDX(), r[1].getLDX());
        int minLDY = Math.min(r[0].getLDY(), r[1].getLDY());
        System.out.print(minLDX + " " + minLDY + " ");

        int maxRUX = Math.max(r[0].getRUX(), r[1].getRUX());
        int maxRUY = Math.max(r[0].getRUY(), r[1].getRUY());
        System.out.println(maxRUX + " " + maxRUY);
    }
}

class Rect {
    private Point ld;
    private Point ru;

    public Rect(Point ld, Point ru) {
        this.ld = ld;
        this.ru = ru;
    }

    public Rect(int x1, int y1, int x2, int y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        this.ld = p1;
        this.ru = p2;
    }

    public void print() {
        ld.print();
        ru.print();
    }

    public int getLDX() {
        return ld.getX();
    }

    public int getLDY() {
        return ld.getY();
    }

    public int getRUX() {
        return ru.getX();
    }

    public int getRUY() {
        return ru.getY();
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + " " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
