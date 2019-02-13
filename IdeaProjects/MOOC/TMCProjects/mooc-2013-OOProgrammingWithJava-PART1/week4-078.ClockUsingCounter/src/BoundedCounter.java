public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value=0;
    }

    public void next() {
                if (this.value < upperLimit) {
            this.value++;
        } else {
            value = 0;
        }
    }

    public String toString() {

                if (value < 10) {
            return "0" + String.valueOf(value);
        } else {
            return String.valueOf(value);
        }

//        return String.valueOf(value);
    }


    /*78.3*/
//    private int value;
//    private int upperLimit;
//
//    public BoundedCounter(int upperLimit) {
//        this.value = 0;
//        this.upperLimit = upperLimit;
//
//    }
//
//    public void next() {
//
//        if (this.value <= upperLimit) {
//            this.value++;
//        } else {
//            value = 0;
//        }
//    }
//
//    public String toString() {
//        String output;
//
//        if (value < 10) {
//            output = "0" + String.valueOf(value);
//        } else {
//            output = String.valueOf(value);
//        }
//        return output;
//
//    }
//
    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        }
    }

    public int getUpperLimit() {
        return upperLimit;
    }
}
