package week2.day1.assignments;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println("Book Added successfully");
		
		return bookTitle;
		
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");

	}
	
	public static void main(String[] args) {
		
		Library bookDetails = new Library();
		String addedBook= bookDetails.addBook("Harry Potter and the Sorcerer's Stone");
		System.out.println("Returned Book Title " + addedBook);
		
		bookDetails.issueBook();
	}

}
