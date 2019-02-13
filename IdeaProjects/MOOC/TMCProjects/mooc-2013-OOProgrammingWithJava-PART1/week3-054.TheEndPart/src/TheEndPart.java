import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

                System.out.print("Type a word: ");
        String endInput = reader.nextLine();
        int inputLength = endInput.length();
        System.out.print("Length of the end part: ");
        int endLength = Integer.parseInt(reader.nextLine());
        String endPart = endInput.substring((inputLength - endLength), inputLength);
        System.out.println("Result: " + endPart);
    }
}


//
//        /*END PART*/
//        System.out.print("Type a word: ");
//        String endInput = reader.nextLine();
//        int inputLength = endInput.length();
//        System.out.print("Length of the end part: ");
//        int endLength = Integer.parseInt(reader.nextLine());
//        String endPart = endInput.substring((inputLength - endLength), inputLength);
////        System.out.println("Result: " + endPart);
//    }
//            }

//        System.out.println("Length of the first part: " + startLength);
////        String first = firstPart(startInput, startLength);
//        System.out.print("\nResult: " + first);


//        String endInput = input();
//        System.out.print("\nLength of the end part:");
//        int endLength = Integer.parseInt(reader.nextLine());
//        String end = endPart(endInput, endLength);
//        System.out.print("\nResult: " + end);
//
//        System.out.print("\nType the first word:");
//        String firstWord = reader.nextLine();
//        System.out.print("\nType the second word:");
//        String secondWord = reader.nextLine();
//        wordInsideAWord(firstWord, secondWord);
//
//        System.out.print("\nType in your text: ");
//        String text = reader.nextLine();
//        System.out.print("\nIn reverse order: ");
//        System.out.println(reverse(text));

//    }

//    public static String input() {
//        System.out.print("\nType a word: ");
//        String input = reader.nextLine();
//        return input;
//    }

//    public static String firstPart(String string, int length){
//        String output = string.substring(0,length);
////        System.out.println("Length of the first part: " + length);
//        return output;
//}

//    public static String endPart(String string, int length) {
//        String output = string.substring(string.length() - length, string.length());
////        System.out.println("Length of the first part: " + length);
//        return output;
//    }

//    public static void wordInsideAWord(String first, String second) {
//
//
//        int index = first.indexOf(second);
//        if (index == -1) {
//            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.");
//        } else if (second.length() == 1) {
//            System.out.println("The character '" + second + "' is not found in the word '" + first + "'.");
//        } else {
//            System.out.println("The word '" + second + "' is found in the word '" + first + "'.");
//        }
//    }
//
//    public static String reverse(String text) {
//        String reverse = "";
//        for (int i = text.length() - 1; i > 0; i--) {
//            reverse += text.charAt(i);
//        }
//        return reverse;
//    }
//}
