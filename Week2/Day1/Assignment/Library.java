package Week2.Day1.Assignment;

public class Library {
	public String addBook(String bookTitle) {
		// Here we are going print Book Added successfully and return booktitle
		System.out.println(bookTitle + " has been added successfully");
		return bookTitle;

	}
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book Issued Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library bookAdd = new Library();
		System.out.println(bookAdd.addBook("Book1"));
		bookAdd.issueBook();
	}
}
