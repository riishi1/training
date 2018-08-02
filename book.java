package assignment;

public class book {

	private String title;
	private member member;

	public book() {

	}

	public book(String title) {
		return;
	}

	public member getmember() {
		return member;
	}
	public void setmember(member member) {
		this.member = member;
	}

	public void memberDetails() {
		if (member != null) {
			System.out.println(title + "is alreday issued to" + member.getname());
		} else {
			mbr.setbook(this);
			this.member = mbr;
			System.out.println(title + " issued to " + member.getname());
		}
	}

	public void returnbook(member mbr)
	{
		if(member==null || !member.getname().equals(mbr.getname()) || mbr.getbook()==null)
		{
			
			System.out.println(title + "not issued to " + mbr.getname());
		}
		else
		{
			mbr.setbook(null);
			this.member=null;
			System.out.println(title + " is returned by " + mbr.getname());
		}
	}
}
