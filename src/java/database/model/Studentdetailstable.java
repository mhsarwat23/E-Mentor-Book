package oxf.database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.Studentdetails;
import oxf.database.entity.Studentdetails2;
import oxf.database.entity.Studentfeesdetails;

public class Studentdetailstable {
	 public List<Studentdetails> listdetails(){
			List<Studentdetails> listdetails =new ArrayList<>();
		   
		   Connection conn=DatabaseConfig.getConnection();
			  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select * from studentdetails";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
			   listdetails.add(new Studentdetails(rs.getString("usn"),rs.getString("name"),rs.getString("phonenumber"),rs.getString("currentsem"),rs.getString("department"), rs.getString("cgpa")));
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listdetails;
		}
	 public List<Studentdetails> liststudentupdatedetails(){
			List<Studentdetails> listdetails =new ArrayList<>();
		   ResultSet rs=null;
		   Connection conn=null;
			  Statement stmt=null;
			  
			   
		   try {
			   conn=DatabaseConfig.getConnection();
			   String query="select * from studentdetails";
	          stmt=conn.createStatement();
				
			      rs=stmt.executeQuery(query);
			   while(rs.next()) {
			   listdetails.add(new Studentdetails(rs.getString("usn"),rs.getString("name"),rs.getString("phonenumber"),rs.getString("currentsem"),rs.getString("department"),rs.getString("cgpa")));
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listdetails;
		}
	public void adddetail(String usn) {
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn=DatabaseConfig.getConnection();
    		String query="insert into studentdetails(usn) values(?)";
    		stmt=conn.prepareStatement(query);
    		stmt.setString(1, usn);
    		stmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	 
	 public void updatedetail(Studentdetails std) {
	    	Connection conn=null;
	    	PreparedStatement stmt=null;
	    	try {
	    		conn=DatabaseConfig.getConnection();
	    		String usn=std.getUsn();
	    		String name=std.getName();
	    		String phonenumber=std.getPhonenumber();
	    		String department=std.getDept();
	    		String currentsem=std.getCurrentsem();
	    		String cgpa=std.getCgpa();
	    		
	    		String query="update studentdetails set name =? , phonenumber=?,department=?,currentsem=?,cgpa=? where usn=?";
	    		stmt=conn.prepareStatement(query);
	    		
	    		stmt.setString(1, name);
	    		stmt.setString(2,phonenumber);
	    	    stmt.setString(3, department);
	    	    stmt.setString(4, currentsem);
	    	    stmt.setString(5, cgpa);
	    	    stmt.setString(6, usn);
	    		stmt.execute();
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	 public List<Studentdetails> listconditiondetails(String mentor_id,String from_usn,String to_usn){
			List<Studentdetails> listdetails =new ArrayList<>();
		   
		   Connection conn=DatabaseConfig.getConnection();
			  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select * from studentdetails s,mentordetails m where s.usn>=m.from_usn and s.usn<=m.end_usn";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
				   if(rs.getString("mentor_id").equals(mentor_id)) {
			   listdetails.add(new Studentdetails(rs.getString("usn"),rs.getString("name"),rs.getString("phonenumber"),rs.getString("currentsem"),rs.getString("department"), rs.getString("cgpa")));
			   }
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listdetails;
		}
	 public List<Studentfeesdetails> listconditionfeedetails(String mentor_id,String from_usn,String to_usn){
			List<Studentfeesdetails> listdetails =new ArrayList<>();
		   
		   Connection conn=DatabaseConfig.getConnection();
			  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select s.usn,s.name,f.Total_fees,f.fees_paid,f.balance,m.mentor_id from studentdetails s,feesdetails f,mentordetails m where s.usn>=m.from_usn and s.usn<=m.end_usn and s.usn=f.usn";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
				   if(rs.getString("mentor_id").equals(mentor_id)) {
			   listdetails.add(new Studentfeesdetails(rs.getString("usn"),rs.getString("name"),rs.getInt("Total_fees"),rs.getInt("fees_paid"),rs.getInt("balance")));
			   }
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return listdetails;
		}
		 

}

