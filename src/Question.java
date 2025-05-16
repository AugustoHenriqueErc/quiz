import java.util.HashMap;
public class Question
{
    int value;
    String question;
    HashMap<String, String> answers;
    int questionId;
    String corretcAnswer;

    Question(int value,String question, int questionId)
    {
        this.question = question;
        this.value = value;
        this.questionId = questionId;
    }

    public void addAnswer(String key, String answer)
    {
        answers.put("key", "answer");
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
        strb.append("The question nª"+questionId+" is:\n"+question+answerToString());
        return strb.toString();
    }
    public Question question(int questionId)
    {
        return this;
    }
}