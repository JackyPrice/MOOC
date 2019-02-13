
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sumOfPowers = 0;
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());

        while(number>=0){
            sumOfPowers +=Math.pow(2,number);
            number--;
        }

        System.out.println("The result is: " + sumOfPowers);
    }
}
