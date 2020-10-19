package Lambda;

public class BuyConsumerExample {
	public static void main(String args[])
	{
		
		BuyConsumer b=new BuyConsumer()
				{
					public void concat(String k,String m)
					{
						System.out.println(k+m);
					}
				};
				b.concat("sai"," bharath");
		BuyConsumer bf=(String q,String w)->
		
			System.out.println(q+w);
	
		bf.concat("Sai", "teja");
		
	}

}
