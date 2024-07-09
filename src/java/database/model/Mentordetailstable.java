package oxf.database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.Mentordetails;

public class Mentordetailstable {
	public List<Mentordetails> listusers(){
		List<Mentordetails> logindetails =new ArrayList<>();
	   
	   Connection conn=DatabaseConfig.getConnection();
		  
	   Statement stmt=null;
	   ResultSet rs=null;
	   String query="select * from mentordetails";
	   try {
		   stmt=conn.createStatement();
		   rs=stmt.executeQuery(query);
		   while(rs.next()) {
		   logindetails.add(new Mentordetails(rs.getString("mentor_id"),rs.getString("name"),rs.getString("from_usn"),rs.getString("end_usn")));
		   }
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
	   return logindetails;
	}
	 public void updatedetail(Mentordetails std) {
	    	Connection conn=null;
	    	PreparedStatement stmt=null;
	    	try {
	    		conn=DatabaseConfig.getConnection();
	    		String mentor_id=std.getMentor_id();
	    		String mentorname=std.getName();
	    		String from_usn=std.getFrom_usn();
	    		String to_usn=std.getEnd_usn();
	    		
	    		String query="update mentordetails set name =? , from_usn=?,end_usn=? where mentor_id=?";
	    		stmt=conn.prepareStatement(query);
	    		
	    		stmt.setString(1, mentorname);
	    		stmt.setString(2,from_usn);
	    	    stmt.setString(3, to_usn);
	    	    stmt.setString(4, mentor_id);
	    	    stmt.execute();
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	 public Mentordetails listspecific(String mentor_id) {
		 Mentordetails md=null;
		 Connection conn=DatabaseConfig.getConnection();
		  
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select * from mentordetails";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
				   if(rs.getString("mentor_id").equals(mentor_id)) {
					   md=new Mentordetails(rs.getString("mentor_id"),rs.getString("name"),rs.getString("from_usn"),rs.getString("end_usn"));
				   }
			
	 }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return md;
	 }
		public void adddetail(String mentor_id) {
			Connection conn=null;
			PreparedStatement stmt=null;
			try {
				conn=DatabaseConfig.getConnection();
	    		String query="insert into mentordetails(mentor_id) values(?)";
	    		stmt=conn.prepareStatement(query);
	    		stmt.setString(1, mentor_id);
	    		stmt.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}
