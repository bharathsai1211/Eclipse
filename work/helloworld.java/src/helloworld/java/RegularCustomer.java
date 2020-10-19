package helloworld.java;

public class RegularCustomer extends Customer {
	private int id;
	private double balance;
	private String houseAddress;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "RegularCustomer [id=" + id + ", balance=" + balance + ", houseAddress=" + houseAddress + "]";
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
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public RegularCustomer(int id, double balance, String houseAddress) {
		super();
		this.id = id;
		this.balance = balance;
		this.houseAddress = houseAddress;
	}
	

}
