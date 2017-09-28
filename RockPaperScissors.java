package exercises;

import javax.swing.JOptionPane;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		for(int x = 0; x<5;++x)
		{
			displayRPS();
		}	
	
	}
	public static void displayRPS()
	{
		String userEntryString;
		String result = null;
		int userEntry;
		Random rand = new Random();
		int r = rand.nextInt(3) + 1;
		userEntryString = JOptionPane.showInputDialog(null, "Welcome to rock, paper, scissors.\n1 = Rock\n2 = Paper\n3 = Scissors");
		userEntry = Integer.parseInt(userEntryString);
		
		if(userEntry == 1)//Rock
		{
			if(r == 3)//Scissors
				result = "You Win!";
			if(r == 2//Paper
				result = "You Lose!";
			if(r== 1)//Rock
				result = "Tie";	
		}
		if(userEntry == 2)//Paper
		{
			if(r == 3)//Scissors
				result = "You Lose!";
			if(r == 2//Paper
				result = "Tie";
			if(r== 1)//Rock
				result = "You Lose!";	
		}
		if(userEntry == 3)//Scissors
		{
			if(r == 3)//Scissors
				result = "Tie";
			if(r == 2//Paper
				result = "You Lose!";
			if(r== 1)//Rock
				result = "You Win!";	
		}
		
		JOptionPane.showMessageDialog(null, ""+ result);
	}

}
