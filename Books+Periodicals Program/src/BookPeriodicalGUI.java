import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class BookPeriodicalGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new BookPeriodicalGUI();
		frm.setTitle("Books and Periodicals");
		frm.setSize(300, 300);
		frm.setVisible(true);
		
		

	}
	
	
	JButton addItemButton = addButton("Add Item",1,1,1,1);
	JButton printAllButton= addButton("Print all",2,1,1,1);
	JButton compareButton = addButton("Compare Items",3,1,1,1);
	
	ArrayList<Item> itemslist = new ArrayList<Item>();
	
	public void buttonClicked(JButton button) {
		if (button == addItemButton) {
			Input i = new Input(this, itemslist);
			i.setVisible(true);
			
			
		}
		
		if (button == printAllButton) {
			String output = "";
			
			for(Item a : itemslist) {
				output += a.print();
			}
			  
			messageBox(output);
		}
		
		if (button == compareButton) {
			Compare c = new Compare(this, itemslist);
			c.setVisible(true);
		}
	}

}
