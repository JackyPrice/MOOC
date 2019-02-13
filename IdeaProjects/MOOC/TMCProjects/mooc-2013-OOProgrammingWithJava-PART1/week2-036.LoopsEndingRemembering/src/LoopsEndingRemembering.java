import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int input;
        int sum=0;
        int numOfNums=0;
        int numOfOdd=0;
        int numOfEven=0;
        System.out.println("Type numbers:");
        while(true){
            input = Integer.parseInt(reader.nextLine());

            if(input != -1){
                sum+=input;
                numOfNums++;
                if(Math.abs(input%2)==0){
                    numOfEven++;
                }
                else{
                    numOfOdd++;
                }
            }else if(input == -1){
                break;
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + numOfNums);
        System.out.println("Average: " + (double)sum/numOfNums);
        System.out.println("Even numbers: " + numOfEven);
        System.out.println("Odd numbers: " + numOfOdd);
    }
}
