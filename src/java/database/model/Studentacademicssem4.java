package oxf.database.model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oxf.database.databaseconfig.DatabaseConfig;
import oxf.database.entity.*;

public class Studentacademicssem4 {
	 public void adddetails(Studentsacademicdetails4 sad) {
		   Connection conn=null;
		   PreparedStatement stmt=null;
		   try {
			   conn=DatabaseConfig.getConnection();
			   String usn=sad.getUsn();
			   String subcode1=sad.getSubcode1();
			   String subname1=sad.getSubname1();
			   int ia1mark1=sad.getIa1marks1();
			   int ia2mark1=sad.getIa2marks1();
			   int ia3mark1=sad.getIa3marks1();
			   int totalinternal1=sad.getTotalinternalmarks1();
			   int externalmarks1=sad.getExternalmarks1();
			   int credits1=sad.getCredits1();
			   
			   
			   String subcode2=sad.getSubcode2();
			   String subname2=sad.getSubname2();
			   int ia1mark2=sad.getIa1marks2();
			   int ia2mark2=sad.getIa2marks2();
			   int ia3mark2=sad.getIa3marks2();
			   int totalinternal2=sad.getTotalinternalmarks2();
			   int externalmarks2=sad.getExternalmarks2();
			   int credits2=sad.getCredits2();
			   
			   String subcode3=sad.getSubcode3();
			   String subname3=sad.getSubname3();
			   int ia1mark3=sad.getIa1marks3();
			   int ia2mark3=sad.getIa2marks3();
			   int ia3mark3=sad.getIa3marks3();
			   int totalinternal3=sad.getTotalinternalmarks3();
			   int externalmarks3=sad.getExternalmarks3();
			   int credits3=sad.getCredits3();
			 
			   String subcode4=sad.getSubcode4();
			   String subname4=sad.getSubname4();
			   int ia1mark4=sad.getIa1marks4();
			   int ia2mark4=sad.getIa2marks4();
			   int ia3mark4=sad.getIa3marks4();
			   int totalinternal4=sad.getTotalinternalmarks4();
			   int externalmarks4=sad.getExternalmarks4();
			   int credits4=sad.getCredits4();
			 
			   String subcode5=sad.getSubcode5();
			   String subname5=sad.getSubname5();
			   int ia1mark5=sad.getIa1marks5();
			   int ia2mark5=sad.getIa2marks5();
			   int ia3mark5=sad.getIa3marks5();
			   int totalinternal5=sad.getTotalinternalmarks5();
			   int externalmarks5=sad.getExternalmarks5();
			   int credits5=sad.getCredits5();
			  
			   String subcode6=sad.getSubcode6();
			   String subname6=sad.getSubname6();
			   int ia1mark6=sad.getIa1marks6();
			   int ia2mark6=sad.getIa2marks6();
			   int ia3mark6=sad.getIa3marks6();
			   int totalinternal6=sad.getTotalinternalmarks6();
			   int externalmarks6=sad.getExternalmarks6();
			   int credits6=sad.getCredits6();
			
			   String subcode7=sad.getSubcode7();
			   String subname7=sad.getSubname7();
			   int ia1mark7=sad.getIa1marks7();
			   int ia2mark7=sad.getIa2marks7();
			   int ia3mark7=sad.getIa3marks7();
			   int totalinternal7=sad.getTotalinternalmarks7();
			   int externalmarks7=sad.getExternalmarks7();
			   int credits7=sad.getCredits7();
			 
			   String subcode8=sad.getSubcode8();
			   String subname8=sad.getSubname8();
			   int ia1mark8=sad.getIa1marks8();
			   int ia2mark8=sad.getIa2marks8();
			   int ia3mark8=sad.getIa3marks8();
			   int totalinternal8=sad.getTotalinternalmarks8();
			   int externalmarks8=sad.getExternalmarks8();
			   int credits8=sad.getCredits8();
			   
			   String subcode9=sad.getSubcode9();
			   String subname9=sad.getSubname9();
			   int ia1mark9=sad.getIa1marks9();
			   int ia2mark9=sad.getIa2marks9();
			   int ia3mark9=sad.getIa3marks9();
			   int totalinternal9=sad.getTotalinternalmarks9();
			   int externalmarks9=sad.getExternalmarks9();
			   int credits9=sad.getCredits9();
			   
			   String subcode10=sad.getSubcode10();
			   String subname10=sad.getSubname10();
			   int ia1mark10=sad.getIa1marks10();
			   int ia2mark10=sad.getIa2marks10();
			   int ia3mark10=sad.getIa3marks10();
			   int totalinternal10=sad.getTotalinternalmarks10();
			   int externalmarks10=sad.getExternalmarks10();
			   int credits10=sad.getCredits10();
			   
			   String query="insert into sem4details(usn,subject_code1,subject_name1,ia1mark1,ia2mark1,ia3mark1,total_internal_marks1,total_external_marks1,credits1,"
			   		+ "subject_code2,subject_name2,ia1mark2,ia2mark2,ia3mark2,total_internal_marks2,total_external_marks2,credits2,"
			   		+ "subject_code3,subject_name3,ia1mark3,ia2mark3,ia3mark3,total_internal_marks3,total_external_marks3,credits3,"
			   		+ "subject_code4,subject_name4,ia1mark4,ia2mark4,ia3mark4,total_internal_marks4,total_external_marks4,credits4,"
			   		+ "subject_code5,subject_name5,ia1mark5,ia2mark5,ia3mark5,total_internal_marks5,total_external_marks5,credits5,"
			   		+ "subject_code6,subject_name6,ia1mark6,ia2mark6,ia3mark6,total_internal_marks6,total_external_marks6,credits6,"
			   		+ "subject_code7,subject_name7,ia1mark7,ia2mark7,ia3mark7,total_internal_marks7,total_external_marks7,credits7,"
			   		+ "subject_code8,subject_name8,ia1mark8,ia2mark8,ia3mark8,total_internal_marks8,total_external_marks8,credits8,"
			   		+ "subject_code9,subject_name9,ia1mark9,ia2mark9,ia3mark9,total_internal_marks9,total_external_marks9,credits9,"	
			   		+ "subject_code10,subject_name10,ia1mark10,ia2mark10,ia3mark10,total_internal_marks10,total_external_marks10,credits10"
			   		+ ")"
			   		+ " values(?,?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?,"
			   		+ "?,?,?,?,?,?,?,?)";
			   stmt=conn.prepareStatement(query);
			   stmt.setString(1, usn);
			   stmt.setString(2, subcode1);
			   stmt.setString(3, subname1);
			   stmt.setInt(4,ia1mark1);
			   stmt.setInt(5,ia2mark1);
			   stmt.setInt(6,ia3mark1);
			   stmt.setInt(7, totalinternal1);
			   stmt.setInt(8, externalmarks1);
			   stmt.setInt(9, credits1);
			   
			   stmt.setString(10, subcode2);
			   stmt.setString(11, subname2);
			   stmt.setInt(12,ia1mark2);
			   stmt.setInt(13,ia2mark2);
			   stmt.setInt(14,ia3mark2);
			   stmt.setInt(15, totalinternal2);
			   stmt.setInt(16, externalmarks2);
			   stmt.setInt(17, credits2);
			   
			   stmt.setString(18, subcode3);
			   stmt.setString(19, subname3);
			   stmt.setInt(20,ia1mark3);
			   stmt.setInt(21,ia2mark3);
			   stmt.setInt(22,ia3mark3);
			   stmt.setInt(23, totalinternal3);
			   stmt.setInt(24, externalmarks3);
			   stmt.setInt(25, credits3);
			   
			   stmt.setString(26, subcode4);
			   stmt.setString(27, subname4);
			   stmt.setInt(28,ia1mark4);
			   stmt.setInt(29,ia2mark4);
			   stmt.setInt(30,ia3mark4);
			   stmt.setInt(31, totalinternal4);
			   stmt.setInt(32, externalmarks4);
			   stmt.setInt(33, credits4);
			   
			   stmt.setString(34, subcode5);
			   stmt.setString(35, subname5);
			   stmt.setInt(36,ia1mark5);
			   stmt.setInt(37,ia2mark5);
			   stmt.setInt(38,ia3mark5);
			   stmt.setInt(39, totalinternal5);
			   stmt.setInt(40, externalmarks5);
			   stmt.setInt(41, credits5);
			   
			   stmt.setString(42, subcode6);
			   stmt.setString(43, subname6);
			   stmt.setInt(44,ia1mark6);
			   stmt.setInt(45,ia2mark6);
			   stmt.setInt(46,ia3mark6);
			   stmt.setInt(47, totalinternal6);
			   stmt.setInt(48, externalmarks6);
			   stmt.setInt(49, credits6);
			   
			   stmt.setString(50, subcode7);
			   stmt.setString(51, subname7);
			   stmt.setInt(52,ia1mark7);
			   stmt.setInt(53,ia2mark7);
			   stmt.setInt(54,ia3mark7);
			   stmt.setInt(55, totalinternal7);
			   stmt.setInt(56, externalmarks7);
			   stmt.setInt(57, credits7);
			   
			   stmt.setString(58, subcode8);
			   stmt.setString(59, subname8);
			   stmt.setInt(60,ia1mark8);
			   stmt.setInt(61,ia2mark8);
			   stmt.setInt(62,ia3mark8);
			   stmt.setInt(63, totalinternal8);
			   stmt.setInt(64, externalmarks8);
			   stmt.setInt(65, credits8);
			   
			   stmt.setString(66, subcode9);
			   stmt.setString(67, subname9);
			   stmt.setInt(68,ia1mark9);
			   stmt.setInt(69,ia2mark9);
			   stmt.setInt(70,ia3mark9);
			   stmt.setInt(71, totalinternal9);
			   stmt.setInt(72, externalmarks9);
			   stmt.setInt(73, credits9);
			   
			   stmt.setString(74, subcode10);
			   stmt.setString(75, subname10);
			   stmt.setInt(76,ia1mark10);
			   stmt.setInt(77,ia2mark10);
			   stmt.setInt(78,ia3mark10);
			   stmt.setInt(79, totalinternal10);
			   stmt.setInt(80, externalmarks10);
			   stmt.setInt(81, credits10);
			   
			   stmt.execute();
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
	   }
	 public void deletedetail(String usn) {
		 Connection conn=null;
		 PreparedStatement stmt=null;
		 try {
			 
			 conn=DatabaseConfig.getConnection();
			 String query1="delete from sem4sgpa where usn=?";
			 stmt=conn.prepareStatement(query1);
			 stmt.setString(1, usn);
			 stmt.execute();
			 String query2="delete from sem4sgpadetails where usn=?";
			 stmt=conn.prepareStatement(query2);
			 stmt.setString(1, usn);
			  stmt.execute();

			 String query="delete from sem4details where usn=?";
			 stmt=conn.prepareStatement(query);
			  stmt.setString(1, usn);
			  stmt.execute();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }

	public List<Studentsacademicdetails4> listcheck() {
		  List<Studentsacademicdetails4> stacdetail=new ArrayList<>();
		  Connection conn=DatabaseConfig.getConnection();
		  Statement stmt=null;
		  ResultSet rs=null;
		  String query="select * from sem4details";
		  try {
			  stmt=conn.createStatement();
			  rs=stmt.executeQuery(query);
			  while(rs.next()) {
				  stacdetail.add(new Studentsacademicdetails4(rs.getString("usn"), rs.getString("subject_code1"),rs.getString("subject_name1"),rs.getInt("ia1mark1"),rs.getInt("ia2mark1"), rs.getInt("ia3mark1"),rs.getInt("total_internal_marks1"),rs.getInt("total_external_marks1"),rs.getInt("credits1"),
						  rs.getString("subject_code2"),rs.getString("subject_name2"),rs.getInt("ia1mark2"),rs.getInt("ia2mark2"),rs.getInt("ia3mark2"),rs.getInt("total_internal_marks2"),rs.getInt("total_external_marks2"),rs.getInt("credits2"),
						  rs.getString("subject_code3"),rs.getString("subject_name3"),rs.getInt("ia1mark3"),rs.getInt("ia2mark3"),rs.getInt("ia3mark3"),rs.getInt("total_internal_marks3"),rs.getInt("total_external_marks3"),rs.getInt("credits3"),
						  rs.getString("subject_code4"),rs.getString("subject_name4"),rs.getInt("ia1mark4"),rs.getInt("ia2mark4"),rs.getInt("ia3mark4"),rs.getInt("total_internal_marks4"),rs.getInt("total_external_marks4"),rs.getInt("credits4"),
						  rs.getString("subject_code5"),rs.getString("subject_name5"),rs.getInt("ia1mark5"),rs.getInt("ia2mark5"),rs.getInt("ia3mark5"),rs.getInt("total_internal_marks5"),rs.getInt("total_external_marks5"),rs.getInt("credits5"),
						  rs.getString("subject_code6"),rs.getString("subject_name6"),rs.getInt("ia1mark6"),rs.getInt("ia2mark6"),rs.getInt("ia3mark6"),rs.getInt("total_internal_marks6"),rs.getInt("total_external_marks6"),rs.getInt("credits6"),
						  rs.getString("subject_code7"),rs.getString("subject_name7"),rs.getInt("ia1mark7"),rs.getInt("ia2mark7"),rs.getInt("ia3mark7"),rs.getInt("total_internal_marks7"),rs.getInt("total_external_marks7"),rs.getInt("credits7"),
						  rs.getString("subject_code8"),rs.getString("subject_name8"),rs.getInt("ia1mark8"),rs.getInt("ia2mark8"),rs.getInt("ia3mark8"),rs.getInt("total_internal_marks8"),rs.getInt("total_external_marks8"),rs.getInt("credits8"),
				           rs.getString("subject_code9"),rs.getString("subject_name9"),rs.getInt("ia1mark9"),rs.getInt("ia2mark9"),rs.getInt("ia3mark9"),rs.getInt("total_internal_marks9"),rs.getInt("total_external_marks9"),rs.getInt("credits9"),
				          rs.getString("subject_code10"),rs.getString("subject_name10"),rs.getInt("ia1mark10"),rs.getInt("ia2mark10"),rs.getInt("ia3mark10"),rs.getInt("total_internal_marks10"),rs.getInt("total_external_marks10"),rs.getInt("credits10")));
					
			  }
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return stacdetail;
	  }
	  public List<Studentsnameacademics4> listcondition(String mentor_id,String from_usn,String end_usn){
		  List<Studentsnameacademics4> sname=new ArrayList<>();
		  Connection conn=DatabaseConfig.getConnection();
		   Statement stmt=null;
		   ResultSet rs=null;
		   String query="select s.name,sem4academic.*,m.mentor_id from studentdetails s,sem4details sem4academic ,mentordetails m where s.usn=sem4academic.usn and s.usn>=m.from_usn and s.usn<=m.end_usn";
		   try {
			   stmt=conn.createStatement();
			   rs=stmt.executeQuery(query);
			   while(rs.next()) {
				   if(rs.getString("mentor_id").equals(mentor_id)) {
						 
				   sname.add(new Studentsnameacademics4(rs.getString("usn"),rs.getString("name"), rs.getString("subject_code1"),rs.getString("subject_name1"),rs.getInt("ia1mark1"),rs.getInt("ia2mark1"), rs.getInt("ia3mark1"),rs.getInt("total_internal_marks1"),rs.getInt("total_external_marks1"),rs.getInt("total_marks1"),rs.getInt("credits1"),
						  rs.getString("subject_code2"),rs.getString("subject_name2"),rs.getInt("ia1mark2"),rs.getInt("ia2mark2"),rs.getInt("ia3mark2"),rs.getInt("total_internal_marks2"),rs.getInt("total_external_marks2"),rs.getInt("total_marks2"),rs.getInt("credits2"),
						  rs.getString("subject_code3"),rs.getString("subject_name3"),rs.getInt("ia1mark3"),rs.getInt("ia2mark3"),rs.getInt("ia3mark3"),rs.getInt("total_internal_marks3"),rs.getInt("total_external_marks3"),rs.getInt("total_marks3"),rs.getInt("credits3"),
						  rs.getString("subject_code4"),rs.getString("subject_name4"),rs.getInt("ia1mark4"),rs.getInt("ia2mark4"),rs.getInt("ia3mark4"),rs.getInt("total_internal_marks4"),rs.getInt("total_external_marks4"),rs.getInt("total_marks4"),rs.getInt("credits4"),
						  rs.getString("subject_code5"),rs.getString("subject_name5"),rs.getInt("ia1mark5"),rs.getInt("ia2mark5"),rs.getInt("ia3mark5"),rs.getInt("total_internal_marks5"),rs.getInt("total_external_marks5"),rs.getInt("total_marks5"),rs.getInt("credits5"),
						  rs.getString("subject_code6"),rs.getString("subject_name6"),rs.getInt("ia1mark6"),rs.getInt("ia2mark6"),rs.getInt("ia3mark6"),rs.getInt("total_internal_marks6"),rs.getInt("total_external_marks6"),rs.getInt("total_marks6"),rs.getInt("credits6"),
						  rs.getString("subject_code7"),rs.getString("subject_name7"),rs.getInt("ia1mark7"),rs.getInt("ia2mark7"),rs.getInt("ia3mark7"),rs.getInt("total_internal_marks7"),rs.getInt("total_external_marks7"),rs.getInt("total_marks7"),rs.getInt("credits7"),
						  rs.getString("subject_code8"),rs.getString("subject_name8"),rs.getInt("ia1mark8"),rs.getInt("ia2mark8"),rs.getInt("ia3mark8"),rs.getInt("total_internal_marks8"),rs.getInt("total_external_marks8"),rs.getInt("total_marks8"),rs.getInt("credits8"),
				   rs.getString("subject_code9"),rs.getString("subject_name9"),rs.getInt("ia1mark9"),rs.getInt("ia2mark9"),rs.getInt("ia3mark9"),rs.getInt("total_internal_marks9"),rs.getInt("total_external_marks9"),rs.getInt("total_marks9"),rs.getInt("credits9"),
					  rs.getString("subject_code10"),rs.getString("subject_name10"),rs.getInt("ia1mark10"),rs.getInt("ia2mark10"),rs.getInt("ia3mark10"),rs.getInt("total_internal_marks10"),rs.getInt("total_external_marks10"),rs.getInt("total_marks10"),rs.getInt("credits10")));
				   }		  
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
		  
		  
		  
		  return sname;
	  }
	  public BigDecimal getsgpa(String usn) {
		  BigDecimal value=null;
		  Connection conn=DatabaseConfig.getConnection();
		  Statement stmt=null;
		  ResultSet rs=null;
		  String query="select * from sem4sgpa";
		  try {
			  stmt=conn.createStatement();
			  rs=stmt.executeQuery(query);
			  while(rs.next()){if(rs.getString("usn").equals(usn)) {
			  
				  value=rs.getBigDecimal("sgpa");
				  }  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
		  return value;
	}
	  public List<Studentsnameacademics4> getresult() {
		  List<Studentsnameacademics4> sds=new ArrayList<>();
		  Connection conn=DatabaseConfig.getConnection();
		  Statement stmt=null;
		  ResultSet rs=null;
		  String query="select s.name,sem4academic.* from studentdetails s,sem4details sem4academic where s.usn=sem4academic.usn";
		  try {
			  stmt=conn.createStatement();
			  rs=stmt.executeQuery(query);
			  while(rs.next()) {
				  sds.add(new Studentsnameacademics4(rs.getString("usn"),rs.getString("name"), rs.getString("subject_code1"),rs.getString("subject_name1"),rs.getInt("ia1mark1"),rs.getInt("ia2mark1"), rs.getInt("ia3mark1"),rs.getInt("total_internal_marks1"),rs.getInt("total_external_marks1"),rs.getInt("total_marks1"),rs.getInt("credits1"),
						  rs.getString("subject_code2"),rs.getString("subject_name2"),rs.getInt("ia1mark2"),rs.getInt("ia2mark2"),rs.getInt("ia3mark2"),rs.getInt("total_internal_marks2"),rs.getInt("total_external_marks2"),rs.getInt("total_marks2"),rs.getInt("credits2"),
						  rs.getString("subject_code3"),rs.getString("subject_name3"),rs.getInt("ia1mark3"),rs.getInt("ia2mark3"),rs.getInt("ia3mark3"),rs.getInt("total_internal_marks3"),rs.getInt("total_external_marks3"),rs.getInt("total_marks3"),rs.getInt("credits3"),
						  rs.getString("subject_code4"),rs.getString("subject_name4"),rs.getInt("ia1mark4"),rs.getInt("ia2mark4"),rs.getInt("ia3mark4"),rs.getInt("total_internal_marks4"),rs.getInt("total_external_marks4"),rs.getInt("total_marks4"),rs.getInt("credits4"),
						  rs.getString("subject_code5"),rs.getString("subject_name5"),rs.getInt("ia1mark5"),rs.getInt("ia2mark5"),rs.getInt("ia3mark5"),rs.getInt("total_internal_marks5"),rs.getInt("total_external_marks5"),rs.getInt("total_marks5"),rs.getInt("credits5"),
						  rs.getString("subject_code6"),rs.getString("subject_name6"),rs.getInt("ia1mark6"),rs.getInt("ia2mark6"),rs.getInt("ia3mark6"),rs.getInt("total_internal_marks6"),rs.getInt("total_external_marks6"),rs.getInt("total_marks6"),rs.getInt("credits6"),
						  rs.getString("subject_code7"),rs.getString("subject_name7"),rs.getInt("ia1mark7"),rs.getInt("ia2mark7"),rs.getInt("ia3mark7"),rs.getInt("total_internal_marks7"),rs.getInt("total_external_marks7"),rs.getInt("total_marks7"),rs.getInt("credits7"),
						  rs.getString("subject_code8"),rs.getString("subject_name8"),rs.getInt("ia1mark8"),rs.getInt("ia2mark8"),rs.getInt("ia3mark8"),rs.getInt("total_internal_marks8"),rs.getInt("total_external_marks8"),rs.getInt("total_marks8"),rs.getInt("credits8"),
				   rs.getString("subject_code9"),rs.getString("subject_name9"),rs.getInt("ia1mark9"),rs.getInt("ia2mark9"),rs.getInt("ia3mark9"),rs.getInt("total_internal_marks9"),rs.getInt("total_external_marks9"),rs.getInt("total_marks9"),rs.getInt("credits9"),
					  rs.getString("subject_code10"),rs.getString("subject_name10"),rs.getInt("ia1mark10"),rs.getInt("ia2mark10"),rs.getInt("ia3mark10"),rs.getInt("total_internal_marks10"),rs.getInt("total_external_marks10"),rs.getInt("total_marks10"),rs.getInt("credits10")));
						  
			 	  }
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return sds;
	  }
}
