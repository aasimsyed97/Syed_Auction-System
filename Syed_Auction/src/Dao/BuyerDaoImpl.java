package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBUtil.Utility;
import Exceptions.AdminException;
import Exceptions.BuyerException;
import Model.Buyer;
import Model.Items;
import Model.Seller;

public class BuyerDaoImpl implements BuyerDao {

	@Override
	public String registerBuyer(Buyer buyer) throws BuyerException {
		// TODO Auto-generated method stub 
		String result = "Not registered"; 
		  
		
		  
		 try (Connection con=  Utility.provideConnection()){
		PreparedStatement	ps = con.prepareStatement("insert into Buyer(name,username,password)values(?,?,?)");
			      
		  ps.setString(1, buyer.getName());
		  ps.setString(2, buyer.getUsername());
		  ps.setString(3, buyer.getPassword());
		  
		  int x = ps.executeUpdate();
		   
		  if(x>0){ 
			result = "Buyer Registered Sucessfully";
			
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			throw new BuyerException(e.getMessage());
			
		}
		
		return result;
	}

	@Override
	public List<Items> getItemsList(String category) throws BuyerException {
		// TODO Auto-generated method stub
		
              List<Items> dtos = new ArrayList<>();
		
		
		try ( Connection con = Utility.provideConnection(); ){
		PreparedStatement	ps= con.prepareStatement("select * from Items");
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
	    	 throw new BuyerException("No Item is available ");
	     }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BuyerException(e.getMessage()); 
		}
		
		return dtos;
		
	}

	
	@Override
	public List<Items> getItemstoBuy(String status) throws BuyerException {
		// TODO Auto-generated method stub 
		   List<Items> dtos = new ArrayList<>();
			
			
			try ( Connection con = Utility.provideConnection() ){
			PreparedStatement	ps= con.prepareStatement("select * from Items where status=?");
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
		    	 throw new BuyerException("No Item is available ");
		     }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new BuyerException(e.getMessage()); 
			}
			
			return dtos;
		
		
	} 
	
	

		
	
}
