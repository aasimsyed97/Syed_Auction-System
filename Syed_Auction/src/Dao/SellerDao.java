package Dao;

import Exceptions.SellerException;

public interface SellerDao {  
	
	
//	. Register himself or herself as seller.
//	B. Create list of items to sell.
//	C. Update Item price, quantity, etc.
//	D. Add new Item in the list.
//	E. Remove items from the list.
//	F. View the sold Item history. 
	
//	public String registSeller(Seller seller)throws SellerException; 
    public void itemsforsell() throws SellerException;
   // public String updateItemsForSell(int price, int quantity);
// public String insertItemsForSell(int itemid, String name, String category, int quantity, int price, String status, int sellerid)throw SellerException;  
// public void removeItemsForSell( )throws SellerException;	  
	// public void soldItems() throws SellerException;
   
}
