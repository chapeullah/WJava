package Practice.OOP.Controller;

import Practice.OOP.Model.Book;
import Practice.OOP.Model.Library;

public class BookController {
    public static void main(String[] args) {
        Book book1 = new Book("Java", 128);
        Book book2 = new Book("Cpp", 329);
        Book book3 = new Book("Python", 9);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Москвская публичная библиотека", 1967, books);
        library.displayInfo();
    }
}
