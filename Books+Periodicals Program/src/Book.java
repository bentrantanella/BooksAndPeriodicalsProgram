
public class Book extends Item implements Comparable{
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
	
	public int compare(Item a) throws InvalidOperation{
		if (a instanceof Periodical) {
			throw new InvalidOperation("Cannot compare a book to a periodical");
		}
		
		Book b = (Book) a;
		
		return author.compareTo(b.getAuthor());
	}
}
