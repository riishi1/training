import lti.lib.Book;
import lti.lib.Member;

public class TestLibrary {
	public static void main(String[] args) {
		Book alc = new Book("The Alchemist");
		Member mbr = new Member("Polo");
		
		alc.memberDetails();
		mbr.issuedBook();
		
		alc.issueBook(mbr);
		
		alc.memberDetails();
		mbr.issuedBook();
		
		alc.issueBook(mbr);
		
		alc.returnBook(mbr);

		alc.returnBook(mbr);
	}
}
