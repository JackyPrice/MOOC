import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        String reverse = ReverseString(name);
    }

public static String ReverseString(String string){
    System.out.print("In reverse order: " );
        String reverse = "";
        for(int i = string.length()-1; i>=0; i--){
            System.out.print(string.charAt(i));
            reverse += string.charAt(i);
        }
        return reverse;
    }


}
