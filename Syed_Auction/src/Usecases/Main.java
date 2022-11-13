package Usecases;

import java.util.List;
import java.util.Scanner;

import Dao.BuyerDao;
import Dao.BuyerDaoImpl;
import Exceptions.BuyerException;
import Model.Buyer;
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
		 System.out.println(" 1 for Buyer login"); 
		 
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
			  
			  System.out.println(" 1 : Enlist Items for sell");
			  System.out.println(" 2 : Update Price and quantity of Item");
			  System.out.println(" 3 : Remove Item from the list");
			  System.out.println(" 4 : veiw sold items");
				 System.out.println(" 5 Homepage");
				 
				 System.out.println(" Enter Number"); 
				 
				  int b = sc.nextInt(); 
				   if(b==1) { 
					   
				   }
			 		  }
		  else if(a==3)
		  { 
			  System.out.println("hello aasim3");
		  } 
		  else { 
			  System.out.println("Invalid number"); 
			  System.out.println("Enter Correct number"); 
			  menu();
		  }
	 }
	
	
	
	 
}
