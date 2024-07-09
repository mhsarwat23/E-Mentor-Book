package oxf.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oxf.database.entity.Feesdetails;
import oxf.database.model.Feesdetailstable;

@WebServlet("/mainservlet")
public class mainservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("page");
		switch(page) {
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
		}
		
	
	}
	private void fees(String usn,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   Feesdetails fee=new Feesdetailstable().listfees(usn);
			//getfees(usn,listfees,request,response);
	   
	   	   request.setAttribute("usn",fee.getUsn());
	    		request.setAttribute("totalfees",fee.getTotal_fees());
	    		request.setAttribute("feespaid",fee.getFees_paid());
	    		request.setAttribute("balance",fee.getBalance());	
	           request.getRequestDispatcher("fees.jsp").forward(request, response);
		   
		    }
	
	/*private void getfees(String usn,List<Feesdetails> feesdetaillist,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		for(Feesdetails fee:feesdetaillist) {
	    	if(fee.getUsn().equals(fee)) {
	    		request.setAttribute(usn,fee.getUsn());
	    		request.setAttribute("totalfees",fee.getTotal_fees());
	    		request.setAttribute("feespaid",fee.getFees_paid());
	    		request.setAttribute("balance",fee.getBalance());	
	    	}
	    }
		 request.getRequestDispatcher("fees.jsp").forward(request, response);
		}*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
