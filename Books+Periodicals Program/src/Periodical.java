
public class Periodical extends Item implements Comparable{
	private int issnum;
	public Periodical(String t, int i) {
		super(t);
		issnum = i;
	}
	
	public int getNum() {
		return issnum;
	}
	
	public void setNum(int i) {
		issnum = i;
	}
	
	public String print() {
		return "Title: " + getTitle() + "\n" + "Issue number: " + issnum;
	}
	
}
