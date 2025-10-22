package SU2.LibraryItems;

public class Magazine extends LibraryItem {
    int issueNumber;
    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }
    public void displayInfo() {
        System.out.println("Magazine: " + title + " #" + issueNumber);
    }
}

