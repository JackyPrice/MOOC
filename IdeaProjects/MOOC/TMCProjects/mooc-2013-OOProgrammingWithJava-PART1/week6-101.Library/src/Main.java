import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here

        Library library = new Library();
        Book lotr = new Book("LOTR", "Allen & Unwin", 1969);
        Book goThrones = new Book("Song of Ice and Fire", "Bantam Books", 1996);
        Book altCar =  new Book("Altered Carbon", "Victor Gollancs Ltd", 2002);


        library.addBook(lotr);
        library.addBook(goThrones);
        library.addBook(altCar);
//        library.printBooks();

        ArrayList<Book> searchByTitle = library.searchByTitle("LO");
        for (Book book: searchByTitle) {
            System.out.println(book);
        }
        ArrayList<Book> searchByPublisher = library.searchByPublisher("Bantam");
        for (Book book: searchByPublisher) {
            System.out.println(book);
        }
        ArrayList<Book> searchByYear = library.searchByYear(2002);
        for (Book book: searchByYear) {
            System.out.println(book);
        }


    }
}
