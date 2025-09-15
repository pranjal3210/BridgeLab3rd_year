package this_static_final_key_words_and_instanceof_Operator.LibraryManagementSystem;

class LibraryService {
    private static String libraryName;

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static String getLibraryName() {
        return libraryName;
    }
}
