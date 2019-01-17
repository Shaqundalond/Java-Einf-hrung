package Blatt1;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Aufgabe3 {
    public static void main(String[] args) {
        String name;
        int u_year;
        int u_month;
        int u_day;
        int time;
        long diff;

        GregorianCalendar date_now = new GregorianCalendar();
        //GregorianCalendar date_user = new GregorianCalendar();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bitte gebe deinen Namen ein:");
        name = scanner.nextLine();
        System.out.println("Bitte gebe dein GeburtsJahr ein: XXXX");
        u_year = scanner.nextInt();
        System.out.println("Bitte gebe dein Geburtsmonat ein: XX");
        u_month = scanner.nextInt();
        System.out.println("Bitte gebe dein Geburtstag ein: XX");
        u_day = scanner.nextInt();

        GregorianCalendar date_user = new GregorianCalendar(u_year, u_month,u_day);
        diff = (date_now.getTimeInMillis()- date_user.getTimeInMillis())/(1000*60*60*24);
        System.out.println(diff);

    }
}
