package blatt4;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein");
        a = scanner.nextInt();

        for (int i=1 ; i<=a ; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
