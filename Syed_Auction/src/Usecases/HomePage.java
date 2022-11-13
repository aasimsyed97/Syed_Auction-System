package Usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Dao.BuyerDao;
import Dao.BuyerDaoImpl;
import Dao.SellerDao;
import Dao.SellerDaoImpl;
import Exceptions.AdminException;
import Exceptions.BuyerException;
import Exceptions.SellerException;
import Model.Buyer;
import Model.Items;
import Model.Seller;

public class HomePage { 
	
	
	
	
	 
      // Admin methods 
	 public List<Buyer> ViewRegisteredBuyerUsecase(){ 
		 List<Buyer> dtos = null;
		  AdminDao dao = new AdminDaoImpl(); 
		  try {
			dtos = dao.ViewRegisteredBuyer();
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		 return dtos;
	 }
	 
	 public List<Seller> ViewRegisteredSellerUsecase(){ 
		 List<Seller> dtos = null;
		  AdminDao dao = new AdminDaoImpl(); 
		  try {
			dtos = dao.ViewRegisteredSeller();
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		 return dtos;
	 }
	
	
	
	 
	 //Buyers methods
	 
	 public  String registerBuyerUsecase(Buyer buyer) { 
		  
		 String ans = null; 
		 
		 Scanner sc= new Scanner(System.in);   
		    
	       System.out.println("Enter buyer's name"); 
	       String name= sc.next();
	        
	        System.out.println("Enter buyer's username"); 
	          String username = sc.next();
	        
	        System.out.println("Enter buyer's password"); 
	        String password = sc.next();
	        
	      
	        
	       buyer.setName(name); 
	       buyer.setUsername(username);
	       buyer.setPassword(password);      
	       
	       BuyerDao dao = new BuyerDaoImpl(); 
	       
	       try {
			String result = dao.registerBuyer(buyer);
			
			  ans = result;
			 
			//System.out.println(result);
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	 }
	 
	 
	 public List<Items> getItemsListUsecase(String category){ 
		 List<Items> dtos = null;
		  BuyerDao dao = new BuyerDaoImpl(); 
		  try {
			dtos = dao.getItemsList(category);
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		 return dtos;
	 }
	  
	 
	 public List <Items> getItemstoBuyUsecase(String status){ 
		 List<Items> dtos = null;
		  BuyerDao dao = new BuyerDaoImpl(); 
		  try {
			dtos = dao.getItemsList(status);
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		 return dtos;
	 }
	 
	
	 
	 
	 
	 
	 //Sellers methods 
	 
	 
	 public  String registerSellerUsecase(Seller seller) { 
		  
		 String ans = null; 
		 
		 Scanner sc= new Scanner(System.in);   
		    
	       System.out.println("Enter Seller's name"); 
	       String name= sc.next();
	        
	        System.out.println("Enter Seller's username"); 
	          String username = sc.next();
	        
	        System.out.println("Enter Seller's password"); 
	        String password = sc.next();
	        
	      
	        
	       seller.setName(name); 
	       seller.setUsername(username);
	       seller.setPassword(password);      
	       
	       SellerDao dao = new SellerDaoImpl(); 
	       
	       try {
			String result = dao.registerSeller(seller);
			
			  ans = result;
			 
			//System.out.println(result);
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	 } 
	 
	 
	 
	 public  String ItemsforSellUsecase(Items item) { 
		  
		 String ans = null; 
		 
		 Scanner sc= new Scanner(System.in);   
		    
	       System.out.println("Enter Item's name"); 
	       String name= sc.next();
	        
	        System.out.println("Enter Item's category"); 
	          String category = sc.next();
	        
	        System.out.println("Enter Item's quantity"); 
	        int quantity = sc.nextInt(); 
	        
	        System.out.println("Enter Item's price"); 
	        int price = sc.nextInt(); 
	        
	        System.out.println("Enter Item's status"); 
	          String status = sc.next();
	        
	        System.out.println("Enter Item's sellerid"); 
	        int sellerid = sc.nextInt();
	        
	        
	      
	        
	       item.setName(name); 
	       item.setCategory(category);     
	       item.setQuantity(quantity);
	       item.setPrice(price);
	       item.setStatus(status);
	       item.setSellerid(sellerid);
	       
	       SellerDao dao = new SellerDaoImpl(); 
	       
	       try {
			String result = dao.itemsforsell(item);
			
			  ans = result;
			 
			//System.out.println(result);
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	 }
	
	 
	 public String updateItemsForSellUseCase(int price, int quantity,int itemid) { 
              String ans = null; 
		 
//		 Scanner sc= new Scanner(System.in);   
//		    
//	       System.out.println("Enter updated price"); 
//	        price= sc.nextInt();
//	        
//	        System.out.println("Enter updated quantity"); 
//	           quantity = sc.nextInt();
//	          
//	          System.out.println("Enter itemid to be updated"); 
//	           itemid = sc.nextInt();
//	        
	       
	        Items item = new Items();
	        
	       item.setPrice(price); 
	       item.setQuantity(quantity);
	       item.setItemid(itemid);   
	       
	       SellerDao dao = new SellerDaoImpl(); 
	       
	       try {
			String result = dao.updateItemsForSell(price,quantity,itemid);
			
			  ans = result;
			 
			//System.out.println(result);
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	 }
	 
	 
	 
	 public String removeItemsFromSellListUsecase( int itemid) { 
	 String ans = null; 
		 
		 Scanner sc= new Scanner(System.in);   
		    
//	       System.out.println("Enter itemid "); 
//	       int itemid = sc.nextInt();
//	        
	       
	       Items item = new Items();
	        
	       item.setItemid(itemid);
	      
	       
	       SellerDao dao = new SellerDaoImpl(); 
	       
	       try {
			String result = dao.removeItemsFromSellList(itemid);
			
			  ans = result;
			 
			//System.out.println(result);
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	 }
	 
	 
	 
	 public List<Items> soldItemsUsecase(){ 
		 List<Items> dtos = null;
		  SellerDao dao = new SellerDaoImpl(); 
		  try {
			dtos = dao.soldItems();
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		 return dtos;
	 }
	                                                                 
	  
	 
	 
	
	 
}
