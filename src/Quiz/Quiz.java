package Quiz;

import java.io.*;
import java.util.*;

public class Quiz {
    private static int points = 0;

    public static void main(String[] args) throws IOException{

        //Variables
        Scanner scanner = new Scanner(System.in);               //Input
        String name;                                            //Spielername
        boolean b;                                              //Gamestate
        String smsg = "Bist du bereit für ein paar Fragen?";    //Startmessage
        String rmsg = "Möchstest du nochmal spielen?";          //Repeatmessage
        List<Question> listQuestion;                            //Speicherort der Question-Objekte
        int diff;                                               //Schwierigkeit


        System.out.println("Hallo wie lautet dein Name?");
        name = scanner.nextLine();
        System.out.println("Wähle den Schwierigkeitsgrad"+ name + ":");
        System.out.print("1:einfach\n2:normal\n3:schwer\n");
        System.out.println("Bitte gebe die passende Zahl ein");
        while((diff=scanner.nextInt())<=0|| 4<=diff){
            System.out.println("Bitte gebe die passende Zahl ein");
        }

        b = checkStart(scanner, smsg);
        if(!b) System.exit(0);

        listQuestion = createQuestions(diff);
        while(b) {
            startGame(scanner, name, listQuestion);
            //Evaluation
            if (points == 3) {
                System.out.println("すごい! Du hast alle Fragen richtig beantwortet. Das Spiel endet nun.");
                b = false;
            }
            else{
                System.out.println("Du hast "+ points + " von 3 richtigen Fragen beantwortet");
                b= checkStart(scanner, rmsg);
            }
        }
        System.exit(0);

    }

    private static boolean checkStart(Scanner a, String msg){
        String temp;
        int counter = 0;
        boolean b = false;

        while(counter <=10) {

            do{
                System.out.println(msg + " [y/n]");
                temp = a.nextLine();
                counter++;
            }while (temp.length() == 0 && counter <10);

            if(counter == 10){
                break;
            }
            temp = temp.toLowerCase();

            if (temp.matches("y|yes|ja|j|si|oui")){
                b= true;
                counter = 11;   //break besser?
            }
            else if(temp.matches("n|nein|non")){
                counter = 11;   //break besser?
            }
            else{
                System.out.println("Bitte gebe eine gültige Antwort ein");
            }
        }

        return b;
    }

    private  static void startGame(Scanner a, String name, List<Question> listQuestion) {
        points =0;
        Question q;
        String antwort;
        Collections.shuffle(listQuestion);
        System.out.println("Los geht's " + name);

        for (int i = 0; i<3;i++) {
            System.out.println("Frage "+ (i+1) +" von 3");
            q = listQuestion.get(i);
            System.out.println(q.getQuestion());
            antwort = a.nextLine().toLowerCase();
            if(q.checkAnswer(antwort)){
                points++;
            }
        }
    }

    private static  List<Question> createQuestions(int diff) throws IOException {
        List<Question> listQuestion = new ArrayList<>();            //RückgabeListe mit Question-Objekte
        ArrayList<String> ans= new ArrayList<>();                   //Zwischenspeicher aller Fragen als Text
        String diffi;                                               //Dateiname der Schwierigkeitsstufe
        String filePath = new File("").getAbsolutePath(); //seltsames Kontrukt um Pfad zu bekommen...
        String fileName;                                            //Voller Pfad und Name zum Fragenkatalog
        String line;                                                //Zwischenspeicher für gebufferte Zeile

        switch(diff){
            case 1:
                diffi = "easy";
                break;
            case 2:
                diffi = "medium";
                break;
            case 3:
                diffi = "hard";
                break;
            default:
                diffi = "easy";
                break;
        }

        fileName = filePath + "/src/Quiz/" +diffi;

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            // FileReader reads text files in the default encoding.
            fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                ans.add(line);
            }
        }

        //ExeptionHandling
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        finally
        {
            if(fileReader != null){
                // Always close files.
                bufferedReader.close();
            }
        }

        //Wandle gelesene Fragen in Question-Objekte um
        for (String text: ans ) {
            String[] parts = text.split("%%");
            //System.out.println(parts[1]);
            listQuestion.add(new Question(parts[0], parts[1]));
        }
        return listQuestion;
    }
}
