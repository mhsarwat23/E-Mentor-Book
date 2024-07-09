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
        <%
        String mentor_id=null;
        Cookie[] coo=request.getCookies();
		if(coo!=null) {
			for(Cookie co:coo) {
				if(co.getName().equals("mentor_id")) {
					mentor_id=co.getValue();
				}
			}
		}
		
        %>
 <form action="<%=request.getContextPath() %>/mainservlet3" method="post">
Mentor_id: <%out.print(mentor_id.toUpperCase()); %><br>
Mentor Name: <input type="text" name="mentorname" value="<%=request.getAttribute("mentorname") %>" required/><br>
From_usn: <input type="text" name="from_usn" value="<%=request.getAttribute("from_usn") %>" required/><br>
To_usn: <input type="text" name="to_usn" value="<%=request.getAttribute("end_usn") %>" required/><br>
<input type="hidden" name="page" value="updateUserOperation">
<input type="hidden" name="mentor_id" value="mentor_id">

<input type="submit" value="Update Detail"><br>
 
 </form>
 </body>
 </html>