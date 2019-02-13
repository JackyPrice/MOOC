import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";

        while (password.length()<this.length){
            password += this.alphabet[this.random.nextInt(25)];
        }
        return password;
    }
}
