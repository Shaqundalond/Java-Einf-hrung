package blatt6;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        //Declaration
        int a; //#reihen des Weihnachtsbaumes mit Stamm
        int a_without;//#reihen des Weihnachtsbaumes mit Stamm
        int b; //#chars pro Zeile
        String output; //String für Zeilenoutput
        String store = ""; //Speicherstring für die erste Zeile
        Scanner scanner = new Scanner(System.in); //Inputlistener

        //Input
        System.out.println("Wie viel Zeilen willst du anzeigen?: ");
        a = scanner.nextInt();
        a_without = a-1;
        b= 2*a_without -1;

        //Berechne Baum
        for(int i = 0; i<a_without; i++){
            output ="";
           for(int j = 1; j <= b; j++){
               if((j>=(a_without-i))&&(j<=(a_without+i))){
                   output +="*";
               }
               else{
                   output +=" ";
               }
           }
           if(i==0){
               store = output;
           }
           System.out.println(output);
        }
        System.out.println(store);


    }
}
