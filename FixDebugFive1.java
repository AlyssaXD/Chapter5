package debugging;

import javax.swing.JOptionPane;

public class FixDebugFive1 
{

	public static void main(String[] args) 
	{
	final double HIGH_PRICE = 2.59;
	final double MED_PRICE = 1.99;
	final double LOW_PRICE = 0.89;
	
	String userChoiceString;
	boolean userChoice;
	double bill = 0.0;
	userChoiceString = JOptionPane.showInputDialog(null, "Order please\n1 - Burger\2 - Hotdog" + "\n3 - Grilled cheese\n4 - Fish sandwich");
	int usersChoice = Integer.parseInt(userChoiceString);
	if(userChoice = (1 | usersChoice) == 2);
		bill = bill + HIGH_PRICE;
		bill = bill + MED_PRICE;
	userChoiceString = JOptionPane.showInputDialog(null, "Fries with that?");
	}

}
