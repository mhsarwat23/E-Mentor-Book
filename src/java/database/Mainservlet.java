package oxf.database;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oxf.database.entity.*;
import java.util.*;


import oxf.database.model.*;

@WebServlet("/homemainservlet")
public class Mainservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String page=request.getParameter("page");
	switch(page) {
	
	case "homee":{
		homeee(request,response);
		break;
	}
	case "reloadhome":{
		String usn=null;
		Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("usn")) {
					usn=co.getValue();
				}
			}
		}
		checkname(usn,request,response);
		break;
	}
	case "fetchfees":{
		String usn=null;
		Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("usn")) {
					usn=co.getValue();
				}
			}
		}
		fees(usn,request,response);
		break;
	}
	case "updatedetail":{
		updatedetail(request,response);
		break;
	            }
	case "logout":{
		Cookie[] coo=request.getCookies();
		for(Cookie co:coo) {
			co.setMaxAge(0);
		}
	request.getRequestDispatcher("index.jsp").forward(request, response);
		break;
}
	
	default:request.getRequestDispatcher("error.jsp").forward(request, response);
	
	}}
	private void checkname(String usn,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Studentdetails> stddetails=new Studentdetailstable().listdetails();
		gettdetails(stddetails,usn,request,response);		
		request.setAttribute("title", "Home");
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	
	private void fees(String usn,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Feesdetails> listfees=new Feesdetailstable().listfeesdetails();
    getfees(usn,listfees,request,response);
   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String form=request.getParameter("form").toLowerCase();
		switch(form) {
		case "updateuseroperation":
			{ Studentdetails std=new Studentdetails(request.getParameter("usn"),request.getParameter("name"),request.getParameter("phonenumber"),request.getParameter("cursem"),request.getParameter("department"),request.getParameter("cgpa"));
			new Studentdetailstable().updatedetail(std);
            request.setAttribute("title", "Home");
			
			homeee(request,response);
				break;
		}
		case "loginchecking":
		{   logincheck(request,response);
			break;
	}
		case "homee":{
			homeee(request,response);
			break;
		}
		
		case "sem1":{    break;
		            }
		}
	}

	protected void logincheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Logindetails> checklist = new Logintable().listusers();
		String USN = request.getParameter("usn");
		String PASSWORD = request.getParameter("password");
		if (chklist(checklist, USN, PASSWORD)) {
			request.setAttribute("title", "Home");
			List<Studentdetails> stddetails=new Studentdetailstable().listdetails();
			if(!checkdetails(stddetails,request,response)) {
				new Studentdetailstable().adddetail(USN);
				new Feesdetailstable().adddetail(USN);
			}
			
			request.getSession().invalidate();
			HttpSession newsession=(HttpSession) request.getSession();
			newsession.setMaxInactiveInterval(500);
			Cookie cook=new Cookie("usn",USN);
			response.addCookie(cook);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

	protected boolean chklist(List<Logindetails> checklist, String usn, String password) {
		// TODO Auto-generated method stub
		for (Logindetails lgdn : checklist) {
			if (lgdn.getUsn().equals(usn) && lgdn.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkdetails(List<Studentdetails> stdlist,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean present=false;
		String usn=request.getParameter("usn");
		for(Studentdetails std:stdlist) {
			if(std.getUsn().equals(usn)) {
				request.setAttribute("usn",std.getUsn());
				request.setAttribute("name",std.getName());
				request.setAttribute("phonenumber",std.getPhonenumber());
				request.setAttribute("cursem",std.getCurrentsem());
				request.setAttribute("dept",std.getDept());
				request.setAttribute("cgpa",std.getCgpa());
				present=true;
			}
		}
		return present;
	}
	protected void updatedetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Studentdetails> stddetails=new Studentdetailstable().listdetails();
		checkdetails(stddetails,request,response);		
	request.setAttribute("title","Update");
	request.getRequestDispatcher("updatedetail.jsp").forward(request, response);
	}
	protected void homeee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Studentdetails> stddetails=new Studentdetailstable().listdetails();
		getdetails(stddetails,request,response);
		request.setAttribute("title", "Home");
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	public void getdetails(List<Studentdetails> stdlist,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usn=request.getParameter("usn");
		for(Studentdetails std:stdlist) {
			if(std.getUsn().equals(usn)) {
				request.setAttribute("name",std.getName());
				request.setAttribute("phonenumber",std.getPhonenumber());
				request.setAttribute("cursem",std.getCurrentsem());
				request.setAttribute("dept",std.getDept());
				request.setAttribute("cgpa",std.getCgpa());	
			}
		}
	}
		public void gettdetails(List<Studentdetails> stdlist,String usn,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				for(Studentdetails std:stdlist) {
				if(std.getUsn().equals(usn)) {
					request.setAttribute("usn",std.getUsn());
					request.setAttribute("name",std.getName());
					request.setAttribute("phonenumber",std.getPhonenumber());
					request.setAttribute("cursem",std.getCurrentsem());
					request.setAttribute("dept",std.getDept());
					request.setAttribute("cgpa",std.getCgpa());	
				}
			}
	}
		
	
		public void getfees(String usn,List<Feesdetails> feesdetaillist,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			for(Feesdetails fee:feesdetaillist) {
	    	if(fee.getUsn().equals(usn)) {
	    		request.setAttribute(usn,fee.getUsn());
	    		request.setAttribute("totalfees",fee.getTotal_fees());
	    		request.setAttribute("feespaid",fee.getFees_paid());
	    		request.setAttribute("balance",fee.getBalance());	
	    	}
	    }
		request.getRequestDispatcher("fees.jsp").forward(request, response);
		
		}
}
