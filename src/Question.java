import java.util.ArrayList;
public class Question
{
    int value;
    String question;
    ArrayList<String> answers;
    int questionId;
    String corretcAnswer;

    Question(int value,String question, int questionId)
    {
        answers = new ArrayList<>();
        this.question = question;
        this.value = value;
        this.questionId = questionId;
    }

    public void addAnswer(String key, String answer)
    {
        StringBuilder strb = new StringBuilder();
        strb.append(key.toUpperCase()+") "+answer);
        strb.toString();
        answers.add(strb.toString());
    }

    public int getValue()
    {
        return value;
    }

    private String answerToString()
    {
        StringBuilder strb = new StringBuilder();
        for(int i=0 ;i < answers.size(); i++)
        {
            strb.append(answers.get(i)+"\n");
        }
        return strb.toString();
    }

    public boolean isAnswer(String answer)
    {
        if(answer.equals(corretcAnswer)) return true;
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
        strb.append("A questão de número ª"+questionId+" é:\n"+question+"\n"+answerToString());
        return strb.toString();
    }
}