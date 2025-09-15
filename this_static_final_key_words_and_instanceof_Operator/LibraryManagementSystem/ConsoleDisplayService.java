package this_static_final_key_words_and_instanceof_Operator.LibraryManagementSystem;

import this_static_final_key_words_and_instanceof_Operator.LibraryManagementSystem.LibraryService;

class ConsoleDisplayService {
    public void displayLibraryName() {
        System.out.println("Library Name: " + LibraryService.getLibraryName());
    }

    public void displayBookDetails(Object bookObject) {
        if (bookObject instanceof Book) {
            Book book = (Book) bookObject;
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }
}
