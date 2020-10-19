package Thread;

public class Examp {
	synchronized public void print(String k) throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			//String s=getName();
			System.out.println(i+" "+k);
			
				Thread.sleep(100);;
			
		}
	}

}
