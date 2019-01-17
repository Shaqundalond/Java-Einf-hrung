package blatt2;

public class Output {
    public static void output(String firstname, String lastname, int age, String Creditcard){

        String a;
        String b;
        String c;
        String d;

        a=(age>67)? "ja" : "nein";
        b=(age%2 == 0)? "ja" : "nein";
        c=(firstname.length() > age || lastname.length() > age )? "ja" : "nein";
        d=(firstname.length() > age || lastname.length() > age)? "ja" : "nein";


        System.out.println(firstname + " " + lastname + "ist "+ age +" Jahre alt");
        System.out.print("Die Kreditkartennummer lautet: ");
        for(int j = 0; j<Creditcard.length(); j++){
            if(j < 3){
                System.out.print(Creditcard.charAt(j));
            }
            else{
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Diese Person befindet sich in Rente : " + a);
        System.out.println("Das Alter dieser Person ist gerade : " +  b);
        System.out.println("Vorname oder Nachname ist länger als Alter : " + c);
        System.out.println("Sowohl Vorname als auch Nachname ist länger als Alter : " + d);


    }

}
