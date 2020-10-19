package bharath;

public class Hostel extends Student{
	public Hostel(int id, String name, String hostel) {
		super(id, name);
		this.hostel = hostel;
	}

	String hostel;

	public void display()
	{
		System.out.println(id+" "+name+" "+hostel);
	}
	
	public String toString()
	{
		return id+" "+name+" "+hostel;
	}

}
