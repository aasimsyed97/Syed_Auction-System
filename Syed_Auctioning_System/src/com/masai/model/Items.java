package com.masai.model;

public class Items {

	

	
	  private  int Itemid ;
	  private String name;
	  private String category;
	  private int quantity; 
	  private int price ;
	  private String status;
	  private int Sellerid;
	  
	  
	  public Items() {}


	public Items(int itemid, String name, String category, int quantity, int price, String status, int sellerid) {
		super();
		Itemid = itemid;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		Sellerid = sellerid;
	}


	public int getItemid() {
		return Itemid;
	}


	public void setItemid(int itemid) {
		Itemid = itemid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getSellerid() {
		return Sellerid;
	}


	public void setSellerid(int sellerid) {
		Sellerid = sellerid;
	}


	@Override
	public String toString() {
		return "Items [Itemid=" + Itemid + ", name=" + name + ", category=" + category + ", quantity=" + quantity
				+ ", price=" + price + ", status=" + status + ", Sellerid=" + Sellerid + "]";
	} 
	  
	  
	  
	  
}
