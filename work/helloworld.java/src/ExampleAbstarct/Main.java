package ExampleAbstarct;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		
		Withdraw savings=new Savings(10,"bharath","Visa",100000);
		Withdraw current=new Current(20,"teja","capgemini",2000000);
		Withdraw current1=new Current(20,"teja","capgemini",2000000);
		if(current.equals(current1))
		{
			System.out.println("yahh!!!!");
		}
		System.out.println(savings+" "+savings.withdraw());
		System.out.println(current+" "+current.withdraw());
	
		
	}

}
