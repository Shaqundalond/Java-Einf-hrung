package Quiz;

public class Question {
    private String question;
    private String answer;

    public Question(String q, String a){
        question = q;
        answer = a.toLowerCase();
    }

    public String getQuestion() {
        return question;
    }


    public boolean checkAnswer(String a){
        return a.equals(this.answer);
    }
}
