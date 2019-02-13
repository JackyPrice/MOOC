import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        /*
        *
            Add - adds a bird
            Observation - adds an observation
            Statistics - prints all the birds
            Show - prints one bird
            Quit - terminates the program
        * */
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        String name;
        String latinName;
        boolean proceed = true;
        BirdDatabase birdDatabase = new BirdDatabase();



        // DOES NOT ACCEPT THE USE OF SWITCH STATEMENTS!

        while (proceed == true) {

            System.out.print("?");
            userChoice = scanner.nextLine();

            if (userChoice.toLowerCase().equals("add")) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Latin name: ");
                latinName = scanner.nextLine();
                Bird birdAdd = new Bird(name,latinName);
                birdDatabase.addBird(birdAdd);
            } else if (userChoice.toLowerCase().equals("observation")) {
                System.out.print("What was observed:?");
                name = scanner.nextLine();
                birdDatabase.searchAndObserve(name);
            } else if (userChoice.toLowerCase().equals("show")) {
                System.out.print("What?");
                name = scanner.nextLine();
                birdDatabase.showBird(name);
            }else if (userChoice.toLowerCase().equals("statistics")) {
                birdDatabase.Statistics();
            } else if (userChoice.toLowerCase().equals("quit")) {
                proceed = false;
            }
        }


    }

}
