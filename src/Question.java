public class Question
{
    int value;
    String question;
    String[] answer;
    int questionNumber;
    int corretcAnswer;

    Question(int value,String question, String[] answer)
    {
        this.question = question;
        this.value = value;
        this.answer = answer;
        this.questionNumber = questionNumber;
    }

    public int getValue() {
        return value;
    }

    private String answerToString()
    {
        StringBuilder strb = new StringBuilder();
        strb.append("\nAnswers:");
        for(int i = 0;i < answer.length;i++)
        {
               strb.append("\n"+i+")"+answer[i]);
        }
        return strb.toString();
    }

    public boolean isAnswer(int answer)
    {
        if(answer == corretcAnswer) return true;
        else return false;
    }

    public void setCorretcAnswer(int answerNumber)
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