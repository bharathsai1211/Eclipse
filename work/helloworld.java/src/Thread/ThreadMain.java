package Thread;
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread("child1");
		c.start();
		ChildThread c1=new ChildThread("child2");
		c1.start();
		RunnableChild r=new RunnableChild("runnable child1");
		Thread  c2=new Thread(r);
		c2.start();
		RunnableChild r1=new RunnableChild("runnable child2");
		Thread  c3=new Thread(r1);
		c3.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("mathread "+i);
			if(i==4)
			{
				System.out.println("jskjsdkjs");
			}
		}

	}

}
