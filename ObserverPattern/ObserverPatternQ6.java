package test;

public class ObserverPatternQ6 {
	
	
	
	public  static void main(String args[])
	{
		
	
		WorkManager publisher = new WorkManager();
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		publisher.Register(worker1);
		publisher.Register(worker2);
		publisher.Register(worker3);
		publisher.Register(worker4);
		
		WorkItem workitem1 = new WorkItem("1","object");
		WorkItem workitem2 = new WorkItem("3","oriented");
		WorkItem workitem3 = new WorkItem("5","programming");
		publisher.notify(workitem1);
		publisher.notify(workitem2);
		publisher.notify(workitem3);
	
	
	}

}
