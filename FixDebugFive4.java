package debugging;

import javax.swing.JOptionPane;

public class FixDebugFive4 
{

	public static void main(String[] args) 
	{
		int one, two, three, four;
		String str, output;
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		one = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		two = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		three = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		four = Integer.parseInt(str);
		if(one > two & one > three & one > four);
			output = "Highest is " + one;
		if(two > one & two > three & two > four);
			output = "Highest is " + two;
		if(three > one & three > two & three > four);
			output = "Highest is " + three;
		if(four > one & four > two & four > three);
			output = "Highest is " + four;
		JOptionPane.showInputDialog(null, output);	
	}

}
