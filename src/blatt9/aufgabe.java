package blatt9;

import java.util.Scanner;

public class aufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie Zahlen die durch Leerzeichen getrennt sind ein.");

        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int[] numbers= filterEvenNumber(parts);


        System.out.print("Die Geraden Zahlen sind: ");
        for (int num: numbers) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
    public static int[] filterEvenNumber(String[] a){
        int[] temporal = new int[a.length];
        int j=0;
        for(int i =0 ; i<a.length; i++){
            int temp = Integer.parseInt(a[i]);
            if(temp%2==0){
                temporal[j] = temp;
                j++;
            }
        }
        int[] evennumbers = new int[j];
        for(int i = 0 ; i<evennumbers.length; i++){
            evennumbers[i]=temporal[i];
        }
        return evennumbers;
    }
}
