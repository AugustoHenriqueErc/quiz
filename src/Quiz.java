import java.util.ArrayList;

public class Quiz
{
    private String quizName;
    private Player user;
    private ArrayList<Question> questions;

    Quiz(String quizName, Player user)
    {
        this.quizName = quizName;
        this.user = user;
    }

    public void addQuestion(Question question)
    {
        if(question == null)
        {
            throw new NullPointerException("The question shouldn't be null");
        }
        else questions.add(question);
    }

    public void play()
    {
        for(int i = 0; i < questions.size(); i++)
        {
            System.out.print(questions.get(i).toString());
            if (questions.get(i).isAnswer(user.answer()))
            {
                System.out.println("Resposta correta!\n Parabéns "+ user.getUserName()+" Você recebeu "+questions.get(i).getValue()+" Pontos!");
                user.addScore(questions.get(i).getValue());
            }
            else System.out.println("Resposta errada!");
            System.out.println("Você está com "+user.getScore()+" Pontos");
        }
    }

}