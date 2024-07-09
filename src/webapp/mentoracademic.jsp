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
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=liststudent">List Student details</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listacademic" class="active">Academic details</a>
            <a href="<%request.getContextPath(); %>/Project/mainservlet3?page=listmenteefees">Fee Details</a>
        </div>
        <ul>
            <br><a href="<%request.getContextPath();%>/Project/mainservlet5?page=listsem1"><li>Semester 1</li></a><br>
            <a href="<%request.getContextPath();%>/Project/mainservlet5?page=listsem2"><li>Semester 2</li></a><br>
            <a href="<%request.getContextPath();%>/Project/mainservlet5?page=listsem3"><li>Semester 3</li></a><br>
            <a href="<%request.getContextPath();%>/Project/mainservlet5?page=listsem4"><li>Semester 4</li></a><br>
            <a href="menteesem5.jsp"><li>Semester 5</li></a><br>
            <a href="menteesem6.jsp"><li>Semester 6</li></a><br>
            <a href="menteesem7.jsp"><li>Semester 7</li></a><br>
            <a href="menteesem8.jsp"><li>Semester 8</li></a>
        </ul>
        
        
</body>
</html>