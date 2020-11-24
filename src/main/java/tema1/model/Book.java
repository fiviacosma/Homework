package tema1.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

    int numberOfPages;
    String nameOfBook;

    public Book(int numberOfPages, String nameOfBook) {
        this.numberOfPages = numberOfPages;
        this.nameOfBook = nameOfBook;

    }


    List<Book> listOfBooks = new ArrayList<Book>();

    public void addBook(Book book) {
        listOfBooks.add(book);

    }

    public void deleteBook(Book book) {
        listOfBooks.remove(book);

    }

    public void listBooks() {
        for (int i = 0; i <= listOfBooks.size() - 1; i++) {
            System.out.println(listOfBooks.get(i).toString());
        }

    }

}
