package blatt4;

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        String muster = "";
        String vorcode = "";

        System.out.println("Bitte geben sie eine Zahl ein");
        a = scanner.nextInt();

        for (int row=0; row<a; row++){
            muster += vorcode;
            //System.out.println(muster.length());
            for(int j= 0;j<(a-vorcode.length());j++){

                if(row%2 == 0){
                    muster += "+";
                }
                else{
                    muster += "-";
                }
            }

            System.out.println(muster);
            muster = "";

            if(row%2 == 0){
                vorcode += "+";
            }
            else{
                vorcode += "-";
            }

        }
    }
}
