
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
		return "Title: " + getTitle() + "\n" + "Author: " + author + "\n";
	}
}
