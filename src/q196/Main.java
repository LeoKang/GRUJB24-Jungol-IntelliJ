package q196;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[3];
        for (int i = 0; i < person.length; i++) {
            String name = sc.next();
            String tel = sc.next();
            String adrs = sc.next();

            person[i] = new Person(name, tel, adrs);
        }

//        for (int i = 0; i < person.length; i++) {
//            person[i].print();
//        }

        Arrays.sort(person);

//        System.out.println("====================");
        person[0].print();
    }
}

class Person implements Comparable<Person> {
    private String name;
    private String tel;
    private String adrs;

    public Person(String name, String tel, String adrs) {
        this.name = name;
        this.tel = tel;
        this.adrs = adrs;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("tel : " + tel);
        System.out.println("addr : " + adrs);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if(name.charAt(0) > o.getName().charAt(0)){
            return 1;
        }else if(name.charAt(0) < o.getName().charAt(0)){
            return -1;
        }else {
            return 0;
        }
    }
}