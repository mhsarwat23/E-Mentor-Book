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
             
<form action="<%=request.getContextPath() %>/mainservlet3" method="post">
Usn: <% out.print(request.getAttribute("usn")); %><br>
Name: <% out.print(request.getAttribute("name")); %><br>
Total fees: <input type="number" name="totalfees" value="<%=request.getAttribute("total_fees") %>"required/><br>
Fees paid: <input type="number" name="feespaid" value="<%=request.getAttribute("fees_paid") %>"required/><br>
Balance: <% out.print(request.getAttribute("balance"));%><br>

<input type="hidden" name="page" value="updateStudentfeementorOperation">
<input type="hidden" name="usn" value="<%=request.getAttribute("usn") %>">

<input type="submit" value="Update Detail"><br>

</form>
