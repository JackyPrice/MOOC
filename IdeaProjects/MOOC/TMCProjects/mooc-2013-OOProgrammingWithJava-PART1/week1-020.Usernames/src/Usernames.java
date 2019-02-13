
import java.util.Scanner;

public class Usernames {


    public static void main(String[] args) {
        String usernameAlex = "alex";
        String usernameEmily = "emily";
        String passwordAlex = "mightyducks";
        String passwordEmily = "cat";
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username:");
        String userin = reader.nextLine();
        System.out.println("Type your password:");
        String passin = reader.nextLine();

        if ((userin.equals(usernameAlex) && passin.equals(passwordAlex)) || (userin.equals(usernameEmily) && passin.equals(passwordEmily))){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Username or password is invalid");
        }

    }
}
