package blatt4;

import java.util.Scanner;


public class Aufgabe3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie eine Zahl ein");
        a = scanner.nextInt();



    }
    public static void printnumbernames(int a, boolean v){
        String b = String.valueOf(a);
        char[] c = b.toCharArray();


        while(a>0){
            switch(a%10){
                case 0:
                    System.out.print("null ");
                    break;
                case 1:
                    System.out.print("eins ");
                    break;
                case 2:
                    System.out.print("zwei ");
                    break;
                case 3:
                    System.out.print("drei ");
                    break;
                case 4:
                    System.out.print("vier ");
                    break;
                case 5:
                    System.out.print("fünf ");
                    break;
                case 6:
                    System.out.print("sechs ");
                    break;
                case 7:
                    System.out.print("sieben ");
                    break;
                case 8:
                    System.out.print("acht ");
                    break;
                case 9:
                    System.out.print("neun ");
                    break;

            }
            a /= 10;

        }
    }
}
