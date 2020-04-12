package test;

public class ExamSingleton {
	
	
		    private static ExamSingleton instance=null;
		    
		    public  static ExamSingleton createInstance()
		    {
		        try
		        {
		        	if(instance==null)
		            instance = new ExamSingleton();
		        	return instance;
		        }
		        catch(Exception e)
		        {
		            throw new RuntimeException("Exception occured in creating singleton instance");
		        }
		        
		    }
		    public String tellJoke()
		    {
		    	
		    	String str = "Why can't Sardar dial 911?\r\n" + 
		    			"They can not find the eleven on the phone ";
				return str;
		    	
		    }
		   
		}

