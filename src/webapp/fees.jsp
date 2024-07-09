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
            <a href="<%request.getContextPath(); %>/Project/homemainservlet?page=reloadhome" >Home</a>
            <a href="academic.jsp">Academics</a>
            <a href="<%request.getContextPath(); %>/Project/homemainservlet?page=fetchfees" class="active">Fee Details</a>
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
       //    int totalfees=Integer.parseInt((String)request.getAttribute("totalfees"));
      //     int feespaid=(int)request.getAttribute("feespaid");
      //     int balance=(int)request.getAttribute("balance");
              
            %>

            <strong>USN:</strong> <%out.print(usn.toUpperCase()); %><br>
            <strong>Total-fees:</strong> <%out.print(request.getAttribute("totalfees")); %>  <br>
            <strong>Fees paid: </strong> <%out.print(request.getAttribute("feespaid")); %> <br>
            <strong>Balance: </strong> <%out.print(request.getAttribute("balance")); %> <br>
           
        
        </div>
        
    </body>
</html>