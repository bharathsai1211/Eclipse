package ExampleAbstarct;

public class Savings implements twointerfaces {
	public void  issueLoan()
	{
		
	}

	private int id;
	private String name;
	private String atmtype;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAtmtype() {
		return atmtype;
	}
	public void setAtmtype(String atmtype) {
		this.atmtype = atmtype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Savings(int id, String name, String atmtype, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.atmtype = atmtype;
		this.balance = balance;
	}
	public double withdraw()
	{
		return getBalance()-5000;
	}
	public String toString()
	{
		return id+" "+name+" "+atmtype+" "+balance;
	}
	public void display()
	{
		System.out.println("In savings class");
	}
	
}
