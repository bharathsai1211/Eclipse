package bharath;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s1=new Student(123,"sai");
		//Student s2=new Student(345,"teja");
		//Student s3=s2;
		Hostel h1=new Hostel(123,"bharath","vel");
		Hostel h2=new Hostel(345,"ramesh","kii");
		h2=h1;
		Hostel h3=new Hostel(123,"bharath","vel");
		
		//System.out.println(h1.id+" "+h2.id);
		h3=null;
		Hostel [] hostel=new Hostel[2];
		hostel[0]=h1;
		//hostel[0].display();
		hostel[1]=h2;
		//hostel[1].display();
		try
		{
		System.out.println(h3.id);
		
		if(h1.equals(h3))
		{
			System.out.println("hi");
		}
		System.out.println(h1);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage()+"djkdj");
		}
		
		

	}

}