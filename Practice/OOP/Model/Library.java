package Practice.OOP.Model;

public class Library {
    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }
    public void displayInfo() {
        System.out.println(this.year + " " + this.name + "\nДоступные книги:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }
}
