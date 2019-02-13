
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int largest = 0;

        if (number1 > number2 && number1 >= number3) {
            largest = number1;
            System.out.println("number1");
        } else if (number2 > number1 && number2 >= number3) {
            largest = number2;
            System.out.println("number2");
        } else if (number3 > number1 && number3 >= number2) {
            largest = number3;
            System.out.println("number3");
        } else if (number1==number2 && number1==number3){
            largest=number1;
            System.out.println("all the same");
        }

        return largest;
    }

    public static void main(String[] args) {
        int result = greatest(1, 2, 3);
//        System.out.println("Greatest: " + result);
        result = greatest(1, 3, 2);
//        System.out.println("\nGreatest: " + result);
        result = greatest(3, 1, 2);
//        System.out.println("\nGreatest: " + result);
        result = greatest(4, 4, 1);
//        System.out.println("\nGreatest: " + result);
        result = greatest(4, 1, 4);
//        System.out.println("\nGreatest: " + result);
        result = greatest(1, 4, 4);
//        System.out.println("\nGreatest: " + result);
        result = greatest(4, 4, 4);
//        System.out.println("\nGreatest: " + result);


    }
}
