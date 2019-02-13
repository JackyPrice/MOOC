import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number:");
        double in1 = Double.parseDouble(reader.nextLine());

        System.out.println("Type the second number:");
        double in2 = Double.parseDouble(reader.nextLine());

        if (in1 > in2) {
            System.out.println("Greater number: " + in1);
        } else if (in2 > in1) {
            System.out.println("Greater number: " + in2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }

}
