package com.masai.Dao;

import java.util.List;

import com.masai.Exception.SellerException;
import com.masai.model.Items;
import com.masai.model.Seller;



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
     public String removeItemsFromSellList( int itemid)throws SellerException;	  
	 public List<Items> soldItems() throws SellerException;
   
}
