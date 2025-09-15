package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book(301, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Magazine(302, "National Geographic", "Nat Geo Society"),
                new DVD(303, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            System.out.println("-------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                System.out.println("Availability: " + (((Reservable) item).checkAvailability() ? "Available" : "Unavailable"));
                ((Reservable) item).reserveItem();
                System.out.println("New Availability: " + (((Reservable) item).checkAvailability() ? "Available" : "Unavailable"));
            }
        }
    }
}
