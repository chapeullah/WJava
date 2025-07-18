package Practice.OOP.Model;

public class Book {
    
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getInfo() {
        return this.title + " (" + this.pages + " страниц)";
    }
}
