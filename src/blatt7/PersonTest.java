package blatt7;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Scanner scanner = new Scanner(System.in);
        p1.vorname = "Joe";

        System.out.println(p1.vorname);
    }
}