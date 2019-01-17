package blatt6;

import java.util.Scanner;

public class aufgabe1 {

    public static void main(String[] args) {
        int count;
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Zahlen willst du eingeben?: ");
        count =scanner.nextInt();
        int[]a = new int[count];

        for(int i = 0 ; i< count; i++){
            System.out.println((i+1)+". Zahl:");
            a[i] = scanner.nextInt();
        }
        //SORITIERUNG
        int i = 0;
        while(i<count){
            for(int j = 0; j<count-1;j++ ){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j] = temp;
                }
            }
            i++;
        }
        //Output
        for(int x : a){
            System.out.println(x);
        }



    }
}
