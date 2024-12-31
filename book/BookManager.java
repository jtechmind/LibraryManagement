package book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books;
    
    public BookManager(){
        this.books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book Added: "+book);
    }

    // Update book details

    // View all books
    public void viewBooks(){
        System.out.println("Available Books:");
        for(Book book: books){
            System.out.println(book);
        }
    }

    // Delete a book
    
}
