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
        <div class="nav">
            <a href="<%=request.getContextPath() %>/homemainservlet?page=reloadhome" >Home</a>
            <a href="academic.jsp" class="active">Academics</a>
            <a href="<%request.getContextPath(); %>/Project/homemainservlet?page=fetchfees">Fee Details</a>
        </div>
        
<ul>
            <br>
     
            <li><a href="sem1.jsp">Semester 1</a>      <a href="viewsem1.jsp">View sem1</a>    </li> <br>
            <li>  <a href="sem2.jsp">Semester 2</a>          <a href="viewsem2.jsp">View sem2</a>  </li><br>
         <li>   <a href="sem3.jsp">Semester 3</a>   <a href="viewsem3.jsp">View sem3</a> </li><br>
          <li>  <a href="sem4.jsp">Semester 4</a>   <a href="viewsem4.jsp">View sem4</a> </li><br>
           <li> <a href="sem5.jsp">Semester 5</a>   <a href="viewsem5.jsp">View sem5</a></li> <br>
           <li> <a href="sem6.jsp">Semester 6</a>   <a href="viewsem6.jsp">View sem6</a></li> <br>
           <li> <a href="sem7.jsp">Semester 7</a>   <a href="viewsem7.jsp">View sem7</a> </li><br>
           <li> <a href="sem8.jsp">Semester 8</a>   <a href="viewsem8.jsp">View sem8</a></li> <br>
        </ul>
    </body>
</html>