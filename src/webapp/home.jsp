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
            <a href="<%request.getContextPath(); %>/Project/homemainservlet?page=reloadhome" class="active">Home</a>
            <a href="<%request.getContextPath(); %>/Project/academicservlet?page=initiateacademic">Academics</a>
            <a href="<%request.getContextPath(); %>/Project/homemainservlet?page=fetchfees">Fee Details</a>
        </div>
        
   <div class="info">
            <%
            String usn=null;
            Cookie[] coo=request.getCookies();
    		if(coo!=null) {
    			for(Cookie co:coo) {
    				if(co.getName().equals("usn")) {
    					usn=co.getValue();
    				}
    			}
    		}
            String name=(String)request.getAttribute("name");
           
            String phonenumber=(String)request.getAttribute("phonenumber");
            String dept=(String)request.getAttribute("dept");
            String cursem=(String)request.getAttribute("cursem");
            String cgpa=(String)request.getAttribute("cgpa");
            %>

            <strong>NAME:</strong><%if(name!=null){
            out.print(name.toUpperCase());}else{
            out.print(name);
            }%><br> 
            <strong>USN:</strong> <%
                      out.print(usn);
           %><br>
            
            <strong>Phone-number:</strong> <%
            if(phonenumber!=null){
            out.print(phonenumber.toUpperCase());}
            else{ out.print(phonenumber);}
            %><br>
            <strong>Current Semester: </strong><%
            if(cursem!=null){
            out.print(cursem.toUpperCase());}
            else{out.print(cursem);}
            %> <br>
            <strong>DEPARTMENT:</strong> <%
            if(dept!=null){
            out.print(dept.toUpperCase());}
            else{out.print(dept);}
            %> <br>
            <strong>CGPA:</strong><%
            if(cgpa!=null){
            out.print(cgpa.toUpperCase());}
            else{ out.print(cgpa);}
            %> <br>
        <%
        out.print("<a href="+request.getContextPath()+"/homemainservlet?page=updatedetail&usn="+request.getParameter("usn")
		+">Update</a>");
        
        
        out.print("<br><br><br>");
        out.print("<a href="+request.getContextPath()+"/homemainservlet?page=logout"
		+">Logout</a>");
        %>
        
        </div>
        
    </body>
</html>