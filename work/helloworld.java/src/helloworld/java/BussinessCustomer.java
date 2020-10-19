package helloworld.java;

public class BussinessCustomer extends Customer {
	private int id;
	private double balance;
	private String company;
	public BussinessCustomer(int id, double balance, String company) {
		super();
		this.id = id;
		this.balance = balance;
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "BussinessCustomer [id=" + id + ", balance=" + balance + ", company=" + company + "]";
	}
	

}
