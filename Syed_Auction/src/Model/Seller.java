package Model;

public class Seller { 
	 
	private int Sellerid;
	private String name;
	private String username;
	private String password;
	
	public Seller() {}

	public Seller(int sellerid, String name, String username, String password) {
		super();
		Sellerid = sellerid;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public int getSellerid() {
		return Sellerid;
	}

	public void setSellerid(int sellerid) {
		Sellerid = sellerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Seller [Sellerid=" + Sellerid + ", name=" + name + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	

}
