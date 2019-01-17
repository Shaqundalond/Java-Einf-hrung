package blatt4;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein");
        a = scanner.nextInt();

        System.out.print("Die Vielfachen (1-10) von"+a+": ");
        for(int i =1; i<11; i++){
            System.out.print(a*i +" ");
        }
        System.out.print("\n");
    }
}
