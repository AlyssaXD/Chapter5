package exercises;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int user;
		int response;
		Scanner input = new Scanner(System.in);
		int userEntry;
		int even;
		while(response == 1) 
		{
		
			System.out.println("Please enter a number>>>");
			user = input.nextInt();
			even = userEntry % 2;
		
			if(even == 0)
			{
				System.out.print("Your number is even");
			}
			else
			{
				System.out.print("This number is odd");
			}
		System.out.println("Would you like to enter another number? 1 for yes 2 for no>>>>>");
		response = input.nextInt();
		}
		System.out.println("You have exited the game.");
	}

}
