package monster;

import model.MarshmallowMonster; 
import java.util.Scanner; //Need so that you can use a scanner.

public class MController
{
	//Data member/Declaration section
	// Without "new" (initializing) your program has nothing "null" (kills the program)
	private MarshmallowMonster myMonster; 
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members
	public MController()
	{
		myMonster = new MarshmallowMonster("Spence", 1.75, 3, true, 5); //If you did not assign a value the answer will be "noll" for words and 0 for numbers
		//^ this is the Call. Everything has to be in the same order as in the set parameters.
		userMonster = new MarshmallowMonster();

	}
	
	public void start() 
	{
		System.out.println(myMonster);
		//Beginning of thing for words shown then inputed. 
		System.out.println("What would you like your monster's name to be?");
				Scanner inputScanner = new Scanner(System.in); 
			String name = inputScanner.nextLine(); 

			System.out.println("That's a nice name. :)");
			
			
		System.out.println("How many arms would you like your monster to have?"); 
		int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		System.out.println("Your monster has " + userMonster.getArmCount() + " arms!); ");
		
		
		
		System.out.println("How many legs do you want it to have?"); 
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		System.out.println("Your monster has " + userMonster.getLegCount() + " legs."); 
		
		System.out.println("Your monster has a nose = true or false?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNose(hasNoses);
		System.out.println("The statement 'Your monster has a nose.' is " + userMonster.getHasNose() + "." );
	
		
		
		
		
		inputScanner.close();
	}
	
	


}
