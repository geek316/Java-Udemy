package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level5HardProblem2 {
    static void main() {

//        24. ArrayList-Based Library System
//        Create a menu-driven program.
//            Books: ArrayList<String> books
//        Features:
//        Add book
//        Borrow book
//        Return book
//        Search book
//        Display all books

        ArrayList<String> books = new ArrayList<>();
        ArrayList<String> borrow = new ArrayList<>();

        LibrarySystem library = new LibrarySystem(books, borrow);

        library.addBooks("The Alchemist");
        library.addBooks("Rich Dad, Poor Dad");
        library.addBooks("You can sell");
        library.addBooks("Ikigai");
        library.addBooks("Essentialism");
        library.addBooks("Meditations");

        library.displayBooks();

        library.borrowBook("Essentialism");
        library.searchBooks("Essentialism");
        library.returnBook("Essentialism");



    }
}

class LibrarySystem {

    ArrayList<String> books;
    ArrayList<String> borrowed;

    public LibrarySystem(ArrayList<String> books, ArrayList<String> borrowed) {
        this.books = books;
        this.borrowed = borrowed;
    }

    public void addBooks(String book){
        books.add(book);
        System.out.println(book + " is added to library.");
    }

    public void borrowBook(String book) {
        books.remove(book);
        borrowed.add(book);
        System.out.println(book + " is borrowed");
    }

    public void returnBook(String book) {
        books.add(book);
        borrowed.remove(book);
        System.out.println(book + " is returned to library");
    }

    public void searchBooks(String book) {
        System.out.println(book + ", found in library? - " + books.contains(book));
    }

    public void displayBooks() {
        System.out.println("Books in library: " + books);
        System.out.println("Books borrowed: " + borrowed);
    }

}
