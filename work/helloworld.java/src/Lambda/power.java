package Lambda;
import java.util.function.*;




public class power {
	public double powCal(int x,int y)
	{
		double d= Math.pow(x, y);
		return d;
	}
	public static void main(String args[])
	{
		power p=new power();
			
		//Supplier<Integer> s;
		//Function<Integer,Integer> fu;
		BiFunction<Integer,Integer,Double> abc=p::powCal;
		Double d=abc.apply(2,3);
		System.out.println(d);
	}

}
