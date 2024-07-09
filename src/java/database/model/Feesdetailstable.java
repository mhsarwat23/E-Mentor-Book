package oxf.database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.Feesdetails;
import oxf.database.entity.Studentdetails;
import oxf.database.entity.Studentfeesdetails;

public class Feesdetailstable {
	 public List<Feesdetails> listfeesdetails(){
			List<Feesdetails> listfeedetails =new ArrayList<>();
		   
		   Connection conn=DatabaseConfig.getConnection();
			  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select * from feesdetails";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
			   listfeedetails.add(new Feesdetails(rs.getString("usn"),rs.getInt("Total_fees"),rs.getInt("fees_paid"),rs.getInt("balance")));
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listfeedetails;
		}
	 public void adddetail(String usn) {
			Connection conn=null;
			PreparedStatement stmt=null;
			try {
				conn=DatabaseConfig.getConnection();
	    		String query="insert into feesdetails(usn) values(?)";
	    		stmt=conn.prepareStatement(query);
	    		stmt.setString(1, usn);
	    		stmt.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	 public Feesdetails listfees(String usn){
			Feesdetails listfeedetails =null;
		   
		   Connection conn=DatabaseConfig.getConnection();
			  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select * from feesdetails";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()&&rs.getString("usn").equals(usn)) {
			   listfeedetails=new Feesdetails(rs.getString("usn"),rs.getInt("Total_fees"),rs.getInt("fees_paid"),rs.getInt("balance"));
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listfeedetails;
		}
	
	 
	 public List<Studentfeesdetails> listnamefees(){
		 List<Studentfeesdetails> listnamefees=new ArrayList<>();
		 Connection conn=DatabaseConfig.getConnection();
		  
		 Statement stmt=null;
		   ResultSet rs=null;
		   String query="select s.usn,s.name,f.total_fees,f.fees_paid,f.balance from studentdetails s,feesdetails f where s.usn=f.usn";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
			   listnamefees.add(new Studentfeesdetails(rs.getString("usn"),rs.getString("name"),rs.getInt("total_fees"),rs.getInt("fees_paid"),rs.getInt("balance")));
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		 
		 return listnamefees;
	 }
	public void updatefee(String usn,int total_fees,int fees_paid) {
		Connection conn=null;
    	PreparedStatement stmt=null;
    	try {
    		conn=DatabaseConfig.getConnection();
    		
    		String query="update feesdetails set total_fees =? , fees_paid=? where usn=?";
    		stmt=conn.prepareStatement(query);
    		
    		stmt.setInt(1, total_fees);
    		stmt.setInt(2,fees_paid);
    	    stmt.setString(3, usn);
    	    stmt.execute();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
	}
}
