package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.LibraryManagementSystem;

abstract class LibraryItem {
    // Encapsulated fields
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true; // Secured borrower data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration(); // in days

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author/Director: " + author);
    }

    // Getters and Setters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public boolean getIsAvailable() { return isAvailable; }
    protected void setIsAvailable(boolean available) { isAvailable = available; }
}
