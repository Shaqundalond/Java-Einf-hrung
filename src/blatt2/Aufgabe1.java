package blatt2;
public class Aufgabe1 {
    public static void main(String[] args) {

        String vorname = Input.inputFirstName();
        String nachname = Input.inputLastName(vorname);
        int alter = Input.inputAge(vorname);
        String ccn = Input.inputCreditCard(vorname);

        System.out.println("mööp mööp");

        Output.output(vorname,nachname,alter,ccn);
    }
}
