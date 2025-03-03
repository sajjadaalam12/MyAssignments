package week1.day2;

public class Library {

	public String addBook(String bookTitle) {
     System.out.println("Book added successfully: " + bookTitle);
     return bookTitle;
	}

	public void issueBook() {
     System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {

		Library library = new Library();
     
		String addedBook = library.addBook("The Alchemist");
	    System.out.println("Added Book: " + addedBook); // Using the variable to avoid the warning

		library.issueBook();
	}
}



