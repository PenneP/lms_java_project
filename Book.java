public class Book {
	private String BookID, BookAuthor, BookTitle, BookGenre, BookPublisher;
	private int BookCopies;

	public Book(String bID, String  bAu, String bTi, String cat, String pub, int copy) {
		BookID = bID;
		BookAuthor = bAu;
		BookTitle = bTi;
		BookGenre = cat;
		BookPublisher = pub;
		BookCopies = copy;
	}
	public void setBookID(String ID) {		this.BookID = ID;	}
	public void setBookAuthor(String a) {		this.BookAuthor = a;	}
	public void setBookTitle(String t) {		this.BookTitle = t;	}
	public void setBookPublisher(String p) {		this.BookPublisher = p;	}
	public void setBookGenre(String g) {		this.BookGenre = g;	}
	public void setBookCopies(int cop) {		this.BookCopies = cop;	}

	public String getBookID() {		return BookID;	}
	public String getBookAuthor() {		return BookAuthor;	}
	public String getBookTitle() {		return BookTitle;	}
	public String getBookPublisher() {		return BookPublisher;	}
	public String getBookGenre() {		return BookGenre;	}
	public int getBookCopies() {		return BookCopies;	}
}
