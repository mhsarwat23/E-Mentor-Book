<!DOCTYPE html>
<html>
    <head>
        <title>The Oxford College of Engineering</title>
        <style>*{
    margin:0; 
    overflow-x: hidden;
}
header{
    background:rgba(65, 52, 130, 0.532);
    text-align: left;
    color:#fff;
    font-size: 30px;
    text-shadow: white;
}
.nav{
    background-color: rgb(97, 30, 97);
    overflow: hidden;
    width:100%;
}
.info{
    font-size: 24px;
    margin: 20px;
}
.nav a{
    color:white;
    background-color: rgb(97, 30, 97);
    float:left;
    text-align: center;
    padding: 15px;
    text-decoration: none;
}
.nav a:hover{
    background-color: rgb(133, 166, 186);
    color:black;
}
.nav a.active{
    background-color: rgb(137, 134, 190);
    color: rgb(0, 0, 0);
}
.info{
    font-size: 24px;
    margin: 20px;
}</style>
      </head>
    <body>
        <header>
            <table width="100%">
                <tr>
                    <td width="150px"><img src="oxford2.png" width="150px"></td>
                    <td><h1>THE OXFORD COLLEGE OF ENGINEERING</h1></td>
                </tr>
            </table>    
        </header>
        <div class="nav">
        <!--      <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=reloadhome" class="active">Home</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=liststudent">List Student details</a>
         <a href="<%request.getContextPath(); %>/Project/mainservlet4?page=listacademic">Academic details</a>
           
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listmenteefees">Fee Details</a>-->
        </div>
        
   <div class="info">
   <h1>Semester 1</h1>
      
 <%@ page import="java.util.List" %>
<%@ page import="oxf.database.entity.*" %>
<%@ page import="oxf.database.model.*" %>


<%
String usn=null;
 Cookie[] coo=request.getCookies();
 for(Cookie co:coo){
	 if(co.getName().equals("usn")) {
			usn=co.getValue();
		}
 }
 List<Studentsnameacademics> listusers=new Studentacademicssem1().getresult();
 for(Studentsnameacademics _user:listusers){
	 if(_user.getUsn().equals(usn)){
 out.print("<table border=2>");
	out.print("<thead>");
	out.print("<tr>");
	out.print("<th>USN</th>");
	out.print("<th>Name</th>");
	out.print("<th>SGPA</th>");
	out.print("</tr>");
	out.print("</thead>");
	out.print("<tbody>");
	out.print("<tr>");
	
	out.print("<td>"+_user.getUsn()+"</td>");
 
	out.print("<td>"+_user.getName()+"</td>");
	out.print("<td>"+new Studentacademicssem1().getsgpa(_user.getUsn()) +"</td>");
	
	out.print("</tr>");
	out.print("</tbody>");
	out.print("</table>");
	
	out.print("<table border=1>");
	out.print("<thead>");        
out.print("<tr>");
out.print("<th>Subject code</th>");
out.print("<th>Subject name</th>");
out.print("<th>IA mark1</th>");
out.print(" <th>IA mark2</th>");
out.print("<th>IA mark3</th>");
out.print(" <th>Total internal</th>");
out.print(" <th>Total external</th>");
out.print(" <th>Total</th>");
out.print(" <th>Credits</th>");
out.print(" </tr>");
out.print("</thead>");
out.print("<tbody>");

out.print("<tr >");

	out.print("<td>"+_user.getSubcode1()+"</td>");
	
		out.print("<td>"+_user.getSubname1()+"</td>");
out.print("<td>"+_user.getIa1marks1()+"</td>");
out.print("<td>"+_user.getIa2marks1()+"</td>");
out.print("<td>"+_user.getIa3marks1()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks1()+"</td>");
	out.print("<td>"+_user.getExternalmarks1()+"</td>");
	out.print("<td>"+_user.getTotal1()+"</td>");
	out.print("<td>"+_user.getCredits1()+"</td>");
	out.print("</tr");
	out.print("</tbody>");
	out.print("<tbody>");
	out.print("<tr >");
	out.print("<td >"+_user.getSubcode2()+"</td>");
	out.print("<td>"+_user.getSubname2()+"</td>");
	out.print("<td>"+_user.getIa1marks2()+"</td>");
	out.print("<td>"+_user.getIa2marks2()+"</td>");
	out.print("<td>"+_user.getIa3marks2()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks2()+"</td>");
	out.print("<td>"+_user.getExternalmarks2()+"</td>");
	out.print("<td>"+_user.getTotal2()+"</td>");
	out.print("<td>"+_user.getCredits2()+"</td>");
	out.print("</tr");
	out.print("</tbody>");
	
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode3()+"</td>");
	out.print("<td>"+_user.getSubname3()+"</td>");
	out.print("<td>"+_user.getIa1marks3()+"</td>");
	out.print("<td>"+_user.getIa2marks3()+"</td>");
	out.print("<td>"+_user.getIa3marks3()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks3()+"</td>");
	out.print("<td>"+_user.getExternalmarks3()+"</td>");
	out.print("<td>"+_user.getTotal3()+"</td>");
	out.print("<td>"+_user.getCredits3()+"</td>");
	out.print("</tr");
	out.print("<tbody>");
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode4()+"</td>");
	out.print("<td>"+_user.getSubname4()+"</td>");
	out.print("<td>"+_user.getIa1marks4()+"</td>");
	out.print("<td>"+_user.getIa2marks4()+"</td>");
	out.print("<td>"+_user.getIa3marks4()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks4()+"</td>");
	out.print("<td>"+_user.getExternalmarks4()+"</td>");
	out.print("<td>"+_user.getTotal4()+"</td>");
	out.print("<td>"+_user.getCredits4()+"</td>");
 out.print("</tr>");
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode5()+"</td>");
	out.print("<td>"+_user.getSubname5()+"</td>");
	out.print("<td>"+_user.getIa1marks5()+"</td>");
	out.print("<td>"+_user.getIa2marks5()+"</td>");
	out.print("<td>"+_user.getIa3marks5()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks5()+"</td>");
	out.print("<td>"+_user.getExternalmarks5()+"</td>");
	out.print("<td>"+_user.getTotal5()+"</td>");
	out.print("<td>"+_user.getCredits5()+"</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode6()+"</td>");
	out.print("<td>"+_user.getSubname6()+"</td>");
	out.print("<td>"+_user.getIa1marks6()+"</td>");
	out.print("<td>"+_user.getIa2marks6()+"</td>");
	out.print("<td>"+_user.getIa3marks6()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks6()+"</td>");
	out.print("<td>"+_user.getExternalmarks6()+"</td>");
	out.print("<td>"+_user.getTotal6()+"</td>");
	out.print("<td>"+_user.getCredits6()+"</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode7()+"</td>");
	out.print("<td>"+_user.getSubname7()+"</td>");
	out.print("<td>"+_user.getIa1marks7()+"</td>");
	out.print("<td>"+_user.getIa2marks7()+"</td>");
	out.print("<td>"+_user.getIa3marks7()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks7()+"</td>");
	out.print("<td>"+_user.getExternalmarks7()+"</td>");
	out.print("<td>"+_user.getTotal7()+"</td>");
	out.print("<td>"+_user.getCredits7()+"</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode8()+"</td>");
	out.print("<td>"+_user.getSubname8()+"</td>");
	out.print("<td>"+_user.getIa1marks8()+"</td>");
	out.print("<td>"+_user.getIa2marks8()+"</td>");
	out.print("<td>"+_user.getIa3marks8()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks8()+"</td>");
	out.print("<td>"+_user.getExternalmarks8()+"</td>");
	out.print("<td>"+_user.getTotal8()+"</td>");
	out.print("<td>"+_user.getCredits8()+"</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>"+_user.getSubcode9()+"</td>");
	out.print("<td>"+_user.getSubname9()+"</td>");
	out.print("<td>"+_user.getIa1marks9()+"</td>");
	out.print("<td>"+_user.getIa2marks9()+"</td>");
	out.print("<td>"+_user.getIa3marks9()+"</td>");
	out.print("<td>"+_user.getTotalinternalmarks9()+"</td>");
	out.print("<td>"+_user.getExternalmarks9()+"</td>");
	out.print("<td>"+_user.getTotal9()+"</td>");
	out.print("<td>"+_user.getCredits9()+"</td>");
	out.print("</tr>");
	out.print("</tbody>");
	out.print("</table>");
	break;
	 }
 }
 
 %>
<center><a href="academic.jsp">Go back</a></center> 
 </body>
</html>
 