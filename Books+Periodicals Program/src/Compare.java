import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class Compare extends GBDialog{
	ArrayList<Item> itemlist = new ArrayList<Item>();
	
	public Compare(JFrame parent, ArrayList<Item>  items) {
		super(parent);
		setTitle("New input");
		setSize(500,500);
		
		itemlist = items;
		
		for(Item a : itemlist) {
			itemsCombo.addItem(a.getInfo());
		}
		
	}
	
	JLabel searchLabel = addLabel("Choose an item to compare:",1,1,1,1);
	JComboBox itemsCombo = addComboBox(1,2,1,1);
	JButton beforeButton = addButton("Items before",2,1,1,1);
	JButton sameButton = addButton("Same items",2,2,1,1);
	JButton afterButton = addButton("Items after",2,3,1,1);
	
	Item searchedItem;
	public void buttonClicked(JButton button) {
		if (button == beforeButton) {
			int compare;
			String output = "Items before selected item:" + "\n";
			
			for(Item a : itemlist) {
				if (a.getInfo().contentEquals((String) itemsCombo.getSelectedItem())) {
					searchedItem = a;
					break;
				}
			}
			
			System.out.println(searchedItem.getInfo());
			
			for(Item a : itemlist) {
				if (a == searchedItem) 
					continue;
				
				try {
					compare = searchedItem.compareTo(a);
				} catch(ClassCastException e) {
					continue;
				}
				
				if (compare < 0)
					output += a.print();
			}
			
			if (output.contentEquals("Items before selected item:" + "\n"))
				output = "There are no items before selected item";
			messageBox(output);
			
		}
		
		if (button == sameButton) {
			int compare;
			String output = "Items that are the same as selected item:" + "\n";
			
			for(Item a : itemlist) {
				if (a.getInfo().contentEquals((String) itemsCombo.getSelectedItem())) {
					searchedItem = a;
					break;
				}
			}
			
			for(Item a : itemlist) {
				if (a == searchedItem) 
					continue;
				
				try {
					compare = searchedItem.compareTo(a);
				} catch(ClassCastException e) {
					continue;
				}
				
				if (compare == 0)
					output += a.print();
			}
			
			if (output.contentEquals("Items that are the same as selected item:" + "\n"))
				output = "There are no items that are the same";
			messageBox(output);
		}
		
		if (button == afterButton) {
			int compare;
			String output = "Items after selected item:" + "\n";
			
			for(Item a : itemlist) {
				if (a.getInfo().contentEquals((String) itemsCombo.getSelectedItem())) {
					searchedItem = a;
					break;
				}
			}
			
			for(Item a : itemlist) {
				if (a == searchedItem) 
					continue;
				
				try {
					compare = searchedItem.compareTo(a);
				} catch(ClassCastException e) {
					continue;
				}
				
				if (compare > 0)
					output += a.print();
			}
			
			if (output.contentEquals("Items after selected item:" + "\n"))
				output = "There are no items after selected item";
			messageBox(output);
		}
	}
	
	
}
