package helloworld.java;

public class Array {
	public static void main(String args[])
	{
		Array a=new Array();
		a.add(1,2,3);
		a.add();
		a.add(2,3,5,6,7);
		int[] ak= {1,2,5,3};
		
		a.add(ak);
	}
	public void add(int... arr)
	{
		int s=0;
		for(int k:arr)
		{
			s=s+k;
		}
		System.out.println(s);
	}
	
}
