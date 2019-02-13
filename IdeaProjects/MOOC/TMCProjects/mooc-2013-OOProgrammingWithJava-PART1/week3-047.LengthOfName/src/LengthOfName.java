
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = calculateCharacters(name);
    }
    public static int calculateCharacters(String string){
        int length = string.length();
        System.out.println("Number of characters: " + length);
        return length;
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
