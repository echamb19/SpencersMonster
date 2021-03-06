package model;

public class MarshmallowMonster
{
	/*--> Declaration Section or Initialization Section <--
	Data Member section
	Also called instance variables 
	All numbers are 0 
	All booleans are false
	Objects are null
	*/
	
	private String name; 
	private double legCount; 
	private int eyeCount; 
	private boolean hasNoses; 
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		/*Default constructor (generic, not as cool)
		Default constructor initializes stuff. 
		Generally is boring and isn't as helpful.
		*/ 
	}
	
	public MarshmallowMonster(String name)
	{ 
		this.name = name; 
				/*"this" talks about the current object (File I'm working on right now
				 How to assign a parameter into an instance. 
				*/
	}
	
	public MarshmallowMonster(String name, double legCount, int eyes, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyes; 
		this.hasNoses = hasNose; 
		this.armCount = arms; 
	}

	public String getName() 
	{
		return name; 
	}

	public double getLegCount()
	{
		return legCount; 
	}
	
	public int getEyeCount()
	{ 
		return eyeCount;
	}
	
	public boolean getHasNose()
	{
		return hasNoses; 
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
 	{
 		this.name = name;
 	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes; 
	}
	
	public void setHasNose(boolean hasNose)
	{
		this.hasNoses = hasNose; 
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public String toString()
 	
 	
	{
		String description = "This monster is named " + name 
				+ " and it has " + legCount + " legs... \n"
				+ "It also has " + eyeCount + " eyes"
				+ " and " + armCount + " arms. \n"
				+ "It is " + hasNoses + " that Spence has a nose. \n"
				+ "He loves to jump out and scare people by saying: "
				+ "Boo!!! XD" ; 
		
		return description; 
	}
}
