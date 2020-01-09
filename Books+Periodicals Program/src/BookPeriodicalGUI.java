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
	
	JButton printBooksButton = addButton("Print Books",1,1,1,1);
	JButton printPeriodicalsButton = addButton("Print Periodicals",2,1,1,1);
	
	ArrayList<Item> itemslist = new ArrayList<Item>();
	
	public void buttonClicked(JButton button) {
		if (button == printBooksButton) {
			
		}
		if (button == printPeriodicalsButton) {
			
		}
	}

}
