
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) { System.out.print(y + " ");
        } System.out.print(x);


        //88.1
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        //88.2
        Scanner reader = new Scanner(System.in);
        String name ="";
        String studentNumber;
        do {
            System.out.print("name: ");
            name = reader.nextLine();
            System.out.print("student number: ");
            studentNumber = reader.nextLine();
            Student student1 = new Student(name, studentNumber);
        }while(name!="");

//        System.out.print("name: ");
//        name = reader.nextLine();
//        System.out.print("student number: ");
//        studentNumber = reader.nextLine();
//        Student student2 = new Student(name, studentNumber);
//
//        System.out.print("name: ");
//        name = reader.nextLine();
//        System.out.pr=int("student number: ");
//        studentNumber = reader.nextLine();
//        Student student3 = new Student(name, studentNumber);
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        System.out.println(student3.toString());


    }
}
