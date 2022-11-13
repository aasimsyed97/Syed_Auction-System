package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBUtil.Utility;
import Exceptions.AdminException;
import Exceptions.SellerException;
import Model.Buyer;
import Model.Items;
import Model.Seller;

public class SellerDaoImpl implements SellerDao {

	@Override
	public String registerSeller(Seller seller) throws SellerException {
		// TODO Auto-generated method stub
		
		String result = "Not registered"; 
		  
		
		  
		 try (Connection con=  Utility.provideConnection()){
		PreparedStatement	ps = con.prepareStatement("insert into Seller(name,username,password)values(?,?,?)");
			      
		  ps.setString(1, seller.getName());
		  ps.setString(2, seller.getUsername());
		  ps.setString(3, seller.getPassword());
		  
		  int x = ps.executeUpdate();
		   
		  if(x>0){ 
			result = "Seller Registered Sucessfully";
			
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			throw new SellerException(e.getMessage());
			
		}
		
		return result;
	}

	@Override
	public String itemsforsell(Items item) throws SellerException {
		
		String result = "Not registered"; 
		  
		
		  
		 try (Connection con=  Utility.provideConnection()){
		PreparedStatement	ps = con.prepareStatement("insert into Items(name,category,quantity,price,status,sellerid)values(?,?,?,?,?,?)");
			      
		  ps.setString(1, item.getName());
		  ps.setString(2, item.getCategory());
		  ps.setInt(3, item.getQuantity());
		  ps.setInt(4, item.getPrice()); 
		  ps.setString(5, item.getStatus()); 
		  ps.setInt(6, item.getSellerid());
		  
		  int x = ps.executeUpdate();
		   
		  if(x>0){ 
			result = "Item for sell created Sucessfully";
			
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			throw new SellerException(e.getMessage());
			
		}
		
		return result;
	}

	@Override
	public String updateItemsForSell(int price, int quantity,int itemid) throws SellerException {
		// TODO Auto-generated method stub
		

		String result = "Not updated"; 
		  
		
		  
		 try (Connection con=  Utility.provideConnection()){
		PreparedStatement	ps = con.prepareStatement("update items set quantity=?,price=? where itemid=?");
			      
		 
		
		  ps.setInt(1, quantity);
		  ps.setInt(2, price); 
		  ps.setInt(3, itemid);  
		
		  
		  int x = ps.executeUpdate();
		   
		  if(x>0){ 
			result = "Item quantity and price for sell updated Sucessfully";
			
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			throw new SellerException(e.getMessage());
			
		}
		
		return result;
	}

	@Override
	public String removeItemsFromSellList(int itemid) throws SellerException {
		// TODO Auto-generated method stub

		String result = "Not removed"; 
		  
		
		  
		 try (Connection con=  Utility.provideConnection()){
		PreparedStatement	ps = con.prepareStatement("delete from items where itemid=?");
			      
	
		  ps.setInt(3, itemid);  
		
		  
		  int x = ps.executeUpdate();
		   
		  if(x>0){ 
			result = "Item removed Sucessfully";
			
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			throw new SellerException(e.getMessage());
			
		}
		
		return result;
	}

	@Override
	public List<Items> soldItems(String status) throws SellerException {
	    
		
		List<Items> dtos = new ArrayList<>();
		
		
		try ( Connection con = Utility.provideConnection(); ){
		PreparedStatement	ps= con.prepareStatement("select * from Items where status=sold");
	     ResultSet rs = ps.executeQuery();
	     while(rs.next()) { 
	    	 Items dto = new Items();
	    	 
	    	 dto.setSellerid(rs.getInt("itemid")); 
	    	 dto.setName(rs.getString("name")); 
	    	 dto.setCategory(rs.getString("category")); 
	    	 dto.setQuantity(rs.getInt("quantity"));
	    	 dto.setPrice(rs.getInt("price"));
	    	 dto.setStatus(rs.getString("status"));
	    	 dto.setSellerid(rs.getInt("sellerid"));
	    	 
	    	 dtos.add(dto);
	     } 
	     if(dtos.size()==0) { 
	    	 throw new SellerException("No item has been sold yet ");
	     }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SellerException(e.getMessage()); 
		}
		
		return dtos;
		
		
		
	}


	

}
