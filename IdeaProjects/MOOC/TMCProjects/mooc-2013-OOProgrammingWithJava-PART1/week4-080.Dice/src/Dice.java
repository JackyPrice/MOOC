import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) { //create dice object with n sides
        this.numberOfSides = numberOfSides;
    }

    public int roll() { //roll dice
        return random.nextInt(this.numberOfSides)+1;
    }
}
