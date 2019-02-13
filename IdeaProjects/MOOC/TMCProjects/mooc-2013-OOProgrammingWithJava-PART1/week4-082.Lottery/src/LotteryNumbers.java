import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {

        this.numbers.removeAll(numbers);
        // We'll format a list for the numbers
        while (this.numbers.size()<7) {
            int newNumber = (int)this.random.nextInt(39) + 1;
            if (containsNumber(newNumber)==true){
            continue;
            }
            else {
                this.numbers.add(newNumber);
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }

    }
}
