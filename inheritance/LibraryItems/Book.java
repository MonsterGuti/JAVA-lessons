package SU2.LibraryItems;

public class Book extends LibraryItem {
    String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
