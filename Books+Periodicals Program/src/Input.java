import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class Input extends GBDialog{
	
	ArrayList<Item> itemlist = new ArrayList<Item>();
	
	public Input(JFrame parent, ArrayList<Item>  items) {
		super(parent);
		setTitle("New input");
		setSize(500,500);
		
		numLabel.setVisible(false);
		numField.setVisible(false);
		
		itemlist = items;
	}
	
	JButton bookButton = addButton("Book",1,1,1,1);
	JButton periodicalButton = addButton("Periodical",1,2,1,1);
	JLabel titleLabel = addLabel("Title:",2,1,1,1);
	JTextField titleField = addTextField("",2,2,1,1);
	JLabel authorLabel = addLabel("Author:",3,1,1,1);
	JTextField authorField = addTextField("",3,2,1,1);
	JLabel numLabel = addLabel("Issue number:",4,1,1,1);
	IntegerField numField = addIntegerField(0,4,2,1,1);
	JButton addButton = addButton("Add",5,1,1,1);
	
	char type = 'b';
	
	public void buttonClicked(JButton button) {
		if (button == bookButton) {
			type = 'b';
			numLabel.setVisible(false);
			numField.setVisible(false);
			authorLabel.setVisible(true);
			authorField.setVisible(true);
			
			titleField.setText("");
			authorField.setText("");
			
		}
		
		if (button == periodicalButton) {
			type = 'p';
			numLabel.setVisible(true);
			numField.setVisible(true);
			authorLabel.setVisible(false);
			authorField.setVisible(false);
			
			titleField.setText("");
			numField.setNumber(0);
			
		}
		
		if (button == addButton) {
			
			
			
			if (type == 'b') {
				
				if (isWhitespace(titleField.getText()) || isWhitespace(authorField.getText())) {
					messageBox("Invalid input");
					return;
				}
				
				String title = titleField.getText();
				String author = authorField.getText();
				Book newbook = new Book(title, author);
				
				itemlist.add(newbook);
				
				messageBox("You have added a book titled " + title);
				
			} else {
				
				if (isWhitespace(titleField.getText()) || numField.getNumber() < 0) {
					messageBox("Invalid input");
					return;
				}
				
				String title = titleField.getText();
				int num = numField.getNumber();
				Periodical newp = new Periodical(title, num);
				
				itemlist.add(newp);
				
				messageBox("You have added a periodical titled " + title);
			}
		}
	}
	
	public boolean isWhitespace(String s) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				return false;
		}
		return true;
	}

}
