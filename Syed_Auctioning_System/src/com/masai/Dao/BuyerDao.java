package com.masai.Dao;

import java.util.List;

import com.masai.Exception.BuyerException;
import com.masai.model.Buyer;
import com.masai.model.Items;
import com.masai.model.Seller;



public interface BuyerDao { 
//	. Register himself or herself as Buyer.
//	B. Search and view Items by category.
//	C. Select and view all the seller and also their Items category wise.
//	D. Selects Items to buy. 
	
	 public String registerBuyer(Buyer buyer)throws BuyerException; 
	 
	 
	 public List<Items> getItemsList(String category)throws BuyerException;
	
	
	 
	 public List <Items> getItemstoBuy(String status)throws BuyerException;
	
	 
	 public List<Seller> getSellerList()throws BuyerException;


}
