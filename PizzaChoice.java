package exercises;

import java.util.Scanner;

public class PizzaChoice 
{

	public static void main(String[] args) 
	{
		String choiceYes;
		String toppingsChoice;
		String pizzaSize;
		String pizzaKind;
		String choiceHotDog;
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like a pizza? Yes or No?>>>>>> ");
		choiceYes = input.nextLine();
		//this is where I am asking if they really want a pizza
		if("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
				System.out.print("Please choose a size small, medium or large? >>>>>>");
				String size = input.nextLine();
				if("small".equals(size)|| "Small".equals(size))
				{
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
				}
				if("medium".equals(size)|| "Medium".equals(size))
				{
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
				}
				if("large".equals(size)|| "Large".equals(size))
				{
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
				}
		}	
			
	}
	public static void displayPizzaSize(String size)
	{
			System.out.println("You said " + size + " pizza size.");
	}
	public static void displayPizzaType()
	{
			Scanner input = new Scanner(System.in);
			System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Cheese?");
			String pizzaKind = input.nextLine();
			if(("Pepperoni".equals(pizzaKind) || "pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind)) ||
					"sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind) || "cheese".equals(pizzaKind))
			{
				
			}
	}
	public static void displayPrice(String size)
	{
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		if("small".equalsIgnoreCase(size))
			System.out.print(smallCost);
		if("medium".equalsIgnoreCase(size))
			System.out.print(mediumCost);
		if("large".equalsIgnoreCase(size))
			System.out.print(largeCost);

	}

}
