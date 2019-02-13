
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        int smallest;

        if(number1<number1){
            smallest=number1;
        }
        else if(number1>number2){
            smallest=number2;
        }
        else {
            smallest=number1;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
