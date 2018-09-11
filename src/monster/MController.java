package monster;

import model.MarshmallowMonster; 

public class MController
{
	//Data member/Declaration section
	// Without "new" (initializing) your program has nothing "noll" (kills the program)
	private MarshmallowMonster myMonster; 
	
	//Constructors initialize data members
	public MController()
	{
		myMonster = new MarshmallowMonster("Spence", 1.75, 3, true, 5); //If you did not assign a value the answer will be "noll" for words and 0 for numbers
		//^ this is the Call. Everything has to be in the same order as 
	}
	
	public void start() 
	{
		System.out.println(myMonster);
	}
	
	
}
