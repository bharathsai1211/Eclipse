package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
	public static void main(String args[]) throws InterruptedException, ExecutionException
	{
		ExecutorService ser=Executors.newCachedThreadPool();
		Callable<Integer> ft=new FutureTask(); 
		Future<Integer> future=ser.submit(ft);
		System.out.println("we will get");
		Integer res=future.get();
		System.out.println("result "+res);
		
	}

}
