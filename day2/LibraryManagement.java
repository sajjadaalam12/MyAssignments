package week1.day2;

public class LibraryManagement {
	 public static void main(String[] args) {

		 Library library = new Library();
	     
	     String addedBook = library.addBook("Rich Dad Poor Dad");
	     System.out.println("Added Book: " + addedBook); 
	     
	     library.issueBook();
	 }
}
