
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number:");
            double in = Double.parseDouble(reader.nextLine());
            if(in<-30 || in>40){
                continue;
            }
            else{
                Graph.addNumber(in);
            }

        }

    }
}
