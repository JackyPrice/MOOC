import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();

        char lastChar = lastCharacter(name);

    }

    public static char lastCharacter(String string){
        char lastChar = string.charAt(string.length()-1);
        System.out.println("Last character: " + lastChar);
        return lastChar;
    }
}
