package Usecases;

import java.util.List;
import java.util.Scanner;

import Dao.BuyerDao;
import Dao.BuyerDaoImpl;
import Exceptions.BuyerException;
import Model.Buyer;
import Model.Items;
import Model.Seller;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub 
		menu();
		 
//		
		 
//		
//		 HomePage home = new HomePage();
//		  Buyer buyer = new Buyer();
//		String res = home.registerBuyerUsecase(buyer);
//		System.out.println(res);
       
	} 
	
	 public static void menu() {  
		 Scanner sc = new Scanner(System.in);  
		 HomePage home = new HomePage();
	//	 System.out.println("hello aasim");
		 System.out.println("Welcome to SYED_AUCTION_SYSTEM"); 
		 System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		 System.out.println(" ");
		 System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		 
		 System.out.println(" 1 for Admin login");
		 System.out.println(" 2 for Seller login");
		 System.out.println(" 3 for Buyer login"); 
		 
		 System.out.println(" Enter number"); 
		 
		  int a = sc.nextInt();
		  
		  if(a==1) 
		  { 
			  System.out.println(" 1 : veiw registered Buyers list");
			  System.out.println(" 2 : veiw registered Sellers list");
			  System.out.println(" 3 : veiw daily dispute report");
			  System.out.println(" 4 : veiw daily Selling report");
				 System.out.println(" 5 Homepage");
				 
				 System.out.println(" Enter Number"); 
				 
				  int b = sc.nextInt(); 
				  
				  if(b==1) { 
					// view buyers list implements here  
					
					  List<Buyer> dtos = home.ViewRegisteredBuyerUsecase();
					 dtos.forEach(dto->System.out.println(dto));
					  
					 // System.out.println(" Enter 1 for Admin page "); 
					  System.out.println(" Enter 0 for Home page "); 
						 
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
					   
				  }
				  else if(b==2) { 
					// view Sellers list implements here   
					  List<Seller> dtos = home.ViewRegisteredSellerUsecase();
						 dtos.forEach(dto->System.out.println(dto));
						  
						 // System.out.println(" Enter 1 for Admin page "); 
						  System.out.println(" Enter 0 for Home page "); 
							 
						  int c = sc.nextInt();  
						   if(c==0) { 
							  menu();
						  }
						   
				  }
				  else if(b==3){ 
					  System.out.println("This page is temporarily unavailable");
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
				  } 
				  else if(b==4) { 
					  System.out.println("This page is temporarily unavailable");
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
				  }
				  
			  
			  
		  }  
		  //Seller methods
		  else if(a==2)
		  { 
			  System.out.println(" 1 : Register as new Seller");
			  System.out.println(" 2 : Enlist Items for sell");
			  System.out.println(" 3 : Update Price and quantity of Item");
			  System.out.println(" 4 : Remove Item from the list");
			  System.out.println(" 5 : veiw sold items");
				 System.out.println(" 6 Homepage");
				 
				 System.out.println(" Enter Number"); 
				 
				  int b = sc.nextInt(); 
				   if(b==1) { 
					   Seller seller = new Seller();
					  String result =  home.registerSellerUsecase(seller); 
					  System.out.println(result); 
					  
					  System.out.println(" Enter 0 for Home page "); 
						 
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
				   }
				   else if (b==2)
				   {
					  Items item = new Items(); 
					  String result =  home.ItemsforSellUsecase(item); 
					  System.out.println(result); 
					  System.out.println(" Enter 0 for Home page "); 
					   
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
					 
				   }
				   else if (b==3)
				   {
					  
				       System.out.println("Enter updated price"); 
				       int price= sc.nextInt();
				        
				        System.out.println("Enter updated quantity"); 
				          int quantity = sc.nextInt();
				          
				          System.out.println("Enter itemid to be updated"); 
				           int itemid = sc.nextInt(); 
					    
				         String result =   home.updateItemsForSellUseCase(price, quantity, itemid);
				           System.out.println(result); 
				           System.out.println(" Enter 0 for Home page "); 
				           int c = sc.nextInt();  
						   if(c==0) { 
							  menu();
						  }
				           
				   }
				   else if (b==4)
				   {
					   
				       System.out.println("Enter itemid "); 
			             int itemid = sc.nextInt();  
			             String result = home.removeItemsFromSellListUsecase(itemid);
			             System.out.println(result);
			             System.out.println(" Enter 0 for Home page "); 
			             int c = sc.nextInt();  
						   if(c==0) { 
							  menu();
						  }
				   }
				   else if (b==5)
				   {
					List<Items> dtos = home.soldItemsUsecase();
					dtos.forEach(dto->System.out.println(dto)); 
					  System.out.println(" Enter 0 for Home page "); 
					int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
			           
				         
				   }
				   else if (b==6)
				   {
					   menu();
				   }
			 		  }
		  else if(a==3)
		  { 
			  System.out.println(" 1 : Register as new Buyer");
			  System.out.println(" 2 : Get Items List");
			  System.out.println(" 3 : Get Items availabe to buy");
			 
				 System.out.println(" 4 Homepage");
				 
				 System.out.println(" Enter Number"); 
				 
				  int b = sc.nextInt(); 
				   if(b==1) { 
					   Buyer buyer = new Buyer();
					  String result =  home.registerBuyerUsecase(buyer);
					  System.out.println(result); 
					  
					  System.out.println(" Enter 0 for Home page "); 
						 
					  int c = sc.nextInt();  
					   if(c==0) { 
						  menu();
					  }
				   } 
				   else if (b==2)
				   {
					   System.out.println(" Enter category of items "); 
					   String category = sc.next();
					  List<Items> dtos = home.getItemsListUsecase(category);  
					  dtos.forEach(dto->System.out.println(dto));
					  
						
						  System.out.println(" Enter 0 for Home page "); 
							 
						  int c = sc.nextInt();  
						   if(c==0) { 
							  menu();
						  }
				   }
				   else if (b==3)
				   {
					   System.out.println(" Enter category of items "); 
					   String status = sc.next();
					   List<Items> dtos = home.getItemstoBuyUsecase(status);  
					   dtos.forEach(dto->System.out.println(dto));
						  
						
						  System.out.println(" Enter 0 for Home page "); 
							 
						  int c = sc.nextInt();  
						   if(c==0) { 
							  menu();
						  }
				   }
				   else if (b==4)
				   {
					   menu();
				   }
		  } 
		  else { 
			  System.out.println("Invalid number"); 
			  System.out.println("Enter Correct number"); 
			  menu();
		  }
	 }
	
	
	
	 
}
