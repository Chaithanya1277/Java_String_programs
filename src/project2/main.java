package project2;

public class main {
		    public static void main(String[] args) {
		        Library library = new Library();

		      
		        Book b1 = new Book("101", "Java Basics", "James Gosling");
		        Book b2 = new Book("102", "Python Basics", "Guido van Rossum");
		        Book b3 = new Book("103", "HTML and CSS", "John Smith");
		        Book b4 = new Book("104", "SQL Fundamentals", "Robert Brown");
		        Book b5 = new Book("105", "Data Structures", "Mark Allen");
		        library.addBook(b1);
		        library.addBook(b2);
		        library.addBook(b3);
		        library.addBook(b4);
		        library.addBook(b5);
		        Borrower br1 = new Borrower(101, "chaithu");
		        Borrower br2 = new Borrower(102, "chandhu");
		        Borrower br3 = new Borrower(103, "pavan");

		        library.registerBorrower(br1);
		        library.registerBorrower(br2);
		        library.registerBorrower(br3);

		        System.out.println("Available Books:");
		        System.out.println(library.listAvailableBooks());

		        System.out.println("\nCheckout 101 by chaithu:");
		        System.out.println(library.checkoutBook("101", 101));

		        System.out.println("\nCheckout 103 by chaithu:");
		        System.out.println(library.checkoutBook("103", 101));

		        System.out.println("\nCheckout 102 by chandhu:");
		        System.out.println(library.checkoutBook("102", 102));

		        System.out.println("\nAvailable Books after Checkout:");
		        System.out.println(library.listAvailableBooks());

		        System.out.println("\nBooks borrowed by chaithu:");
		        System.out.println(library.listBorrowedBooks(101));

		        
		        System.out.println("\nReturning 101:");
		        System.out.println(library.returnBook("101"));

		        System.out.println("\nAvailable Books after Returning 101:");
		        System.out.println(library.listAvailableBooks());

		        System.out.println("\nBooks currently borrowed by chaithu:");
		        System.out.println(library.listBorrowedBooks(101));
		    }


	}

