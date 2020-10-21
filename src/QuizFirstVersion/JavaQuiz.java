package QuizFirstVersion;

public class JavaQuiz {

    public static void main(String[] args) {
        MultipleChoiceQuestion question = new MultipleChoiceQuestion(
                "What happened in 1815?",
                "Discovery of America",
                "Chilean coup d'état (Salvador Allende)",
                "Storming of the Bastille",
                "Battle of Waterloo",
                "Assassination of John Lennon",
                "D");
        question.check();

        question = new MultipleChoiceQuestion("Which is the only DC superhero among the following?",
                "Venom",
                "Doctor Manhattan",
                "The Mask",
                "Hell Boy",
                "Capitan America",
                "B");
        question.check();

        question = new MultipleChoiceQuestion("Which one was Studio Ghibli's debut film?",
                "Laputa: Castel in the Sky",
                "Princess Mononoke",
                "Grave of the Fireflies",
                "Porco Rosso",
                "Howl's Moving Castle",
                "A");
        question.check();

        question = new MultipleChoiceQuestion("The real name of the protagonist of: Murder, She Wrote",
                "Susan Sarandon",
                "Angela Merkel",
                "Angela Lansbury",
                "Jane Fonda",
                "Glenn Close",
                "C");
        question.check();

        question = new MultipleChoiceQuestion("Which city is famous for its mechanically animated astronomical clock?",
                "Rome",
                "Paris",
                "Johannesburg",
                "Sarasota",
                "Prague",
                "E");
        question.check();


        Question truefalsequestion = new TrueFalseQuestion("Was \"V for Vendetta\" based on a comic?", "TRUE");
        truefalsequestion.check();

        truefalsequestion = new TrueFalseQuestion("Was Morrisey the front-man of the musical group \"The Smiths\"?", "TRUE");
        truefalsequestion.check();

        truefalsequestion = new TrueFalseQuestion("Is HTML a programming language?", "FALSE");
        truefalsequestion.check();

        truefalsequestion = new TrueFalseQuestion("Is the theremin a musical instrument that is played by moving the hands in the air?", "TRUE");
        truefalsequestion.check();

        truefalsequestion = new TrueFalseQuestion("Is Tim Curry the \"Man On The Moon\" lead actor?", "FALSE");
        truefalsequestion.check();

        Question.showResults();

    }

}
