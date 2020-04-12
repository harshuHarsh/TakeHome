package test;
import java.util.ArrayList;
import java.util.Iterator;
public class ExamQ3Abstract 
{
	
	public static void main(String args[])
	{
		
		ArrayList<SpaceShip> lst = new ArrayList<SpaceShip>(); 
		
		OtherSciFiSpaceShips other1=new OtherSciFiSpaceShips();
		StarWarsShips starwarship1=new StarWarsShips();
		StarTrekShips startrekship1=new StarTrekShips();
		
		OtherSciFiSpaceShips other2=new OtherSciFiSpaceShips();
		StarWarsShips starwarship2=new StarWarsShips();
		StarTrekShips startrekship2=new StarTrekShips();
		
		
		OtherSciFiSpaceShips other3=new OtherSciFiSpaceShips();
		StarWarsShips starwarship3=new StarWarsShips();
		StarTrekShips startrekship3=new StarTrekShips();
		
		lst.add(other1);
		lst.add(other2);
		lst.add(other3);
		lst.add(starwarship1);
		lst.add(starwarship2);
		lst.add(starwarship3);
		lst.add(startrekship1);
		lst.add(startrekship2);
		lst.add(startrekship3);
		
		for(int i = 0; i < lst.size(); i++)
		{
			 System.out.println("Name of the Ship--"+ " " +lst.get(i).getName());
			 System.out.println("Tonnage--"+ +lst.get(i).getTonnage());
		     System.out.println("Franchise name--"+ " " +lst.get(i).getFranchise()+"\n");
		}
			
	}
}
