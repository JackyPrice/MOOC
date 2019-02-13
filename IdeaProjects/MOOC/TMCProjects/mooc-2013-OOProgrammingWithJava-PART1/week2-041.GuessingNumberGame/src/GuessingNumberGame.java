
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int choice = 0;
        int count = 0;
        while (choice!=numberDrawn){
            System.out.println("Guess a number");
            choice = Integer.parseInt(reader.nextLine());
            count++;
            if(choice<numberDrawn){
                System.out.println("The number is greater, guesses made: " + count);
            }
            else if(choice>numberDrawn){
                System.out.println("The number is lesser, guesses made: " + count);
            }
            else if(choice==numberDrawn){
                System.out.println("Congratulations, your guess is correct");
            }
        }
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
