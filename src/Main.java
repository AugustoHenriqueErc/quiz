public class Main {
    public static void main(String[] args) {

        Player user1 = new Player("Aluno1");
        Quiz quiz1 = new Quiz("Quiz tecnologia", user1);
        Question question1 = new Question(10, "Qual é a linguagem de programação mais utilizada para desenvolvimento de aplicações Android?", 1);
        question1.addAnswer("A", "Swift");
        question1.addAnswer("B", "Kotlin");
        question1.addAnswer("C", "Python");
        question1.addAnswer("D", "C++");
        question1.setCorretcAnswer("B");

        Question question2 = new Question(10, "Em engenharia de software, qual é o objetivo principal da metodologia ágil?", 2);
        question2.addAnswer("A", "Criar códigos mais curtos");
        question2.addAnswer("B", "Reduzir custos de hardware");
        question2.addAnswer("C", "Melhorar a comunicação e adaptação às mudanças");
        question2.addAnswer("D", "Eliminar totalmente os erros de software");
        question2.setCorretcAnswer("C");

        Question question3 = new Question(10, "Qual é o principal objetivo de um banco de dados relacional?", 3);
        question3.addAnswer("A", "Armazenar dados de forma não estruturada");
        question3.addAnswer("B", "Garantir segurança por meio de criptografia avançada");
        question3.addAnswer("C", "Organizar e relacionar dados para facilitar consultas");
        question3.addAnswer("D", "Executar programas dentro do sistema operacional");
        question3.setCorretcAnswer("D");

        Question question4 = new Question(10, " Qual componente de hardware é responsável por executar as instruções de um programa?", 4);
        question4.addAnswer("A", "Memória RAM");
        question4.addAnswer("B", "Disco rígido");
        question4.addAnswer("C", "CPU");
        question4.addAnswer("D", "GPU");
        question4.setCorretcAnswer("C");

        Question question5 = new Question(10, "O que significa SQL na área de banco de dados?", 5);
        question5.addAnswer("A", "Secure Query Language");
        question5.addAnswer("B", "Structured Query Language");
        question5.addAnswer("C", "System Quality Level");
        question5.addAnswer("D", "Standard Question Logic");
        question5.setCorretcAnswer("B");

        quiz1.addQuestion(question1);
        quiz1.addQuestion(question2);
        quiz1.addQuestion(question3);
        quiz1.addQuestion(question4);
        quiz1.addQuestion(question5);

        quiz1.setPrintWelcome(user1.getUserName()+" Seja bem-vindo ao nosso Quiz de Tecnologia! \uD83D\uDE80\n" +
                "Prepare-se para testar seus conhecimentos, explorar curiosidades do mundo tech e se desafiar com perguntas instigantes. Independentemente do resultado, o mais importante é se divertir e aprender algo novo.\n" +
                "Boa sorte e que a inovação esteja ao seu lado! \uD83D\uDCA1\uD83D\uDD0D\uD83D\uDCBB\n");
    quiz1.setPrintExit(user1.getUserName()+" Parabéns por concluir o Quiz de Tecnologia! \uD83D\uDE80\n" +
            "Esperamos que tenha se divertido e aprendido algo novo. Obrigado por participar e até a próxima! \uD83C\uDF89\uD83D\uDCA1\n");

        quiz1.play();
    }
}