
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        System.out.println("Type a number: ");
        Double in1 = Double.parseDouble(reader.nextLine());

        System.out.println("Type another number: ");
        Double in2 = Double.parseDouble(reader.nextLine());


        System.out.println("The bigger number of the two numbers given was: " + Math.max(in1, in2));;
    }
}
