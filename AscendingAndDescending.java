package exercises;

import java.util.Scanner;

public class AscendingAndDescending 
{

	public static void main(String[] args) 
	{
		int num1, num2, num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Users enters number 1");
		num1 = input.nextInt();
		System.out.print("Users enters number 2");
		num2 = input.nextInt();
		System.out.print("Users enters number 3");
		num3 = input.nextInt();
		
		if(num1< num2 && num1< num3)
		{
			if(num3 > num2)
				System.out.println(num1 +" "+ num2 +" "+ num3);
				System.out.println(num3 +" "+ num2 +" "+ num1);
		}
		if(num1> num2 && num1> num3)
		{
			if(num2 > num3)
				System.out.println(num1 +" "+ num2 +" "+ num3);
				System.out.println(num3 +" "+ num2 +" "+ num1);
		}
		if(num2> num1 && num2> num3)
		{
			if(num1 > num3)
				System.out.println(num2 +" "+ num1 +" "+ num3);
				System.out.println(num3 +" "+ num2 +" "+ num1);
		}	
		
		
	}

}
