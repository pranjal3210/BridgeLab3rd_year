package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.LibraryManagementSystem;

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String director) {
        super(itemId, title, director);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem() {
        if(checkAvailability()) {
            setIsAvailable(false);
            System.out.println("DVD '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("DVD '" + getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getIsAvailable();
    }
}
