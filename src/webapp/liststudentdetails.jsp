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
             <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=reloadhome" >Home</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=liststudent" class="active">List Student details</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listacademic">Academic details</a>
           
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listmenteefees">Fee Details</a>
        </div>
        
   <div class="info">
            <table border="1">
<thead>
 <th>USN</th>
 <th>Username</th>
 <th>Phonenumber</th>
 <th>Currentsem</th>
 <th>Department</th>
 <th>CGPA</th>
 <th>Operation</th>
 </thead>
<%@ page import="java.util.List" %>
<%@ page import="oxf.database.entity.*" %>

<%

List<Studentdetails> listusers=(List)request.getAttribute("liststudentdetails");
for(Studentdetails _user:listusers){
	out.print("<tr>");

	out.print("<td>"+_user.getUsn()+"</td>");
	out.print("<td>"+_user.getName()+"</td>");
	out.print("<td>"+_user.getPhonenumber()+"</td>");
	out.print("<td>"+_user.getCurrentsem()+"</td>");
	out.print("<td>"+_user.getDept()+"</td>");
	out.print("<td>"+_user.getCgpa()+"</td>");
	
	out.print("<td><a href="+request.getContextPath()+"/mainservlet3?page=updatestudentdetmentor&usn="+_user.getUsn()+
			"&name="+_user.getName()+"&phonenumber="+_user.getPhonenumber()+"&cursem="+_user.getCurrentsem()+"&dept="+_user.getDept()+
			"&cgpa="+_user.getCgpa()+">Update</a>");
	//out.print(" | ");
	//out.print("<td><a href="+request.getContextPath()+"/home?page=deleteuser&user_id="+_user.getUser_id()+
	//		">Delete</a>");
	//out.print("</tr>");
}

%>
</table> 
          
</body>
</html>