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
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=reloadhome" class="active">Home</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=liststudent">List Student details</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listacademic">Academic details</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listmenteefees">Fee Details</a>
        </div>
        
   <div class="info">
            <%
            
               String mentor_id=null,mname=null,from_usn=null,end_usn=null;
            
            Cookie[] coo=request.getCookies();
    		if(coo!=null) {
    			for(Cookie co:coo) {
    				if(co.getName().equals("mentor_id")) {
    					mentor_id=co.getValue();
    				}
    			}
    		}      
            
            mname=(String)request.getAttribute("mentorname");
           // mentor_id=(String)request.getAttribute("mentor_id");
            from_usn=(String)request.getAttribute("from_usn");
            end_usn=(String)request.getAttribute("end_usn");
          
            
            
    		%>
            <strong>NAME:</strong><%
            if(mname!=null){
            out.print(mname.toUpperCase());
            }else{
            	out.print(mname);
            }
            
            
            %> <br>
            <strong>Mentor_id:</strong> <%
         
            out.print(mentor_id);
           
            %><br>
            <strong>From_usn:</strong> <%
            if(from_usn!=null){
            out.print(from_usn.toUpperCase()); }
            else{ out.print(from_usn);}
            %>  <br>
            <strong>To_usn: </strong><%
            if(end_usn!=null){
            out.print(end_usn.toUpperCase());
            }else{
            out.print(end_usn);
            }%> <br>
            <%Cookie cook1=new Cookie("from_usn",from_usn);
			response.addCookie(cook1);
			Cookie cook2=new Cookie("end_usn",end_usn);
			response.addCookie(cook2);
           %>
        <%
        out.print("<a href="+request.getContextPath()+"/mainservlet3?page=updatedetail&mentor_id="+request.getParameter(mentor_id)
		+">Update</a>");
        out.print("<br><br><br><br>");
        out.print("<a href="+request.getContextPath()+"/mainservlet3?page=logout"
		+">Logout</a>");
       %>
          
</body>
</html>