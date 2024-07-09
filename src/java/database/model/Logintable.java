package oxf.database.model;
import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Logintable {
   public List<Logindetails> listusers(){
	List<Logindetails> logindetails =new ArrayList<>();
   
   Connection conn=DatabaseConfig.getConnection();
	  
   Statement stmt=null;
   ResultSet rs=null;
   String query="select * from loginverifier";
   try {
	   stmt=conn.createStatement();
	   rs=stmt.executeQuery(query);
	   while(rs.next()) {
	   logindetails.add(new Logindetails(rs.getString("usn"),rs.getString("password")));
	   }
   }catch(SQLException e) {
	   e.printStackTrace();
   }
   return logindetails;
}
}
 
