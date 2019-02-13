
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type a number:");
        double in1 = Double.parseDouble(reader.nextLine());

        if(Math.abs(in1)%2==1){
            System.out.println("number " + in1 + " is odd");
        }else{
            System.out.println("number " + in1 + " is even");
        }


    }
}
