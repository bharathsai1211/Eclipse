package Lambda;

public class ProducerExample{
	public static void main(String args[]) 
	{
		//Anonymous class
		
		
		IProduces produce=new IProduces()
				{
					public String produce()
					{
						return "Welcome to cg anomynous";
					}
				};
				
			String k=produce.produce();
				System.out.println(k);
			//lambda expression
				IProduces pro=()->"welcome in lambda";
				
				
				//lambda block
				IProduces prod=()->
				{
					String msg="welcome in block";
					return msg;
				};
				String f=pro.produce();
				String g=prod.produce();
				System.out.println(k+" "+f+"\n"+g);
	}

}
