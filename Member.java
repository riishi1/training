package lti.lib;

public class Member {
	private String name;
	private Book book;
	
	public Member() {
	}

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void issuedBook() {
		if(book != null)
			System.out.println(name + " issued " + book.getTitle());
		else
			System.out.println(name + " not issued any book");
	}
}
