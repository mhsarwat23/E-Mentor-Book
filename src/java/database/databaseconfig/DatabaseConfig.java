package oxf.database.databaseconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	 public static Connection getConnection() {
		  String dbUrl="jdbc:mysql://localhost:3306/dbmsproject";
		  String dbUsername="root";
		  String dbPassword="Akka@1410";
		  Connection con=null;
		  try{
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		  }catch(ClassNotFoundException e) {
			  e.printStackTrace();
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return con;
	  }
}
