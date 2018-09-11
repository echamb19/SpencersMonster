package model;

public class MarshmallowMonster
{
	//--> Declaration Section <--
	private String name; 
	private double legCount; 
	private int eyeCount; 
	private boolean hasNoses; 
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default constructor (generic, not as cool)
		//Default constructor initializes stuff. 
		// Generally is boring and isn't as helpful. 
	}
	
	public MarshmallowMonster(String name)
	{ 
		this.name = name; 
				//this talks about the current object (File I'm working on right now
				// How to assign a parameter into an instance. 
				
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name; 
		this.legCount = legCount;
		this.eyeCount = eyeCount; 
		this.hasNoses = hasNose; 
		this.armCount = arms; 
	}
	
	public String toString()
	{
		String description = ""; 
		
		return description; 
	}
}
