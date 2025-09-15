package this_static_final_key_words_and_instanceof_Operator.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        LibraryService.setLibraryName("Egmore Library");

        displayService.displayLibraryName();
        System.out.println();

        Book book1 = new Book("Effective Java", "Ayush Sharma", "978-0134685991");

        displayService.displayBookDetails(book1);
    }
}
