
//Description: Mastermind is a game where the computer chooses colors 
//at random, where any color can be chosen more than once, out of six.
//The goal of the user is to guess the colors generated by the computer
//within 10 attempts. If the user guesses all four colors correctly in
//the correct positions within 10 attempts then they win the game. If 
//the user loses, then the computer tells the user the correct colors 
//and their correct positions.  

import java.util.*;

public class Mastermind 
{	
	public static void main(String[] args) 
	{
		//list of colors in the game		
		String[] color = {"black", "white", "green", "red", "blue", "yellow"};
		
		//randomly generated colors from array
		String n1 = color[(int) (Math.random() * (6))];
		String n2 = color[(int) (Math.random() * (6))];
		String n3 = color[(int) (Math.random() * (6))]; 
		String n4 = color[(int) (Math.random() * (6))];
		
		//variables for the user to enter colors
		String int1 = "";
		String int2 = "";
		String int3 = "";
		String int4 = "";
		
		//counter for checking if the user ran out of attempts or won the game
		int count = 0;
		
		//variables to check how many user guesses are correct every round
		int perfect = 0;
		int close = 0;
		int no = 0;
				
		//total attempts
		int attemptsLeft = 10;
		
		//scanner class imported
		Scanner in = new Scanner(System.in);		
		
		System.out.println("You have ten attempts to guess the four colors correctly!");
		
		//do while loop so the user can play the game at least once 
		do
		{
			//reset variables
			perfect = 0;
			close = 0;
			no = 0;

			System.out.print("\n\n\nNEW ATTEMPT"
							+ "\n" + attemptsLeft + " attempt(s) left to guess the color correctly");
			attemptsLeft--;
			
			//take user guesses
			System.out.print("\nEnter your guess for the first color: ");
			int1 = in.nextLine();
			
			System.out.print("\nEnter your guess for the second color: ");
			int2 = in.nextLine();
			
			System.out.print("\nEnter your guess for the third color: ");
			int3 = in.nextLine();
			
			System.out.print("\nEnter your guess for the fourth color: ");
			int4 = in.nextLine();
			
			//check if all four of them were guessed correctly or else
			if(n1.equalsIgnoreCase(int1) && n2.equalsIgnoreCase(int2) && 
					n3.equalsIgnoreCase(int3) && n4.equalsIgnoreCase(int4))
			{
				perfect = 4;
				attemptsLeft = 0;
			}
			else
			{		
				//else run through and see which are in the perfect place
				//or which are the right color in the wrong place 
				//or which are completely incorrect
				
				//for the first guess
				if(n1.equalsIgnoreCase(int1))
				{
					perfect++;
				}
				else if (n1.equalsIgnoreCase(int2) || n1.equalsIgnoreCase(int3) || n1.equalsIgnoreCase(int4))
				{
					close++;
				}
				else 
				{
					no++;
				}
				
				//for the second guess
				if(n2.equalsIgnoreCase(int2))
				{
					perfect++;
				}
				else if (n2.equalsIgnoreCase(int1) || n2.equalsIgnoreCase(int3) || n2.equalsIgnoreCase(int4))
				{
					close++;
				}
				else 
				{
					no++;
				}
				
				//for the third guess
				if(n3.equalsIgnoreCase(int3))
				{
					perfect++;
				}
				else if (n3.equalsIgnoreCase(int1) || n3.equalsIgnoreCase(int2) || n3.equalsIgnoreCase(int4))
				{
					close++;
				}
				else 
				{
					no++;
				}
				
				//for the fourth guess
				if(n4.equalsIgnoreCase(int4))
				{
					perfect++;
				}
				else if (n4.equalsIgnoreCase(int1) || n4.equalsIgnoreCase(int2) || n4.equalsIgnoreCase(int3))
				{
					close++;
				}
				else 
				{
					no++;
				}
					
			}
			System.out.print("\nPerfect guesses: " + perfect
								+ "\nClose guesses: " + close
								+ "\nIncorrect guesses: " + no);
			count++;
		} while((attemptsLeft != 0));
		
		//check if the user ran out of attempts or if the user won the game
		if(count > 9)
		{
			System.out.println("\n\nOh no! You lost!");
			System.out.println("The correct first color was " + n1);
			System.out.println("The correct second color was " + n2);
			System.out.println("The correct third color was " + n3);
			System.out.println("The correct fourth color was " + n4);
		}
		else
		{
			System.out.print("\n\nGOOD JOB! YOU WON!");
		}
		
		in.close();//close scanner
		
	}//end of main method
	

}//end of class
