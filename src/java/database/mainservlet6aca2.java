package oxf.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oxf.database.entity.*;
import oxf.database.model.*;


@WebServlet("/academicservlet2")
public class mainservlet6aca2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String page=request.getParameter("page").toLowerCase();
	String usn=null;
	Cookie[] coo=request.getCookies();
	for(Cookie co:coo) {
		if(co.getName().equals("usn")) {
			usn=co.getValue();
			
		}
	}
	
	switch(page){
	case "submittingform3":{
		
		String subcode1=request.getParameter("subCode1");
		String subname1=request.getParameter("subName1");
		int ia1marks1=Integer.parseInt(request.getParameter("ia1Marks1"));
		int ia2marks1=Integer.parseInt(request.getParameter("ia2Marks1"));
		int ia3marks1=Integer.parseInt(request.getParameter("ia3Marks1"));
		int totalinternalmarks1=Integer.parseInt(request.getParameter("totalInternalMarks1"));
		int externalmarks1=Integer.parseInt(request.getParameter("externalMarks1"));
		int credits1=Integer.parseInt(request.getParameter("credits1"));
		
		
		
		//2nd subject
		String subcode2=request.getParameter("subCode2");
		String subname2=request.getParameter("subName2");
		int ia1marks2=Integer.parseInt(request.getParameter("ia1Marks2"));
		int ia2marks2=Integer.parseInt(request.getParameter("ia2Marks2"));
		int ia3marks2=Integer.parseInt(request.getParameter("ia3Marks2"));
		int totalinternalmarks2=Integer.parseInt(request.getParameter("totalInternalMarks2"));
		int externalmarks2=Integer.parseInt(request.getParameter("externalMarks2"));
		int credits2=Integer.parseInt(request.getParameter("credits2"));
		
		//3rd subject
				String subcode3=request.getParameter("subCode3");
				String subname3=request.getParameter("subName3");
				int ia1marks3=Integer.parseInt(request.getParameter("ia1Marks3"));
				int ia2marks3=Integer.parseInt(request.getParameter("ia2Marks3"));
				int ia3marks3=Integer.parseInt(request.getParameter("ia3Marks3"));
				int totalinternalmarks3=Integer.parseInt(request.getParameter("totalInternalMarks3"));
				int externalmarks3=Integer.parseInt(request.getParameter("externalMarks3"));
				int credits3=Integer.parseInt(request.getParameter("credits3"));
				
				//4nd subject
				String subcode4=request.getParameter("subCode4");
				String subname4=request.getParameter("subName4");
				int ia1marks4=Integer.parseInt(request.getParameter("ia1Marks4"));
				int ia2marks4=Integer.parseInt(request.getParameter("ia2Marks4"));
				int ia3marks4=Integer.parseInt(request.getParameter("ia3Marks4"));
				int totalinternalmarks4=Integer.parseInt(request.getParameter("totalInternalMarks4"));
				int externalmarks4=Integer.parseInt(request.getParameter("externalMarks4"));
				int credits4=Integer.parseInt(request.getParameter("credits4"));
				
				//5th subject
				String subcode5=request.getParameter("subCode5");
				String subname5=request.getParameter("subName5");
				int ia1marks5=Integer.parseInt(request.getParameter("ia1Marks5"));
				int ia2marks5=Integer.parseInt(request.getParameter("ia2Marks5"));
				int ia3marks5=Integer.parseInt(request.getParameter("ia3Marks5"));
				int totalinternalmarks5=Integer.parseInt(request.getParameter("totalInternalMarks5"));
				int externalmarks5=Integer.parseInt(request.getParameter("externalMarks5"));
				int credits5=Integer.parseInt(request.getParameter("credits5"));
			
				//6th subject
				String subcode6=request.getParameter("subCode6");
				String subname6=request.getParameter("subName6");
				int ia1marks6=Integer.parseInt(request.getParameter("ia1Marks6"));
				int ia2marks6=Integer.parseInt(request.getParameter("ia2Marks6"));
				int ia3marks6=Integer.parseInt(request.getParameter("ia3Marks6"));
				int totalinternalmarks6=Integer.parseInt(request.getParameter("totalInternalMarks6"));
				int externalmarks6=Integer.parseInt(request.getParameter("externalMarks6"));
				int credits6=Integer.parseInt(request.getParameter("credits6"));
				
				//7th subject
				String subcode7=request.getParameter("subCode7");
				String subname7=request.getParameter("subName7");
				int ia1marks7=Integer.parseInt(request.getParameter("ia1Marks7"));
				int ia2marks7=Integer.parseInt(request.getParameter("ia2Marks7"));
				int ia3marks7=Integer.parseInt(request.getParameter("ia3Marks7"));
				int totalinternalmarks7=Integer.parseInt(request.getParameter("totalInternalMarks7"));
				int externalmarks7=Integer.parseInt(request.getParameter("externalMarks7"));
				int credits7=Integer.parseInt(request.getParameter("credits7"));
				
				//8th subject
				String subcode8=request.getParameter("subCode8");
				String subname8=request.getParameter("subName8");
				int ia1marks8=Integer.parseInt(request.getParameter("ia1Marks8"));
				int ia2marks8=Integer.parseInt(request.getParameter("ia2Marks8"));
				int ia3marks8=Integer.parseInt(request.getParameter("ia3Marks8"));
				int totalinternalmarks8=Integer.parseInt(request.getParameter("totalInternalMarks8"));
				int externalmarks8=Integer.parseInt(request.getParameter("externalMarks8"));
				int credits8=Integer.parseInt(request.getParameter("credits8"));
				Studentsacademics3details stdacademicdetail=new Studentsacademics3details(usn,subcode1,subname1,ia1marks1,ia2marks1,ia3marks1,totalinternalmarks1,externalmarks1,credits1,subcode2,subname2,ia1marks2,ia2marks2,ia3marks2,totalinternalmarks2,externalmarks2,credits2,
						subcode3,subname3,ia1marks3,ia2marks3,ia3marks3,totalinternalmarks3,externalmarks3,credits3,		
						subcode4,subname4,ia1marks4,ia2marks4,ia3marks4,totalinternalmarks4,externalmarks4,credits4,
						subcode5,subname5,ia1marks5,ia2marks5,ia3marks5,totalinternalmarks5,externalmarks5,credits5,
						subcode6,subname6,ia1marks6,ia2marks6,ia3marks6,totalinternalmarks6,externalmarks6,credits6,
						subcode7,subname7,ia1marks7,ia2marks7,ia3marks7,totalinternalmarks7,externalmarks7,credits7,
						subcode8,subname8,ia1marks8,ia2marks8,ia3marks8,totalinternalmarks8,externalmarks8,credits8);
				    List<Studentsacademics3details> stsacademic=new Studentacademicssem3().listcheck();
				  for(Studentsacademics3details sa:stsacademic) {
				if(sa.getUsn().equals(usn)) {
					new Studentacademicssem3().deletedetail(usn);
					new Studentacademicssem3().adddetails(stdacademicdetail);
				BigDecimal sgpa=new Studentacademicssem3().getsgpa(usn);
				
				    request.setAttribute("sgpa", sgpa);
				    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);
              	}
			}
			   new Studentacademicssem3().adddetails(stdacademicdetail);
			    BigDecimal sgpa=new Studentacademicssem3().getsgpa(usn);
			    request.setAttribute("sgpa", sgpa);
			    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);
	
                  break;
		
	}
case "submittingform4":{
		
		String subcode1=request.getParameter("subCode1");
		String subname1=request.getParameter("subName1");
		int ia1marks1=Integer.parseInt(request.getParameter("ia1Marks1"));
		int ia2marks1=Integer.parseInt(request.getParameter("ia2Marks1"));
		int ia3marks1=Integer.parseInt(request.getParameter("ia3Marks1"));
		int totalinternalmarks1=Integer.parseInt(request.getParameter("totalInternalMarks1"));
		int externalmarks1=Integer.parseInt(request.getParameter("externalMarks1"));
		int credits1=Integer.parseInt(request.getParameter("credits1"));
		
		
		
		//2nd subject
		String subcode2=request.getParameter("subCode2");
		String subname2=request.getParameter("subName2");
		int ia1marks2=Integer.parseInt(request.getParameter("ia1Marks2"));
		int ia2marks2=Integer.parseInt(request.getParameter("ia2Marks2"));
		int ia3marks2=Integer.parseInt(request.getParameter("ia3Marks2"));
		int totalinternalmarks2=Integer.parseInt(request.getParameter("totalInternalMarks2"));
		int externalmarks2=Integer.parseInt(request.getParameter("externalMarks2"));
		int credits2=Integer.parseInt(request.getParameter("credits2"));
		
		//3rd subject
				String subcode3=request.getParameter("subCode3");
				String subname3=request.getParameter("subName3");
				int ia1marks3=Integer.parseInt(request.getParameter("ia1Marks3"));
				int ia2marks3=Integer.parseInt(request.getParameter("ia2Marks3"));
				int ia3marks3=Integer.parseInt(request.getParameter("ia3Marks3"));
				int totalinternalmarks3=Integer.parseInt(request.getParameter("totalInternalMarks3"));
				int externalmarks3=Integer.parseInt(request.getParameter("externalMarks3"));
				int credits3=Integer.parseInt(request.getParameter("credits3"));
				
				//4nd subject
				String subcode4=request.getParameter("subCode4");
				String subname4=request.getParameter("subName4");
				int ia1marks4=Integer.parseInt(request.getParameter("ia1Marks4"));
				int ia2marks4=Integer.parseInt(request.getParameter("ia2Marks4"));
				int ia3marks4=Integer.parseInt(request.getParameter("ia3Marks4"));
				int totalinternalmarks4=Integer.parseInt(request.getParameter("totalInternalMarks4"));
				int externalmarks4=Integer.parseInt(request.getParameter("externalMarks4"));
				int credits4=Integer.parseInt(request.getParameter("credits4"));
				
				//5th subject
				String subcode5=request.getParameter("subCode5");
				String subname5=request.getParameter("subName5");
				int ia1marks5=Integer.parseInt(request.getParameter("ia1Marks5"));
				int ia2marks5=Integer.parseInt(request.getParameter("ia2Marks5"));
				int ia3marks5=Integer.parseInt(request.getParameter("ia3Marks5"));
				int totalinternalmarks5=Integer.parseInt(request.getParameter("totalInternalMarks5"));
				int externalmarks5=Integer.parseInt(request.getParameter("externalMarks5"));
				int credits5=Integer.parseInt(request.getParameter("credits5"));
			
				//6th subject
				String subcode6=request.getParameter("subCode6");
				String subname6=request.getParameter("subName6");
				int ia1marks6=Integer.parseInt(request.getParameter("ia1Marks6"));
				int ia2marks6=Integer.parseInt(request.getParameter("ia2Marks6"));
				int ia3marks6=Integer.parseInt(request.getParameter("ia3Marks6"));
				int totalinternalmarks6=Integer.parseInt(request.getParameter("totalInternalMarks6"));
				int externalmarks6=Integer.parseInt(request.getParameter("externalMarks6"));
				int credits6=Integer.parseInt(request.getParameter("credits6"));
				
				//7th subject
				String subcode7=request.getParameter("subCode7");
				String subname7=request.getParameter("subName7");
				int ia1marks7=Integer.parseInt(request.getParameter("ia1Marks7"));
				int ia2marks7=Integer.parseInt(request.getParameter("ia2Marks7"));
				int ia3marks7=Integer.parseInt(request.getParameter("ia3Marks7"));
				int totalinternalmarks7=Integer.parseInt(request.getParameter("totalInternalMarks7"));
				int externalmarks7=Integer.parseInt(request.getParameter("externalMarks7"));
				int credits7=Integer.parseInt(request.getParameter("credits7"));
				
				//8th subject
				String subcode8=request.getParameter("subCode8");
				String subname8=request.getParameter("subName8");
				int ia1marks8=Integer.parseInt(request.getParameter("ia1Marks8"));
				int ia2marks8=Integer.parseInt(request.getParameter("ia2Marks8"));
				int ia3marks8=Integer.parseInt(request.getParameter("ia3Marks8"));
				int totalinternalmarks8=Integer.parseInt(request.getParameter("totalInternalMarks8"));
				int externalmarks8=Integer.parseInt(request.getParameter("externalMarks8"));
				int credits8=Integer.parseInt(request.getParameter("credits8"));
				
				//9th subject
				String subcode9=request.getParameter("subCode9");
				String subname9=request.getParameter("subName9");
				int ia1marks9=Integer.parseInt(request.getParameter("ia1Marks9"));
				int ia2marks9=Integer.parseInt(request.getParameter("ia2Marks9"));
				int ia3marks9=Integer.parseInt(request.getParameter("ia3Marks9"));
				int totalinternalmarks9=Integer.parseInt(request.getParameter("totalInternalMarks9"));
				int externalmarks9=Integer.parseInt(request.getParameter("externalMarks9"));
				int credits9=Integer.parseInt(request.getParameter("credits9"));
				
				//9th subject
				String subcode10=request.getParameter("subCode10");
				String subname10=request.getParameter("subName10");
				int ia1marks10=Integer.parseInt(request.getParameter("ia1Marks10"));
				int ia2marks10=Integer.parseInt(request.getParameter("ia2Marks10"));
				int ia3marks10=Integer.parseInt(request.getParameter("ia3Marks10"));
				int totalinternalmarks10=Integer.parseInt(request.getParameter("totalInternalMarks10"));
				int externalmarks10=Integer.parseInt(request.getParameter("externalMarks10"));
				int credits10=Integer.parseInt(request.getParameter("credits10"));
				
				Studentsacademicdetails4 stdacademicdetail=new Studentsacademicdetails4(usn,subcode1,subname1,ia1marks1,ia2marks1,ia3marks1,totalinternalmarks1,externalmarks1,credits1,
						subcode2,subname2,ia1marks2,ia2marks2,ia3marks2,totalinternalmarks2,externalmarks2,credits2,
						subcode3,subname3,ia1marks3,ia2marks3,ia3marks3,totalinternalmarks3,externalmarks3,credits3,		
						subcode4,subname4,ia1marks4,ia2marks4,ia3marks4,totalinternalmarks4,externalmarks4,credits4,
						subcode5,subname5,ia1marks5,ia2marks5,ia3marks5,totalinternalmarks5,externalmarks5,credits5,
						subcode6,subname6,ia1marks6,ia2marks6,ia3marks6,totalinternalmarks6,externalmarks6,credits6,
						subcode7,subname7,ia1marks7,ia2marks7,ia3marks7,totalinternalmarks7,externalmarks7,credits7,
						subcode8,subname8,ia1marks8,ia2marks8,ia3marks8,totalinternalmarks8,externalmarks8,credits8,
						subcode9,subname9,ia1marks9,ia2marks9,ia3marks9,totalinternalmarks9,externalmarks9,credits9,
						subcode10,subname10,ia1marks10,ia2marks10,ia3marks10,totalinternalmarks10,externalmarks10,credits10);
				    List<Studentsacademicdetails4> stsacademic=new Studentacademicssem4().listcheck();   
			    for(Studentsacademicdetails4 sa:stsacademic) {
				if(sa.getUsn().equals(usn)) {
					new Studentacademicssem4().deletedetail(usn);
					new Studentacademicssem4().adddetails(stdacademicdetail);
					BigDecimal sgpa=new Studentacademicssem4().getsgpa(usn);
				    request.setAttribute("sgpa", sgpa);
				    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);
                	}
			}
			  
			   new Studentacademicssem4().adddetails(stdacademicdetail);
			    BigDecimal sgpa=new Studentacademicssem4().getsgpa(usn);
			    request.setAttribute("sgpa", sgpa);
			    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);
			    break;
			    
	}
case "submittingform5":{
	
	String subcode1=request.getParameter("subCode1");
	String subname1=request.getParameter("subName1");
	int ia1marks1=Integer.parseInt(request.getParameter("ia1Marks1"));
	int ia2marks1=Integer.parseInt(request.getParameter("ia2Marks1"));
	int ia3marks1=Integer.parseInt(request.getParameter("ia3Marks1"));
	int totalinternalmarks1=Integer.parseInt(request.getParameter("totalInternalMarks1"));
	int externalmarks1=Integer.parseInt(request.getParameter("externalMarks1"));
	int credits1=Integer.parseInt(request.getParameter("credits1"));
	
	
	
	//2nd subject
	String subcode2=request.getParameter("subCode2");
	String subname2=request.getParameter("subName2");
	int ia1marks2=Integer.parseInt(request.getParameter("ia1Marks2"));
	int ia2marks2=Integer.parseInt(request.getParameter("ia2Marks2"));
	int ia3marks2=Integer.parseInt(request.getParameter("ia3Marks2"));
	int totalinternalmarks2=Integer.parseInt(request.getParameter("totalInternalMarks2"));
	int externalmarks2=Integer.parseInt(request.getParameter("externalMarks2"));
	int credits2=Integer.parseInt(request.getParameter("credits2"));
	
	//3rd subject
			String subcode3=request.getParameter("subCode3");
			String subname3=request.getParameter("subName3");
			int ia1marks3=Integer.parseInt(request.getParameter("ia1Marks3"));
			int ia2marks3=Integer.parseInt(request.getParameter("ia2Marks3"));
			int ia3marks3=Integer.parseInt(request.getParameter("ia3Marks3"));
			int totalinternalmarks3=Integer.parseInt(request.getParameter("totalInternalMarks3"));
			int externalmarks3=Integer.parseInt(request.getParameter("externalMarks3"));
			int credits3=Integer.parseInt(request.getParameter("credits3"));
			
			//4nd subject
			String subcode4=request.getParameter("subCode4");
			String subname4=request.getParameter("subName4");
			int ia1marks4=Integer.parseInt(request.getParameter("ia1Marks4"));
			int ia2marks4=Integer.parseInt(request.getParameter("ia2Marks4"));
			int ia3marks4=Integer.parseInt(request.getParameter("ia3Marks4"));
			int totalinternalmarks4=Integer.parseInt(request.getParameter("totalInternalMarks4"));
			int externalmarks4=Integer.parseInt(request.getParameter("externalMarks4"));
			int credits4=Integer.parseInt(request.getParameter("credits4"));
			
			//5th subject
			String subcode5=request.getParameter("subCode5");
			String subname5=request.getParameter("subName5");
			int ia1marks5=Integer.parseInt(request.getParameter("ia1Marks5"));
			int ia2marks5=Integer.parseInt(request.getParameter("ia2Marks5"));
			int ia3marks5=Integer.parseInt(request.getParameter("ia3Marks5"));
			int totalinternalmarks5=Integer.parseInt(request.getParameter("totalInternalMarks5"));
			int externalmarks5=Integer.parseInt(request.getParameter("externalMarks5"));
			int credits5=Integer.parseInt(request.getParameter("credits5"));
		
			//6th subject
			String subcode6=request.getParameter("subCode6");
			String subname6=request.getParameter("subName6");
			int ia1marks6=Integer.parseInt(request.getParameter("ia1Marks6"));
			int ia2marks6=Integer.parseInt(request.getParameter("ia2Marks6"));
			int ia3marks6=Integer.parseInt(request.getParameter("ia3Marks6"));
			int totalinternalmarks6=Integer.parseInt(request.getParameter("totalInternalMarks6"));
			int externalmarks6=Integer.parseInt(request.getParameter("externalMarks6"));
			int credits6=Integer.parseInt(request.getParameter("credits6"));
			
			//7th subject
			String subcode7=request.getParameter("subCode7");
			String subname7=request.getParameter("subName7");
			int ia1marks7=Integer.parseInt(request.getParameter("ia1Marks7"));
			int ia2marks7=Integer.parseInt(request.getParameter("ia2Marks7"));
			int ia3marks7=Integer.parseInt(request.getParameter("ia3Marks7"));
			int totalinternalmarks7=Integer.parseInt(request.getParameter("totalInternalMarks7"));
			int externalmarks7=Integer.parseInt(request.getParameter("externalMarks7"));
			int credits7=Integer.parseInt(request.getParameter("credits7"));
			
			//8th subject
			String subcode8=request.getParameter("subCode8");
			String subname8=request.getParameter("subName8");
			int ia1marks8=Integer.parseInt(request.getParameter("ia1Marks8"));
			int ia2marks8=Integer.parseInt(request.getParameter("ia2Marks8"));
			int ia3marks8=Integer.parseInt(request.getParameter("ia3Marks8"));
			int totalinternalmarks8=Integer.parseInt(request.getParameter("totalInternalMarks8"));
			int externalmarks8=Integer.parseInt(request.getParameter("externalMarks8"));
			int credits8=Integer.parseInt(request.getParameter("credits8"));
			Studentsacademics3details stdacademicdetail=new Studentsacademics3details(usn,subcode1,subname1,ia1marks1,ia2marks1,ia3marks1,totalinternalmarks1,externalmarks1,credits1,
					subcode2,subname2,ia1marks2,ia2marks2,ia3marks2,totalinternalmarks2,externalmarks2,credits2,
					subcode3,subname3,ia1marks3,ia2marks3,ia3marks3,totalinternalmarks3,externalmarks3,credits3,		
					subcode4,subname4,ia1marks4,ia2marks4,ia3marks4,totalinternalmarks4,externalmarks4,credits4,
					subcode5,subname5,ia1marks5,ia2marks5,ia3marks5,totalinternalmarks5,externalmarks5,credits5,
					subcode6,subname6,ia1marks6,ia2marks6,ia3marks6,totalinternalmarks6,externalmarks6,credits6,
					subcode7,subname7,ia1marks7,ia2marks7,ia3marks7,totalinternalmarks7,externalmarks7,credits7,
					subcode8,subname8,ia1marks8,ia2marks8,ia3marks8,totalinternalmarks8,externalmarks8,credits8);
			    List<Studentsacademics3details> stsacademic=new Studentacademicssem5().listcheck();   
			for(Studentsacademics3details sa:stsacademic) {
			if(sa.getUsn().equals(usn)) {
				new Studentacademicssem5().deletedetail(usn);
				new Studentacademicssem5().adddetails(stdacademicdetail);
				BigDecimal sgpa=new Studentacademicssem5().getsgpa(usn);
			    request.setAttribute("sgpa", sgpa);
			    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);
            	}
		}
		    new Studentacademicssem5().adddetails(stdacademicdetail);
		    BigDecimal sgpa=new Studentacademicssem5().getsgpa(usn);
		    request.setAttribute("sgpa", sgpa);
		    request.getRequestDispatcher("viewsgpa.jsp").forward(request, response);

	       break;
}
	
	}
   	
   	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
