public class Main {

    public static void main(String[] args) {
//        HangmanLogic logic = new HangmanLogic("parameter");

        String ab = "string";
        ab = ab.replace('r','T');
        System.out.println(ab);

        HangmanLogic logic = new HangmanLogic("kissa");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();

        System.out.println("guessing: A, D, S, F, D");
        logic.guessLetter("A");   // correct
        logic.guessLetter("D");   // wrong
        logic.guessLetter("S");   // correct
        logic.guessLetter("F");   // wrong
        logic.guessLetter("D");   // This should not have any effect on the number of faults since D was already guessed
        System.out.println("guessed letters: "+logic.guessedLetters());
        System.out.println("number of faults: "+logic.numberOfFaults());
        System.out.println(logic.hiddenWord());
    }
}
