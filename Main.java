public class Main {

    public static void main(String[] args) {

        // Create the library
        Library library = new Library();

        // Create books
        Book book1 = new Book("Things Fall Apart", "Chinua Achebe");
        Book book2 = new Book("The River Between", "Ngugi wa Thiong'o");
        Book book3 = new Book("The River and the Source", "Margaret Ogola");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Borrow one book
        book2.borrowBook();

        // Display all books
        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
        library.displayBooks();
    }
}