package com.masai.Dao;

import java.util.List;

import com.masai.model.Buyer;
import com.masai.model.Seller;

import com.masai.Exception.*;



public interface AdminDao { 
	//. View the registered buyer list.
  // . View the registered Seller list.
//. View the daily dispute report.
//. View the daily selling report.
//Solve the dispute report.
   
	 public List<Buyer> ViewRegisteredBuyer()throws AdminException;
	  public List<Seller>ViewRegisteredSeller()throws AdminException;
	 public List<Dispute>ViewDailyDiputeReport()throws AdminException;
    public List<Report>viewDailyReportSelling()throws AdminException;
 
}
