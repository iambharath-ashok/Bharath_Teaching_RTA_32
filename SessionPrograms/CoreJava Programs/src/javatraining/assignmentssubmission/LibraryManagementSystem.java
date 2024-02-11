package javatraining.assignmentssubmission;

import java.util.*;

//Create a Java program for a basic Library Management System using OOP principles. The system should have the following classes:
//
//        Book: This class represents a book with attributes like title, author, and publication year. It should have methods to display book details.
//        Student: This class represents a student with attributes like name, roll number, and a list of borrowed books. It should have methods to borrow and return books.
//        Library: This class manages the books in the library and the students who borrow them. It should have methods to add books to the library, display available books, allow students to borrow and return books, and display a student's borrowed books.
//
//        Requirements:
//
//        Create the Book class with appropriate attributes and methods.
//        Create the Student class with attributes and methods for borrowing and returning books.
//        Create the Library class that maintains a list of books and students.
//        Demonstrate inheritance by creating a ReferenceBook class that inherits from Book and has additional attributes like ISBN and reference section.
//
//        Implement a basic user interface in the DatabaseConnectorStaticBlock class to interact with the library system. Allow users to add books, add students, borrow and return books, and display information.
 class Students{
        String name;
        int rollNumber;
        String booksBorrowed;
        Students(String newName,int newRollNumber,String newBooksBorrowed){
            this.name = newName;
            this.rollNumber = newRollNumber;
            this.booksBorrowed = newBooksBorrowed;
        }
 }

 class Library {
     String[] arrayOfBooks;

     void registerStudents() {
         //-------------------------BOOK DETAILS-----------------------------------------
         String[] arrayOfBooks = {"Robinhood", "Planet of the Apes", "Crown", "JungleBook", "Pyramid:The Egypt Diamond"};
         ArrayList<String> bd = new ArrayList<String>(Arrays.asList(arrayOfBooks));
         Library newlibrary = new Library();
         boolean initialLoad = true;
         ArrayList<String> updatedList = null;
         newlibrary.listOfBooks(bd, initialLoad, updatedList);
//         ---------------------------------------------------------------------------------------

         ArrayList<Students> student = new ArrayList<Students>();
         Scanner scan = new Scanner(System.in);
         System.out.println("\nREGISTER FIRST TO CONTINUE!!");
         getVariables getVar = new getVariables();
         int length = 1;

         Students std = new Students(getVar.UserName(), getVar.rollNumber(), getVar.book());
         student.add(std);

         System.out.println("want to register more student : Y/N");
         String ans = scan.nextLine();

         if (ans.contains("Y") || ans.contains("y")) {
             for (int i = 0; i < length; i++) {
                 length += 1;
                 std = new Students(getVar.UserName(), getVar.rollNumber(), getVar.book());
                 student.add(std);
                 System.out.println("want to register more student: Y/N");
                 String ans1 = scan.nextLine();
                 if (ans1.contains("N") || ans1.contains("n")) {
                     break;
                 }

             }
         }

//----------------------------------STUDENT DETAILS -----------------------------------------------
         System.out.println("-----------Students Detail---------");
         System.out.println("Name" + "\t" + "RollNumber" + "\t" + "BorrowedBooks");
         for(Students students : student) {
             System.out.println(students.name + "\t\t" + students.rollNumber + "\t\t" + students.booksBorrowed);
         }
         System.out.println("\n\n---------------------------------------------------------------------");
         //----------------------------------------------------------------------------------------------
         System.out.print("FIND STUDENT DETAILS :\n");
         this.findStudents(student);
     }

     public void findStudents(ArrayList<Students> student) {
         Scanner scan = new Scanner(System.in);
         int transChoice = 0;
         System.out.println("Enter Student Name : ");
         String name = scan.nextLine();
         System.out.println("Enter Student Roll Number : ");
         int rn = scan.nextInt();
         for(int i = 0; i < student.size(); i++){
             if(name.equals(student.get(i).name) && rn == (student.get(i).rollNumber)) {
                 System.out.println("1.BORROW BOOKS");
                 System.out.println("2.RETURN BOOKS");
                 System.out.println("ENTER YOUR CHOICE : ");
                 transChoice = scan.nextInt();
                 break;
             }
             else{
                 System.out.println("User not available!!\nPlease check studentName and Rollnumber.");
             }
             }
         if(transChoice == 1){
             StudentFunctional sf = new StudentFunctional();
             ArrayList<String> newBorrowedBooks = null;
             ArrayList<String> bookList = new ArrayList<String>(Arrays.asList(sf.arrayOfBooks));
             for(int i = 0; i < student.size(); i++){
                 if(name.equals(student.get(i).name) && rn == (student.get(i).rollNumber)) {
                     student.get(i).booksBorrowed = sf.borrow(student);
                     System.out.println("-----------"+student.get(i).name.toUpperCase()+" 's DETAILS---------");
                     System.out.println("Name" + "\t" + "RollNumber" + "\t" + "BorrowedBooks");
                     System.out.println(student.get(i).name + "\t\t" + student.get(i).rollNumber + "\t\t" + student.get(i).booksBorrowed);
                     newBorrowedBooks = new ArrayList<String>(Arrays.asList(student.get(i).booksBorrowed.split(",")));
                     break;
                 }
             }
            listOfBooks(bookList, false,newBorrowedBooks);
         }
         else if(transChoice == 2){
             StudentFunctional sf = new StudentFunctional();
             ArrayList<String> returnedBooks = new ArrayList<String>(Arrays.asList(sf.returnBook().split(",")));
             ArrayList<String> bookList = new ArrayList<String>(Arrays.asList(sf.arrayOfBooks));
             bookList.removeAll(returnedBooks);
             listOfBooks(bookList,false, returnedBooks);
         }


     }

     void listOfBooks(ArrayList<String> bookList, boolean initialLoad, ArrayList<String> updatedList) {
         if(initialLoad){
             System.out.println("-------BOOK DETAILS------- ");
             for (String bookDetails : bookList) {
                 System.out.print(bookDetails + "\n");
             }
         }
         else {
             System.out.println("-------AVAILABLE BOOK DETAILS------- ");
             for(int i = 0; i < updatedList.size(); i++){
                 for (int j = 0; j < bookList.size(); j++){
                     bookList.remove(String.valueOf(updatedList.get(i)));
                 }
             }
             System.out.print(bookList + "\n");
         }
     }

 }

class getVariables{
    public  String UserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter StudentName :");
        return scan.nextLine();
    }

    public int rollNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student RollNumber : ");
        return scan.nextInt();
    }

    public String book() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter books to borrow (from above list): ");
        return scan.nextLine();
    }
}

class StudentFunctional{
    String[] arrayOfBooks = {"Robinhood", "Planet of the Apes", "Crown", "JungleBook", "Pyramid:The Egypt Diamond"};
    public  String borrow(ArrayList<Students> student) {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        String borrowingBooks = null;
        String initialborrowedBooks = "";
        System.out.println("Enter the name of the books with 'comma' seperated : ");
        String bookName = scan.nextLine();

        for(int i = 0; i < student.size(); i++){
            initialborrowedBooks = student.get(i).booksBorrowed;
        }
        ArrayList<String> bookList = new ArrayList<String>(Arrays.asList(bookName.split(",")));
        ArrayList<String> bd = new ArrayList<String>(Arrays.asList(this.arrayOfBooks));
        for(int i = 0; i < bd.size(); i++){
            for(int j = 0; j < bookList.size(); j++){
                if(!Objects.equals(bd.get(i), bookList.get(j))){
                     borrowingBooks =  bookName.concat(","+initialborrowedBooks);
                }
            }
        }
        System.out.println(borrowingBooks);
        return borrowingBooks;
    }

    public String returnBook() {
        Scanner scan = new Scanner(System.in);
        String returnedBooks = null;
        System.out.println("Enter the name of the Books to return \n if more than 1 use comma seperator.");
        return scan.nextLine();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("\n\n\t\t\tWELCOME TO THE LIBRARY MANAGEMENT SYSTEM");
        Library newlibrary = new Library();
        newlibrary.registerStudents();
    }
}

