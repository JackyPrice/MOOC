import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int factorial = 1;

        System.out.println("Type a number:");
        int n = Integer.parseInt(reader.nextLine());

        while (n >= 1) {
            factorial *= n;
            n--;
        }

        System.out.println("Factorial is: " +factorial);
    }
}
