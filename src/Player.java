import java.util.Scanner;
public class Player
{
    private int score;
    private String userName;
    private Scanner scr;

    Player(String userName)
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
