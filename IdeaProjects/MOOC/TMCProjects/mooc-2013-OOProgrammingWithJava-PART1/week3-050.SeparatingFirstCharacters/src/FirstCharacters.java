import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();

        firstThreeChars(name);
    }

    public static void firstThreeChars(String string) {
        int lengthChange = 3;
        if (string.length() == 2) {
            lengthChange = 2;
        } else if (string.length() == 1) {
            lengthChange = 1;
        }
        else if(string.length()==0){
            System.out.println("no input made");
        }
        else {
            for (int i = 0; i < lengthChange; i++) {
                System.out.println(i + 1 + ". Character: " + string.charAt(i));
            }
        }
    }
}
