package test;

public class WorkItem {
	
	long workerId;
	String message;
	String itemId;
	public WorkItem() 
	{
		
		
	}
	public WorkItem(String id,String message) 
	{
		this.itemId = id;
		this.message = message;		
	}
	public void setItemID(String i) 
	{ 
		this.itemId = i;
	}
	
	public String getItemID() 
	{
		return itemId; 
	}
	public String getmessage() 
	{
		return message;
	}
	public long getworkerId() 
	{
		return workerId;
	}

}
