import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        // Userinput until they input -1

        ArrayList<Integer> scores = userInput(scanner);
        GradeDistribution gradeDistribution = new GradeDistribution(scores);
        gradeDistribution.printAll();
    }

    public static ArrayList<Integer> userInput(Scanner scanner){
        System.out.println("Type exam scores, -1 completes");
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        int input = 0;
        while (input != -1) {
            input = scanner.nextInt();
            if(input>60 || input <-1){
                System.out.println("maximum score is 60, please input a score between 0-60");
            }
            else if (input == -1) {
                break;
            } else {
                userInput.add(input);
            }
        }
        return userInput;
    }
}
