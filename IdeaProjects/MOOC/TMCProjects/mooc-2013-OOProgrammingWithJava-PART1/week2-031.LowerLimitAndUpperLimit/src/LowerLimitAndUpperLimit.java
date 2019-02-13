
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int start = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int last = Integer.parseInt(reader.nextLine());

        while(start<=last){
            System.out.println(start);
            start++;
        }
        // write your code here

    }
}
