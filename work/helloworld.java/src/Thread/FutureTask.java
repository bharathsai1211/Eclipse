package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureTask implements Callable<Integer> {

	public Integer call() throws Exception
	{
		int res=0;
		for(int i=0;i<10;i++)
		{
			res=res+i;
			Thread.sleep(5);
		}
		return res;
	}
	

}
