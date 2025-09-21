package week2.day1.assignments;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
		Library bookDetails= new Library();
		String addedBook= bookDetails.addBook("Java Programming");
		System.out.println("Returned Book Title " + addedBook);
		
		bookDetails.issueBook();
	}

}
