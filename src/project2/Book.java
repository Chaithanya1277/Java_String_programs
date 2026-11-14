package project2;

public class Book {
	     String isbn;
	     String title;
	    String authorName;

	    public Book(String isbn, String title, String authorName) {
	        this.isbn = isbn;
	        this.title = title;
	        this.authorName = authorName;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }
	    public String toString() {
	        return isbn + " , " + title + " , " + authorName;

	}
	    public static void main(String[] args) {

	        Book b1 = new Book("123", "Java Basics", "James Gosling");
	        System.out.println("ISBN: " + b1.getIsbn());
	        System.out.println("Title: " + b1.getTitle());
	        System.out.println("Author: " + b1.getAuthorName());

}
}
