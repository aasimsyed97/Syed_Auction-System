package Dao;

import java.util.List;

import Exceptions.SellerException;
import Model.Items;
import Model.Seller;

public interface SellerDao  {  
	
	
//	. Register himself or herself as seller.
//	B. Create list of items to sell.
//	C. Update Item price, quantity, etc.
//	D. Add new Item in the list.
//	E. Remove items from the list.
//	F. View the sold Item history. 
	
	public String registerSeller(Seller seller)throws SellerException; 
    public String itemsforsell(Items item) throws SellerException;
    public String updateItemsForSell(int price,int quantity,int itemid)throws SellerException;
// public String insertItemsForSell(int itemid, String name, String category, int quantity, int price, String status, int sellerid)throw SellerException;  
      public String removeItemsFromSellList( int itemid)throws SellerException;	  
	 public List<Items> soldItems() throws SellerException;
   
}
