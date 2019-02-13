
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int start = 0;
        int sum = 0;
        System.out.println("Until what?");
        int end = Integer.parseInt(reader.nextLine());

        while(start<=end){
            sum +=start;
            start++;
        }
        System.out.println(sum);
    }
}
