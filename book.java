class Book {
    int bookId;
    int pages;

    // Constructor for Book class
    public Book(int bookId, int pages) {
        this.bookId = bookId;
        this.pages = pages;
    }
}

class FictionBook extends Book {
    String name;

    // Constructor for FictionBook class
    public FictionBook(int bookId, int pages, String name) {
        super(bookId, pages);
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of FictionBook
        FictionBook fictionBook = new FictionBook(123, 200, "The Great Novel");

        // Display member variables
        System.out.println("Book ID: " + fictionBook.bookId);
        System.out.println("Pages: " + fictionBook.pages);
        System.out.println("Name: " + fictionBook.name);
    }
}