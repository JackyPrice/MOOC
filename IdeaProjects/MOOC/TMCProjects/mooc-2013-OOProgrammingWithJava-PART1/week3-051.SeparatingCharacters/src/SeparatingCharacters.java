
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        seperateCharacters(name);
    }


    public static void seperateCharacters(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(i+1 + ". character: " + string.charAt(i));
        }
    }
}