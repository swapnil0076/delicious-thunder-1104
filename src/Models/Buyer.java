package Models;

public class Buyer {

	private int buyerID;
	private String name;
	private String email;
	private int amount;
	private String password;
	private String location;
	
	
	public Buyer(){}
	
	


	public Buyer(int buyerID, String name, String email, int amount, String password, String location) {
		super();
		this.buyerID = buyerID;
		this.name = name;
		this.email = email;
		this.amount = amount;
		this.password = password;
		this.location = location;
	}




	public int getBuyerID() {
		return buyerID;
	}


	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		amount = amount;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}




	@Override
	public String toString() {
		return "Buyer [buyerID=" + buyerID + ", name=" + name + ", email=" + email + ", amount=" + amount
				+ ", password=" + password + ", location=" + location + "]";
	};
	
	
	
	
}
