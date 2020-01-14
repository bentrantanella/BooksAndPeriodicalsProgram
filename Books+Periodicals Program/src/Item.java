
abstract class Item implements Comparable<Item> {
	private String title;
	public Item(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public abstract String print();
	
	public abstract String getInfo();
}
