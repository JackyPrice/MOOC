
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number");
        int int1 = Integer.parseInt(reader.nextLine());

        System.out.println("\nType another number");
        int int2 = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of numbers: " + (int1+int2));
        // Implement your program here. Remember to ask the input from user
    }
}
