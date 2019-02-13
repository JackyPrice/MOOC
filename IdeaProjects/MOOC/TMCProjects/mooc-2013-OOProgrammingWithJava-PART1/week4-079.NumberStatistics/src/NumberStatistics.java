
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        this.amountOfNumbers=0;
        this.sum = 0;

    }

    public void addNumber (int number){
//        statistics+=increase;
        this.sum += number;
        this.amountOfNumbers++;

    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }


    public int sum(){
        return sum;
    }


    public double average(){
        if (sum!=0 || amountOfNumbers>0) {
            return (double)sum/amountOfNumbers;
        }
        else{
            return 0;
        }

    }
}
