import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = null;
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            input = reader.nextLine();
            if(input.isEmpty()){
                break;
            }
            words.add(input);
        }
        Collections.reverse(words);

        for(String word : words){
            System.out.println(word);
        }
    }
}
