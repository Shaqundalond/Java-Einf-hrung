package blatt2;

import java.util.Scanner;

public class Input {
    public static Scanner xy = new Scanner(System.in);
    private static boolean check_valid(int[] digits) {
        int sum = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {

            // get digits in reverse order
            int digit = digits[length - i - 1];

            // every 2nd number multiply with 2
            if (i % 2 == 1) {
                digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }
        return sum % 10 == 0;
    }

    private static boolean isInvalid(String creditcard){

        if(creditcard.length() < 13){
            System.out.println("Deine Kreditkartennummer ist zu kurz");
            return true;
        }
        else if(creditcard.length() >16) {
            System.out.println("Deine Kreditkartennummer ist zu lang");
            return true;
        }
        else{
            //parse
            char tmp;
            int[] cc_array = new int[creditcard.length()];
            boolean valid;

            for (int i = 0; i < creditcard.length(); i++) {
                tmp = creditcard.charAt(i);
                if(!Character.isDigit(tmp)){
                    System.out.println("Deine Kreditkartennummer enthält ungültige Zeichen");
                    return true;
                }
                else{
                    cc_array[i] = Integer.parseInt(String.valueOf(tmp));
                }

            }
            return !check_valid(cc_array);
        }
    }

    public static String inputFirstName(){
        String vorname;
        do {
            System.out.println("Sag mir deinen Name, bitte");
            vorname = xy.nextLine();
        }while (vorname.isBlank());

        return vorname;
    }

    public static String inputLastName(String vorname){
        String nachname;

        do {
            System.out.println("Sag mir deinen Nachnamen, " + vorname);
            nachname = xy.nextLine();
        }while (nachname.isBlank());

        return nachname;
    }

    public static int inputAge(String vorname){
        int alter = 50;

        do {
            if(alter < 6){
                System.out.println("Du bist aber ziemlich jung, " + vorname);
            }
            else if( alter > 120) {
                System.out.println("Bitte kontaktiere das Guinnes Buch der Weltrekorde " + vorname);
            }
            System.out.println("Sag mir deinen Alter, " + vorname);
            alter = xy.nextInt();
        }while (alter < 6 || alter >120);

        return alter;
    }

    public static String inputCreditCard(String vorname){
        String ccn;
        do {
            System.out.println("Sag mir deinen Kreditkartennummer, " + vorname);
            //ccn = scanner.nextLine();
            ccn = xy.next();
        }while (isInvalid(ccn));

        return ccn;

    }
}
