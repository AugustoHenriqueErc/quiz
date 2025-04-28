public class Admin
{
    String adminName;
    Admin(String adminName)
    {
        this.adminName = adminName;
    }

    public void createQuiz(String quizName, User user)
    {
        Quiz quiz = new Quiz(quizName, user);
    }
}