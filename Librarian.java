
public class Librarian extends Account{
	
	
	public Librarian(String id, String pass, Person person) {
		super(id, pass, person);
	}

	public boolean addBook() {
		return true;
	}
	
}
