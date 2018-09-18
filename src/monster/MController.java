package monster;

import model.MarshmallowMonster; 
import java.util.Scanner; //Needed so that you can use a scanner.
import javax.swing.JOptionPane;
// ^This is import section of code

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
		Scanner inputScanner = new Scanner(System.in); 
		
		JOptionPane.showMessageDialog(null,myMonster); //The null says no one owns window (Fastest way to make a Gui) 
		System.out.println(myMonster);	
		
		//System.out.println("What would you like your monster's name to be?");
		//String name = inputScanner.nextLine(); 
		
		//JOptionPane.showMessageDialog(null, "What do you want its name to be?");  //This style is for without input. 
		String userInput = JOptionPane.showInputDialog(null, "What should it's name be?");
			
		
		
			//System.out.println("That's a nice name. :)");
			JOptionPane.showMessageDialog(null, "That's cool.");
			
			
		//System.out.println("How many arms would you like your monster to have?"); 
		//int arms = inputScanner.nextInt();
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms!); ");
	
		userInput = JOptionPane.showInputDialog(null, "How many arms?");	
		int arms = 5;
		if (validInt(userInput))
		{
			arms = Integer.parseInt(userInput);
		}
		userMonster.setArmCount(arms);
		
		
		//System.out.println("How many legs do you want it to have?"); 
		//double legCount = inputScanner.nextDouble();
		//System.out.println("Your monster has " + userMonster.getLegCount() + " legs."); 
		
		userInput = JOptionPane.showInputDialog(null, "How many legs?");
		double legCount = 6.7;
		if (validDouble(userInput))
		{
			legCount = Double.parseDouble(userInput);
		}
		userMonster.setLegCount(legCount);
		
		
		
		//System.out.println("Your monster has a nose = true or false?");
		//boolean hasNoses = inputScanner.nextBoolean();
		userInput = JOptionPane.showInputDialog(null, "Is this statement true or false: Your monster has one or more noses.");
		
		userMonster.setHasNose(hasNoses);
		System.out.println("The statement 'Your monster has a nose.' is " + userMonster.getHasNose() + "." );
		
		boolean answer = Boolean.parseBoolean(userInput);
		
	
		//System.out.println("How many eyes does your monster have?");		
		//int eyeCount = inputScanner.nextInt();
		JOptionPane.showMessageDialog(null, "How many eyes?");

		userMonster.setEyeCount(eyeCount);
		System.out.println("Your monster has " + userMonster.getEyeCount() + "eyes. :)");
		
		
		
		
		
		inputScanner.close();
	}
	

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type a decimal value please.");
		}
		return isValid;
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false; 
		try
		{
			Integer.parseInt(maybeInt);
		}
		catch (NumberFormatException error) //Two things inside perens is formal perameter
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number. :)");
		}
		
		return isValid;
	}


}
