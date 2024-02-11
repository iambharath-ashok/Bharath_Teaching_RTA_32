package javatraining.assignments.oops.librarymanagement;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


}

class Student {
    private String name;
    private int rollNumber;
    private List<Book> borrowedBooks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned the book: " + book.getTitle());
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.displayDetails();
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }
}

class Library {
    private List<Book> books;
    private List<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added to the library: " + student.getName());
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }

    public void borrowBook(Student student, Book book) {
        student.borrowBook(book);
    }

    public void returnBook(Student student, Book book) {
        student.returnBook(book);
    }
}

class ReferenceBook extends Book {
    private String isbn;
    private String referenceSection;

    public ReferenceBook(String title, String author, int publicationYear, String isbn, String referenceSection) {
        super(title, author, publicationYear);
        this.isbn = isbn;
        this.referenceSection = referenceSection;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
        System.out.println("Reference Section: " + referenceSection);
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Student student1 = new Student("Bharath", 101);
        Student student2 = new Student("Ashok", 102);

        library.addStudent(student1);
        library.addStudent(student2);

        library.displayAvailableBooks();

        library.borrowBook(student1, book1);
        library.borrowBook(student2, book2);

        student1.displayBorrowedBooks();
        student2.displayBorrowedBooks();

        library.returnBook(student1, book1);

        student1.displayBorrowedBooks();
    }
}
