import java.util.Scanner;
public class User
{
    int score;
    String userName;
    Scanner scr;

    User(String userName)
    {
        scr = new Scanner(System.in);
        score = 0;
        this.userName = userName;
    }

    public int getScore()
    {
        return score;
    }
    public String getUserName()
    {
        return userName;
    }

    public void addScore(int value)
    {
        score += value;
    }

    public String answer()
    {
        return scr.nextLine();
    }
}
