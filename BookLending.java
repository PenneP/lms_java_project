import java.util.Date;

public class BookLending {
	private Date creationDate;
	private Date dueDate;
	private String memberID;
	
	public BookLending(Date cd, Date dd, String memID) {
		this.creationDate = cd;
		this.dueDate = dd;
		this.memberID = memID;
	}

}
