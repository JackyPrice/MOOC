
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]:");
        double in1 = Double.parseDouble(reader.nextLine());

        if (in1 >= 50) {
            System.out.println("Grade: 5");
        } else if (in1 >= 45) {
            System.out.println("Grade: 4");

        } else if (in1 >= 40) {
            System.out.println("Grade: 3");

        } else if (in1 >= 35) {
            System.out.println("Grade: 2");

        } else if (in1 >= 30) {
            System.out.println("Grade: 1");

        } else {
            System.out.println("Grade: failed");
        }

    }
}


