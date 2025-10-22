package SU2.LibraryItems;

public abstract class LibraryItem {
    String title;
    LibraryItem(String title) {
        this.title = title;
    }
    public abstract void displayInfo();
}

