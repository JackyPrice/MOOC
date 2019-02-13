//import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;



public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book book) {
        this.library.add(book);
    }

    public void printBooks() {
        for (Book book : this.library) {
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> byTitle = new ArrayList<Book>();

        for (Book book : this.library) {
            if (StringUtils.included(book.title(),title)) {
                byTitle.add(book);
            }
        }
        return byTitle;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> byPublisher = new ArrayList<Book>();
        for (Book book : this.library) {
            if (StringUtils.included(book.publisher(), publisher)) {
                byPublisher.add(book);
            }
        }

        return byPublisher;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> byYear = new ArrayList<Book>();
        for (Book book : this.library) {
            if (book.year() == year) {
                byYear.add(book);
            }
        }
        return byYear;
    }



}
