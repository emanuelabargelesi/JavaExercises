package QuizFirstVersion;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question).toUpperCase();
            if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
                answer = "FALSE";
            }
            if (answer.equals("T") || answer.equals("TRUE") ||answer.equals("Y") || answer.equals("YES")) {
                answer = "TRUE";
            }

            if (answer.equals("FALSE") || answer.equals("TRUE")) {
                return answer;
            }

            JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter TRUE or FALSE");
        }
    }

    public TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: "+ question;
        if(answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
            correctAnswer = "TRUE";
        }
        if(answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
            correctAnswer = "FALSE";
        }
    }

}
