import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics sumOfEven = new NumberStatistics();
        NumberStatistics sumOfOdd = new NumberStatistics();

        System.out.println("Type numbers: ");
        int input =0;
        while (input !=-1){

            input = reader.nextInt();
            if (input ==-1){
                break;
            }
            else if(input!=0){
                stats.addNumber(input);
                if(input%2==0){
                    sumOfEven.addNumber(input);
                }
                else{
                    sumOfOdd.addNumber(input);
                }
            }
        }
//        System.out.print("Amount: " + sumOfAll.amountOfNumbers());
        System.out.print("sum: " + stats.sum());
//        System.out.print("\nAverage: " + sumOfAll.average());
        System.out.print("\nsum of even: " + sumOfEven.sum());
        System.out.print("\nsum of odd: " + sumOfOdd.sum());
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
