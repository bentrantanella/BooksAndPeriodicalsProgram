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
	
	public void ButtonClicked(JButton button) {
		if (button == bookButton) {
			type = 'b';
			numLabel.setVisible(false);
			numField.setVisible(false);
			
		}
		
		if (button == periodicalButton) {
			type = 'p';
			authorLabel.setVisible(false);
			authorField.setVisible(false);
			
		}
		
		if (button == addButton) {
			if (type == 'b') {
				String title = titleField.getText();
				String author = authorField.getText();
				Book newbook = new Book(title, author);
				
				itemlist.add(newbook);
			} else {
				String title = titleField.getText();
				int num = numField.getNumber();
				Periodical newp = new Periodical(title, num);
				
				itemlist.add(newp);
				
			}
		}
	}

}
