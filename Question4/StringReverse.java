package test;

public class StringReverse {

	private String result="";
	public String reverseString(String str)
	{
		
		
		if(str!=null)
		{
			for(int i=str.length()-1;i>=0;i--)
			{
				result=result + str.charAt(i);
			}
			
		}
		else 
		{
			result=null;
		}
		return result;
		
	}
	
}
