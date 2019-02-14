public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        int middle;
        if(searchedValue<array[beginning] || searchedValue>array[end]){
//            System.out.println("Value " + searchedValue + " is not in the array");
            return false;
        }

        while (true) {
            middle = (beginning + end) / 2;
            if (array[beginning]==searchedValue || array[end]==searchedValue || array[middle]==searchedValue) {
//                System.out.println("Value " + searchedValue + " is in the array");
                return true;
            }else if ((beginning == end) && (array[beginning] != searchedValue)) {
//                System.out.println("search did not return " + searchedValue);
                return false;
            } else if (searchedValue > array[middle]) {
//                System.out.println("search value is larger");
                beginning = middle+1;
//                System.out.println("beginning now equals " +beginning);
            } else if (searchedValue < array[middle]) {
//                System.out.println("search value is smaller");
                end = middle;
//                System.out.println("end now equals " + end);
            }

            // restrict the search area
        }

    }
}
