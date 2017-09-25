package exercises;

import java.util.Scanner;
public class DelgadosTacos2 
{

	public static void main(String[] args) 
	{
		int choice1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a 1 for taco or 2 for burrito >>>>>>");
		choice1 = input.nextInt();
			if(choice1 == 1)
			{
				System.out.println("You chose a Burrito.");
			}
			if(choice1 == 2);
			{
				System.out.println("You chose a Taco.");
			}
			if(choice1 >= 3 & choice1 <= 999);
			{
				System.out.println("I said 1 or 2 not " + choice1);
			}
			if(choice1 >= 1000 & choice1 <= 9999);
			{
				System.out.println("why the user was wrong");
			}
			if(choice1 <= 2147000000);
			{
				System.out.println("If they go any higher than 2147000000 then program will not work");
			}
	}

}
