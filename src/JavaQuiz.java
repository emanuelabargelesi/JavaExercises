import javax.swing.JOptionPane;


public class JavaQuiz {

    public static int nQuestions = 0;
    public static int nCorrect = 0;

    public static void main(String[] args) {
        String[] questions = new String[]{
                "What happened in 1815?\n"
                        + "A. Discovery of America\n"
                        + "B. Chilean coup d'état (Salvador Allende)\n"
                        + "C. Storming of the Bastille\n"
                        + "D. Battle of Waterloo\n"
                        + "E. Assassination of John Lennon\n",

                "Which is the only DC superhero among the following?\n"
                        + "A. Venom\n"
                        + "B. Doctor Manhattan\n"
                        + "C. The Mask\n"
                        + "D. Hell Boy\n"
                        + "E. Capitan America\n",

                "What is the name of the most famous Mongol emperor?\n"
                        + "A. Hannibal\n"
                        + "B. Saladin\n"
                        + "C. Julius Caesar\n"
                        + "D. Joan of Arc\n"
                        + "E. Genghis Khan\n",

                "Which one was Studio Ghibli's debut film??\n"
                        + "A. Laputa: Castel in the Sky\n"
                        + "B. Princess Mononoke\n"
                        + "C. Grave of the Fireflies\n"
                        + "D. Porco Rosso\n"
                        + "E. Howl's Moving Castle\n"
        };

        String[] correctAnswers = new String[]{"D", "B", "E", "A"};


        while (nQuestions < 4) {
            checkQuestion(questions[nQuestions], correctAnswers[nQuestions]);
        }

        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }


    public static String askQuestion(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }


    public static void checkQuestion(String question, String correctAnswer) {
        String answer = askQuestion(question);
        nQuestions++;

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }
}
