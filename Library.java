i   mport java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> availableBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();
    private Map<Book, String> renters = new HashMap<>();

    public Book getABook(Book book, String name) {
        if (availableBooks.contains(book) == true) {
            availableBooks.remove(book);
            reservedBooks.add(book);
            renters.put(book, name);
        } else {
            System.out.println("This book is currently unavailable.");
            return null;
        }

        return book;
    }

    public void reserveABook(Book book) {
        if (availableBooks.contains(book) == true) {
            availableBooks.remove(book);
            reservedBooks.add(book);
        } else {
            System.out.println("This book is currently unavailable.");
        }
    }

    public void addABook(Book book) {
        availableBooks.add(book);
    }

    public void returnABook(Book book) {
        if (reservedBooks.contains(book) == true) {
            if (renters.containsKey(book) == true) {
                renters.remove(book);
            }
            availableBooks.add(book);
            reservedBooks.remove(book);
        } else {
            System.out.println("You cant' return book which is already in the library or wasn't ever the library.");
            return;
        }
    }
}
