
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String in=null;

        while(true){
            System.out.println("Type the password:");
            in = reader.nextLine();
            System.out.println("Wrong!");
            if(in.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
        }
        // Write your code here
    }
}
