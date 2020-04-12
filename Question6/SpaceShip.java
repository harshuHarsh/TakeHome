package test;

public abstract class SpaceShip 
{
	
	int tonnage;
	
	String name;
    String franchise;
	public  int getTonnage()
	{
		return tonnage; 
	}

	public String getName() 
	{	
		return name;
	}

	public String getFranchise() // Star Wars, Star Trek, or some other Sci-fi universe
	{
		return franchise;
	}
}