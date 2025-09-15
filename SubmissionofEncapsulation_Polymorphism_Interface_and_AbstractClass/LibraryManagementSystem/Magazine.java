package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.LibraryManagementSystem;

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String publisher) {
        super(itemId, title, publisher);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }
}
