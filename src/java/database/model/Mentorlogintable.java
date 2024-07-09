package oxf.database.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.Logindetails;
import oxf.database.entity.Mentorlogindetails;

public class Mentorlogintable {
	public List<Mentorlogindetails> listusers(){
		List<Mentorlogindetails> logindetails =new ArrayList<>();
	   
	   Connection conn=DatabaseConfig.getConnection();
		  
	   Statement stmt=null;
	   ResultSet rs=null;
	   String query="select * from mentorverifier";
	   try {
		   stmt=conn.createStatement();
		   rs=stmt.executeQuery(query);
		   while(rs.next()) {
		   logindetails.add(new Mentorlogindetails(rs.getString("mentor_id"),rs.getString("password")));
		   }
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
	   return logindetails;
	}
}
