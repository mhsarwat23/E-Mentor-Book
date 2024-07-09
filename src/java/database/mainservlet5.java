package oxf.database;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oxf.database.entity.Studentsnameacademics;
import oxf.database.model.Studentacademicssem1;


@WebServlet("/mainservlet5")
public class mainservlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		String page=(String)request.getParameter("page");
   		switch(page){
   		case "listsem1":{
			Cookie[] cook=request.getCookies();
			String from=null,end=null,mentor_id=null;
			for(Cookie coo:cook) {
				if(coo.getName().equals("from_usn")) {
					from=coo.getValue();
				}
				if(coo.getName().equals("end_usn")) {
					end=coo.getValue();
				}
				if(coo.getName().equals("mentor_id")) {
					mentor_id=coo.getValue();
				}
			}
			request.getRequestDispatcher("menteesem1.jsp").forward(request, response);
			break;
			}
   		case "listsem2":{
   			request.getRequestDispatcher("menteesem2.jsp").forward(request, response);
			
   			break;
   		}
   		case "listsem3":{
   			request.getRequestDispatcher("menteesem3.jsp").forward(request, response);
			
   			break;
   		}
   		case "listsem4":{
   			request.getRequestDispatcher("menteesem4.jsp").forward(request, response);
			
   			break;
   		}
   		case "listsem5":{
   			request.getRequestDispatcher("menteesem5.jsp").forward(request, response);
			
   			break;
   		}

   		
   		}
   	
   	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	Cookie[] cook=request.getCookies();
		String from=null,end=null;
		for(Cookie coo:cook) {
			if(coo.getName().equals("from_usn")) {
				from=coo.getValue();
			}
			if(coo.getName().equals("end_usn")) {
				end=coo.getValue();
			}
		}
	*/	
		String page=(String)request.getParameter("page");
   		switch(page){
   		case "listacademic1":{
			
		//	List<Studentsnameacademics> lis=new Studentacademicssem1().listcondition(from, end);
		//	request.setAttribute("listacademicdetails", lis);
			request.getRequestDispatcher("menteesem1.jsp").forward(request, response);
			break;
			}
   		case "listacademic2":{
			
   			//	List<Studentsnameacademics> lis=new Studentacademicssem1().listcondition(from, end);
   			//	request.setAttribute("listacademicdetails", lis);
   				request.getRequestDispatcher("menteesem2.jsp").forward(request, response);
   		break;		
   		}
case "listacademic3":{
			
   			//	List<Studentsnameacademics> lis=new Studentacademicssem1().listcondition(from, end);
   			//	request.setAttribute("listacademicdetails", lis);
   				request.getRequestDispatcher("menteesem3.jsp").forward(request, response);
   			break;	
}
case "listacademic4":{
	
		//	List<Studentsnameacademics> lis=new Studentacademicssem1().listcondition(from, end);
		//	request.setAttribute("listacademicdetails", lis);
			request.getRequestDispatcher("menteesem4.jsp").forward(request, response);
break;			
}
case "listacademic5":{
	
		//	List<Studentsnameacademics> lis=new Studentacademicssem1().listcondition(from, end);
		//	request.setAttribute("listacademicdetails", lis);
			request.getRequestDispatcher("menteesem5.jsp").forward(request, response);
break;			
}
	
   		}

	
	}

}
