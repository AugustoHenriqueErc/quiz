import java.util.HashMap;
public class Question
{
    int value;
    String question;
    HashMap<String, String> answers;
    int questionNumber;
    String corretcAnswer;

    Question(int value,String question, HashMap<String, String> answer)
    {
        this.question = question;
        this.value = value;
        this.answers = answer;
        this.questionNumber = questionNumber;
    }

    public int getValue() {
        return value;
    }

    private String answerToString()
    {
        StringBuilder strb = new StringBuilder();
        strb.append("\nAnswers:");
        for(String answer : answers.values())
        {
            strb.append(answer);
        }
        return strb.toString();
    }

    public boolean isAnswer(String answer)
    {
        if(answer == corretcAnswer) return true;
        else return false;
    }

    public void setCorretcAnswer(String corretcAnswer)
    {
        this.corretcAnswer = corretcAnswer;
    }

    @Override
    public String toString()
    {
        StringBuilder strb = new StringBuilder();
        strb.append("The question nª"+questionNumber+" is:\n"+question+answerToString());
        return strb.toString();
    }
}