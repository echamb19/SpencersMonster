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
		myMonster = new MarshmallowMonster();
	}
	
	public void start() 
	{
		System.out.println(myMonster);
	}
	
	
}
