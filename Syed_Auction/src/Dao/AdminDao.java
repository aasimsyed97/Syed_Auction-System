package Dao;

import java.util.List;

import Exceptions.AdminException;
import Model.Buyer;

public interface AdminDao { 
	//. View the registered buyer list.
  // . View the registered Seller list.
//. View the daily dispute report.
//. View the daily selling report.
//Solve the dispute report.
   
	 public List<Buyer> ViewRegisteredBuyer()throws AdminException;
	 // public List<Sellers>ViewRegisteredSeller();
	// public List<Dispute>ViewDailyDiputeReport();
    // public List<Report>viewDailyReportSelling();
 
}
