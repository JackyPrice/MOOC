
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);

//        for(int i=100; i<=1000; i++){
//            for(int j =1; j<=100; j++){
//                System.out.print(i*j + " ");
//            }
//            System.out.println();
//        }
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
            // write code here
        }
    }
}
