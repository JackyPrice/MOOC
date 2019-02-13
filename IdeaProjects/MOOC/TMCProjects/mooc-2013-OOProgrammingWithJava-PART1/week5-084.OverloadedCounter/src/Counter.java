public class Counter {

    private int startingValue;
    private boolean check;
    private int currentValue = startingValue;


    public Counter(){
    this(0,false);

    }
    public Counter(int startingValue){
        this(startingValue,false);
    }

    public Counter(boolean check){
        this(0,check);
    }

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.currentValue=startingValue;
        if(check==true){
            this.check = true;
        }
    }

    public int value(){
        return this.currentValue;
    }

    public void increase(){
        this.currentValue++;
    }

    public void increase(int increaseValue){
        if(increaseValue<0){}
        else{
        this.currentValue+=increaseValue;
    }}

    public void decrease(){
        currentValue--;
        if (check==true && currentValue < 0) {
            currentValue = 0;

        }
    }
    public void decrease(int decreaseValue) {
        if (decreaseValue < 0) {
        } else {

            this.currentValue -= decreaseValue;
            if (check==true && currentValue < 0) {
                currentValue = 0;
            }
        }
    }

    public String toString(){
        return "\nStarting Value: " + this.startingValue + "\nCurrent Value: " + value() + "\nCheck: " + this.check;
    }

}
