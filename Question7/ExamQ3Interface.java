package test;

import java.util.ArrayList;

public interface ExamQ3Interface {
	
	public static void  main(String args[])
	{
		
		ArrayList<BakedGoods> lst=new ArrayList<BakedGoods>();
		Cookie c=new Cookie();
		CinnamonRoll cr=new CinnamonRoll();
		Brownie b=new Brownie();
		
		
		Cookie c1=new Cookie();
		CinnamonRoll cr1=new CinnamonRoll();
		Brownie b1=new Brownie();
		
		
		Cookie c2=new Cookie();
		CinnamonRoll cr2=new CinnamonRoll();
		Brownie b2=new Brownie();
		
		
		lst.add(c);
		lst.add(cr);
		lst.add(b);
		
		lst.add(c1);
		lst.add(cr1);
		lst.add(b1);
		
		lst.add(c2);
		lst.add(cr2);
		lst.add(b2);
		
		
		for(int i=0;i<lst.size();i++)
		{
			
			
			System.out.println("Description-->"+ "  " +lst.get(i).getDescription());
			System.out.println("Price-->" +"   " + lst.get(i).getPrice());
			System.out.println("Date-->"+"  " +lst.get(i).getSellByDate()+ "\n");
			
		}
		
		
	}
	

}
