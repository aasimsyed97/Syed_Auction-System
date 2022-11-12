package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBUtil.Utility;
import Exceptions.AdminException;
import Model.Buyer;
import Model.Seller;

public class AdminDaoImpl implements AdminDao{

	@Override
	public List<Buyer> ViewRegisteredBuyer()throws AdminException {
		// TODO Auto-generated method stub 
		List<Buyer> dtos = new ArrayList<>();
		
		
		try ( Connection con = Utility.provideConnection(); ){
		PreparedStatement	ps= con.prepareStatement("select * from Buyer");
	     ResultSet rs = ps.executeQuery();
	     while(rs.next()) { 
	    	 Buyer dto = new Buyer();
	    	 dto.setBuyerid(rs.getInt("Buyerid")); 
	    	 dto.setName(rs.getString("name")); 
	    	 dto.setUsername(rs.getString("username"));
	    	 dto.setPassword(rs.getString("password"));
	    	 
	    	 dtos.add(dto);
	     } 
	     if(dtos.size()==0) { 
	    	 throw new AdminException("No Buyer is registered ");
	     }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AdminException(e.getMessage()); 
		}
		
		return dtos;
		
		
		
		
	
	}

	@Override
	public List<Seller> ViewRegisteredSeller() throws AdminException {
		// TODO Auto-generated method stub 
		
	List<Seller> dtos = new ArrayList<>();
		
		
		try ( Connection con = Utility.provideConnection(); ){
		PreparedStatement	ps= con.prepareStatement("select * from Seller");
	     ResultSet rs = ps.executeQuery();
	     while(rs.next()) { 
	    	 Seller dto = new Seller();
	    	 dto.setSellerid(rs.getInt("Sellerid")); 
	    	 dto.setName(rs.getString("name")); 
	    	 dto.setUsername(rs.getString("username"));
	    	 dto.setPassword(rs.getString("password"));
	    	 
	    	 dtos.add(dto);
	     } 
	     if(dtos.size()==0) { 
	    	 throw new AdminException("No Seller is registered ");
	     }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AdminException(e.getMessage()); 
		}
		
		return dtos;
		
		
	
	}
   

}
