
public class Book extends Item {
	private String author;
	public Book(String t, String a) {
		super(t);
		author = a;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String print() {
		return "Title: " + getTitle() + "\n" + "Author: " + author + "\n" + "\n";
	}

	@Override
	public int compareTo(Item o) throws ClassCastException{
		if (o instanceof Periodical) {
			throw new ClassCastException("Cannot compare a book to a periodical");
		}
		
		Book b = (Book) o;
		
		return author.compareTo(b.getAuthor());
	}
}
