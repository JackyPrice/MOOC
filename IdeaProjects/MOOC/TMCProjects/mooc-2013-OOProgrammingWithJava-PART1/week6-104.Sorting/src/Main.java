
public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] array = {3, 2, 5, 1, 9};

        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(array));

        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }


    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }


    public static int indexOfTheSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfSmallest = index;
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
//        array[index1] = array[index2] + array[index1];
//        array[index2] = array[index2] - array[index1];
//        array[index1] = array[index1] - array[index2];

        int index1ValueBefore = array[index1];
        int index2ValueBefore = array[index2];
        array[index1] = index2ValueBefore;
        array[index2] = index1ValueBefore;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }
}

