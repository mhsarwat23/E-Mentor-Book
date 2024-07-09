package oxf.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;
import oxf.database.entity.Feesdetails;
import oxf.database.entity.Mentordetails;
import oxf.database.entity.Mentorlogindetails;
import oxf.database.entity.Studentdetails;
import oxf.database.entity.Studentfeesdetails;
import oxf.database.entity.*;
import oxf.database.model.*;

@WebServlet("/mainservlet3")
public class mainservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=(String)request.getParameter("page");
		switch(page){
				case "liststudent":{
					getstudentdetails(request,response);
					break;
				}
				case "reloadhome":{
					String mentor_id=null;
					Cookie[] coo=request.getCookies();
					if(coo!=null) {
						for(Cookie co:coo) {
							if(co.getName().equals("mentor_id")) {
								mentor_id=co.getValue();
							}
						}
						
					}
					check(mentor_id,request,response);
					break;
				}
				case "updatedetail":{
					updatedetail(request,response);
					break;  
				}
				case "listmenteefees":{
					getmenteefeesdetails(request,response);
					break;  
				}
				case "updatestudentdetmentor":{
					String usn=request.getParameter("usn");	
				    liststudentdetail(usn,request,response);
				    break;
				}
				case "updatementeefee":{
					String usn=request.getParameter("usn");
					int balance=Integer.parseInt(request.getParameter("balance"));
					request.setAttribute("balance",balance);
					List<Studentfeesdetails> listfee=new Feesdetailstable().listnamefees();
					for(Studentfeesdetails feedet:listfee) {
				    if(feedet.getUsn().equals(usn)) {		
				    request.setAttribute("usn",usn);
					request.setAttribute("name", feedet.getName());
					request.setAttribute("total_fees", feedet.getTotal_fees());
					request.setAttribute("fees_paid", feedet.getFees_paid());
					request.setAttribute("balance", feedet.getBalance());
					request.getRequestDispatcher("mentorstudentfeeupdate.jsp").forward(request, response);
					break;
				}
					}
				
		}
				case "listacademic":{
					Cookie[] cook=request.getCookies();
					String from=null,end=null;
					for(Cookie coo:cook) {
						if(coo.getName().equals("from_usn")) {
							from=coo.getValue();
						}
						if(coo.getName().equals("end_usn")) {
							end=coo.getValue();
						}
					}
		
				
				request.getRequestDispatcher("mentoracademic.jsp").forward(request, response);
					break;
					
				}
				case "logout":{
					Cookie[] coo=request.getCookies();
					for(Cookie co:coo) {
						co.setMaxAge(0);
					}
					request.getRequestDispatcher("indexmentor.jsp").forward(request, response);
				}
					}
	}
		protected void verifymentordetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Mentorlogindetails> listmentorlogin=new Mentorlogintable().listusers();
			
			String mentor_id=request.getParameter("mentor_id");
			String password=request.getParameter("password");
			if(chklist(listmentorlogin,mentor_id,password)) {
				List<Mentordetails> mentordetails=new Mentordetailstable().listusers();
				if(!checklist(mentordetails,request,response)) {
					new Mentordetailstable().adddetail(mentor_id);
					
				}
					
				
				request.getSession().invalidate();
					HttpSession newsession=(HttpSession) request.getSession();
					newsession.setMaxInactiveInterval(500);
					Cookie cook=new Cookie("mentor_id",mentor_id);
					response.addCookie(cook);
					request.getRequestDispatcher("mentorhome.jsp").forward(request, response);
			
				}else {
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=(String)request.getParameter("page").toLowerCase();
		switch(page) {
		case "verifymentor":{
				verifymentordetails(request, response);
				break;
				
		}
		case "liststudent":{
			getstudentdetails(request,response);
			break;
		}
		case "updateuseroperation":
		{  String mentor_id=null;
        Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("mentor_id")) {
					mentor_id=co.getValue();
				}
			}
		}
		Cookie cook1=new Cookie("from_usn",request.getParameter("from_usn"));
		response.addCookie(cook1);
		Cookie cook2=new Cookie("end_usn",request.getParameter("end_usn"));
		response.addCookie(cook2);
       
			
			Mentordetails std=new Mentordetails(mentor_id,request.getParameter("mentorname"),request.getParameter("from_usn"),request.getParameter("to_usn"));
		new Mentordetailstable().updatedetail(std);
        request.setAttribute("title", "Home");
		
		homeee(request,response);
			break;
	}
		case "updatestudentmentoroperation":{
			String usn=request.getParameter("usn");
			String name=request.getParameter("name");
			String phonenumber=request.getParameter("phonenumber");
			String cursem=request.getParameter("cursem");
			String dept=request.getParameter("department");
			String cgpa=request.getParameter("cgpa");
			Studentdetails std=new Studentdetails(usn,name,phonenumber,cursem,dept,cgpa);
			updatementorstudentdetail(std,request,response);
			break;
		}
		case "updatestudentfeementoroperation":{
			String usn=request.getParameter("usn");
			int totalfees=Integer.parseInt(request.getParameter("totalfees"));
		    int feespaid=Integer.parseInt(request.getParameter("feespaid"));
		    new Feesdetailstable().updatefee(usn, totalfees, feespaid);
		    Cookie[] cook=request.getCookies();
		    String from_usn=null,end_usn=null;
		    for(Cookie coo:cook) {
		    	if(coo.getName().equals("from_usn")) {
		    		from_usn=coo.getValue();
		    	}
		    	if(coo.getName().equals("end_usn")) {
		    		end_usn=coo.getValue();
		    	}
		    }
		    listing(from_usn,end_usn,request,response);
		break;
	}
	}
	}
	protected void listing(String from_usn,String end_usn,HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
		PrintWriter out=response.getWriter();
		out.println(from_usn);
		out.println(end_usn);
		List<Studentfeesdetails> std=  new Studentdetailstable().listconditionfeedetails(from_usn, end_usn);
		  request.setAttribute("liststudentfeesdetails", std);
		    request.getRequestDispatcher("listmenteefeesdetail.jsp").forward(request, response);
		
	
	}
	public boolean chklist(List<Mentorlogindetails> listmentorlogin,String mentor_id,String password) {
		for (Mentorlogindetails lgdn : listmentorlogin) {
			if (lgdn.getmentorid().equals(mentor_id) && lgdn.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	
	}
	protected boolean checklist(List<Mentordetails> mentordetails,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mentor_id=null;
        Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("mentor_id")) {
					mentor_id=co.getValue();
				}
			}
		}
		boolean present=false;
		for(Mentordetails mentordet:mentordetails) {
			if(mentordet.getMentor_id().equals(mentor_id)) {
				request.setAttribute("mentor_id",mentordet.getMentor_id());
				request.setAttribute("mentorname",mentordet.getName() );
				request.setAttribute("from_usn",mentordet.getFrom_usn());
				request.setAttribute("end_usn",mentordet.getEnd_usn() );
				present=true;
		}
		}
		return present;
	}
	protected void homeee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String mentor_id=null;
	        Cookie[] coo=request.getCookies();
			if(coo!=null) {
				for(Cookie co:coo) {
					if(co.getName().equals("mentor_id")) {
						mentor_id=co.getValue();
					}
				}}
			check(mentor_id,request,response);
		
	}
	protected void getstudentdetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String from_usn=null;
        String end_usn=null;
        String mentor_id=null;
     Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("from_usn")) {
					from_usn=co.getValue();
				}
				if(co.getName().equals("end_usn")) {
					end_usn=co.getValue();
				}
				if(co.getName().equals("mentor_id")) {
					mentor_id=co.getValue();
				}
			
			
			}
		}
		List<Studentdetails> stddetails=new Studentdetailstable().listconditiondetails(mentor_id,from_usn,end_usn);
	request.setAttribute("liststudentdetails",stddetails);
	request.getRequestDispatcher("liststudentdetails.jsp").forward(request, response);
	}
	protected void updatedetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mentor_id=null;
        Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("mentor_id")) {
					mentor_id=co.getValue();
				}
			}
		}
		checkdetail(mentor_id,request,response);		
	request.setAttribute("title","Update");
	request.getRequestDispatcher("mentorupdatedetail.jsp").forward(request, response);
	}
	protected void check(String mentor_id,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Mentordetails> listmentorlogin=new Mentordetailstable().listusers();
		   for(Mentordetails list:listmentorlogin) {
			   if(list.getMentor_id().equals(mentor_id)) {
				request.setAttribute(mentor_id,list.getMentor_id());
				request.setAttribute("mentorname",list.getName() );
				request.setAttribute("from_usn",list.getFrom_usn() );
				request.setAttribute("end_usn",list.getEnd_usn() );
		   }
		   }
		request.setAttribute("title", "Home");
		request.getRequestDispatcher("mentorhome.jsp").forward(request, response);
		}	
		
	protected void checkdetail(String mentor_id,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Mentordetails> listmentorlogin=new Mentordetailstable().listusers();
		for(Mentordetails mentordet:listmentorlogin) {
			if(mentordet.getMentor_id().equals(mentor_id)) {
				request.setAttribute("mentorname",mentordet.getName() );
				request.setAttribute("from_usn",mentordet.getFrom_usn() );
				request.setAttribute("end_usn",mentordet.getEnd_usn() );
		}	
	}
	}
	
protected void getmenteefeesdetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String from_usn=null;
        String end_usn=null,mentor_id=null;
     Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("from_usn")) {
					from_usn=co.getValue();
				}
				if(co.getName().equals("end_usn")) {
					end_usn=co.getValue();
				}
			    if(co.getName().equals("mentor_id")) {
			    	mentor_id=co.getValue();
			    }
			
			}
		}
		List<Studentfeesdetails> stddetails=new Studentdetailstable().listconditionfeedetails(mentor_id,from_usn,end_usn);
	request.setAttribute("liststudentfeesdetails",stddetails);
	request.getRequestDispatcher("listmenteefeesdetail.jsp").forward(request, response);
	}
protected void liststudentdetail(String usn,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Studentdetails> liststudent=new Studentdetailstable().listdetails();
	for(Studentdetails liststudentupdate:liststudent) {
	if(liststudentupdate.getUsn().equals(usn)) {
	request.setAttribute("usn", usn);
	request.setAttribute("name", liststudentupdate.getName());
	request.setAttribute("phonenumber", liststudentupdate.getPhonenumber());
	request.setAttribute("cursem", liststudentupdate.getCurrentsem());
	request.setAttribute("dept", liststudentupdate.getDept());

	request.setAttribute("cgpa", liststudentupdate.getCgpa());
	
request.getRequestDispatcher("mentorstudentupdatedetail.jsp").forward(request, response);
}
	}
}
protected void updatementorstudentdetail(Studentdetails std,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 Cookie[] cook=request.getCookies();
	 String from_usn=null;
	 String end_usn=null;
	 String mentor_id=null;
 	 for(Cookie coo:cook) {
 		 if(coo.getName().equals("from_usn")) {
 			 from_usn=coo.getValue();
 			 }
 		 if(coo.getName().equals("end_usn")) {
 			 end_usn=coo.getValue();
 			
 		 }
 		 if(coo.getName().equals("mentor_id")) {
 			 mentor_id=coo.getValue();
 		 }
 	 }
	new Studentdetailstable().updatedetail(std);
     List<Studentdetails> liststudent=new Studentdetailstable().listconditiondetails(mentor_id,from_usn,end_usn);
 	
     request.setAttribute("liststudentdetails",liststudent);
 	
     request.getRequestDispatcher("liststudentdetails.jsp").forward(request, response);
}
}