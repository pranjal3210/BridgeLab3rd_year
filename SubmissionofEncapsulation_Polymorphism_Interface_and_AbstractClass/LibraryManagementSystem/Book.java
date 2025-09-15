package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.LibraryManagementSystem;

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days
    }

    @Override
    public void reserveItem() {
        if(checkAvailability()) {
            setIsAvailable(false);
            System.out.println("Book '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Book '" + getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getIsAvailable();
    }
}

