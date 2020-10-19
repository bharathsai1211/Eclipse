package Thread;

public class MainThread {
	public static void main(String args[])
	{
		
		ThreadExample t1=new ThreadExample("child1");
		ThreadExample t2=new ThreadExample("child2");
		Thread r=new Thread(t1);
		Thread r1=new Thread(t2);
		r.start();
		r1.start();
		//new ThreadExample("child 1").start();
		//new ThreadExample("child 2").start();
	}
	

}
