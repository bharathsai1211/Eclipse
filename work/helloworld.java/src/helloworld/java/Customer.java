package helloworld.java;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Customer [] c=new Customer[2];
		for(int i=0;i<2;i++)
		{
			int id;
			double balance;
			Scanner sc=new Scanner(System.in);
			id=sc.nextInt();
			balance=sc.nextDouble();
			String accType=sc.next();
			if(accType.equalsIgnoreCase("savings"))
			{
				String houseAddress=sc.next();
				RegularCustomer regularCustomer=new RegularCustomer(id,balance,houseAddress);
				c[i]=regularCustomer;
			
			}
			else if(accType.equalsIgnoreCase("bussiness"))
			{
				String company=sc.next();
				BussinessCustomer bussinessCustomer=new BussinessCustomer(id,balance,company);
				c[i]=bussinessCustomer;
			}
			
			
		}
		for(int i=0;i<2;i++)
			
		{
			System.out.println(c[i]);
		}

	}

}
