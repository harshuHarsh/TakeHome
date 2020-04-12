package test;

import java.util.ArrayList;

public class WorkManager {

	
		ArrayList<Worker> subscriber = new ArrayList<Worker>(4);
		
		public void Register(Worker worker) 
		{
			subscriber.add(worker);
		}
		public void unRegister(Worker worker) 
		{
			subscriber.remove(worker);
		}
	
		public void notify(WorkItem event)
		{
			
			for(Worker worker: subscriber) 
			{
				if(worker.getWorkerID()<=4) 
				{
					String  result = worker.notify(event);
					if(result != null)
					{
						System.out.println(worker.getWorkerID() + ": Completed work on item " + event.getItemID());
					}
				}
			}
			
		}
	

}
