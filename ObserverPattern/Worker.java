package test;

public class Worker {
	
	long workerId;
	public Worker(long workerId) 
	{
		this.workerId = workerId;
	}
	public long getWorkerID()
	{ 
		return workerId; 
	}
	public String notify(WorkItem event)
	{
		
		if(event.getItemID().equals(Long.toString(workerId))) 
		{
			
			String string1 = "Worker:" + workerId + " processed WorkItem" + event.getItemID() + " message " + event.getmessage();
			
			int i=Integer.parseInt((event.itemId))+1;
			event.setItemID(Integer.toString(i));
			return string1;
		}
		else
		{
			return null;
		}
		
		
	}

}
