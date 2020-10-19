package Thread;

public class ThreadExample implements Runnable{
	String msg;
	public ThreadExample(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	 public  void run()
	{
		Examp e=new Examp();
		
		try {
			e.print(msg);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	
	

}
