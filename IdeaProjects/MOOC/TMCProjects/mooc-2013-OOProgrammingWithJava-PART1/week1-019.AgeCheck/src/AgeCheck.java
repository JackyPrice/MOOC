
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        double in = Double.parseDouble(reader.nextLine());

        if(in>120 || in<0){
            System.out.println("impossible");
        }
        else{
            System.out.println("OK");
        }
    }
}
