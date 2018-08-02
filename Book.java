package lti.lib;

public class Book {
	private String title;
	private Member member;
	
	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void memberDetails() {
		if(member != null)
			System.out.println(title + " is issued to " + member.getName());
		else
			System.out.println(title + " not issued to any member");
	}
	
	public void issueBook(Member mbr) {
		if(member != null)
			System.out.println(title + " is already issued to " + member.getName());
		else {
			mbr.setBook(this);
			this.member = mbr;
			System.out.println(title + " issued to " + member.getName());
		}
	}
	
	public void returnBook(Member mbr) {
		if(member == null || !member.getName().equals(mbr.getName()) ||
				mbr.getBook() == null)
			System.out.println(title + " not issued to " + mbr.getName());
		else {
			mbr.setBook(null);
			this.member = null;
			System.out.println(title + " is returned by " + mbr.getName());
		}
	}
}
