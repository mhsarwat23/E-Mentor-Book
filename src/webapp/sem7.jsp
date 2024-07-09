<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{
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
th{
width:200px;}

h2{
    font-size: 36px;
    text-align: center;
}
.input-box input{
width:100%;}

.input-box input::placeholder{
    color:black;
}
.input-box table th, tr, td{
padding:8px;}
th {
    background-color: #f2f2f2;
}
</style>
 <body>
        <header>
            <table>
                <tr>
                    <td width="150px"><img src="oxford2.png" width="150px"></td>
                    <td><h1>THE OXFORD COLLEGE OF ENGINEERING</h1></td>
                </tr>
            </table>    
        </header>
    <h2>Subject Details Form</h2>
    <form action="<%request.getContextPath();%>/Project/academicservlet?page=submittingform7" method="post">
    <table class="input-box" border=1>
    <tr>
    <th>SubCode</th>
    <th>Subject Name:</th>
    <th>IA1 Marks:</th>
    <th>IA2 Marks:</th>
    <th>IA3 Marks:</th>
    <th>Total Internal marks</th>
    <th>External marks</th>
    <th>Credits</th>
    </tr>
    <tr>
       <!--   <label for="subCode">Subject Code:</label>-->
        <td><input type="text"  name="subCode1" placeholder="Enter subject code1" required></td>
        
      <!--   <label for="subName">Subject Name:</label>-->
       <td> <input type="text" id="subName1" name="subName1" placeholder="Enter subject name1" required></td>
        
    <!--  <label for="ia1Marks">IA1 Marks:</label>-->
        <td><input type="number" id="ia1Marks1" name="ia1Marks1" min="0" max="20" placeholder="Enter marks" required></td>
        
     <!--    <label for="ia2Marks">IA2 Marks:</label>-->
        <td><input type="number" id="ia2Marks1" name="ia2Marks1" min="0" max="20" placeholder="Enter marks" required></td>
        
    <!--   <label for="ia3Marks">IA3 Marks:</label>-->
        <td><input type="number" id="ia3Marks1" name="ia3Marks1" min="0" max="20" placeholder="Enter marks" required></td>
        
   <!--     <label for="totalInternalMarks">Total Internal Marks:</label>-->
        <td><input type="number" id="totalInternalMarks1" name="totalInternalMarks1" min="0" max="50" placeholder="Enter marks" required></td>
        
      <!--   <label for="externalMarks">External Marks:</label>-->
        <td><input type="number" id="externalMarks" name="externalMarks1" min="0" max="50" placeholder="Enter marks" required></td>
        
      <!--   <label for="credits">Credits:</label>-->
        <td><input type="number" id="credits" name="credits1" min="0" placeholder="Enter Credits" required></td>
     </tr>  
        <tr>
   <!--      <label for="subCode">Subject Code:</label>-->
       <td> <input type="text" id="subCode" name="subCode2" placeholder="Enter subject code2"required></td>
        
   <!--      <label for="subName">Subject Name:</label>-->
        <td><input type="text" id="subName" name="subName2" placeholder="Enter subject name2" required></td>
        
   <!--     <label for="ia1Marks">IA1 Marks:</label>-->
        <td><input type="number" id="ia1Marks" name="ia1Marks2" min="0" max="20" placeholder="Enter marks" required></td>
        
   <!--      <label for="ia2Marks">IA2 Marks:</label>-->
        <td><input type="number" id="ia2Marks" name="ia2Marks2" min="0" max="20" placeholder="Enter marks" required></td>
        
   <!--     <label for="ia3Marks">IA3 Marks:</label>-->
        <td><input type="number" id="ia3Marks" name="ia3Marks2" min="0" max="20" placeholder="Enter marks" required></td>
        
    <!--     <label for="totalInternalMarks">Total Internal Marks:</label>-->
        <td><input type="number" id="totalInternalMarks" name="totalInternalMarks2" min="0" max="50" placeholder="Enter marks" required></td>
        
     <!--   <label for="externalMarks">External Marks:</label>-->
        <td><input type="number" id="externalMarks" name="externalMarks2" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="credits" name="credits2" min="0" placeholder="Enter Credits" required></td>
      </tr> 
        
        <tr>
        <td><input type="text" id="subCode" name="subCode3" placeholder="Enter subject code3" required></td>
        
        <td><input type="text" id="subName" name="subName3" placeholder="Enter subject name3" required></td>
        
        <td><input type="number" id="ia1Marks" name="ia1Marks3" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia2Marks" name="ia2Marks3" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia3Marks" name="ia3Marks3" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="totalInternalMarks" name="totalInternalMarks3" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="externalMarks" name="externalMarks3" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="credits" name="credits3" min="0" placeholder="Enter Credits" required></td>
      </tr> 
        
        <tr>
        <td><input type="text" id="subCode" name="subCode4" placeholder="Enter subject code4" required></td>
        
        <td><input type="text" id="subName" name="subName4" placeholder="Enter subject name4" required></td>
        
        <td><input type="number" id="ia1Marks" name="ia1Marks4" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia2Marks" name="ia2Marks4" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia3Marks" name="ia3Marks4" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="totalInternalMarks" name="totalInternalMarks4" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="externalMarks" name="externalMarks4" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="credits" name="credits4" min="0" placeholder="Enter Credits" required></td>
     </tr>  
        <tr> 
        <td><input type="text" id="subCode" name="subCode5" placeholder="Enter subject code5" required></td>
        
        <td><input type="text" id="subName" name="subName5" placeholder="Enter subject name5"required></td>
        
        <td><input type="number" id="ia1Marks" name="ia1Marks5" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia2Marks" name="ia2Marks5" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia3Marks" name="ia3Marks5" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="totalInternalMarks" name="totalInternalMarks5" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="externalMarks" name="externalMarks5" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="credits" name="credits5" min="0" placeholder="Enter Credits" required></td>
    </tr>   
        <tr>
        <td><input type="text" id="subCode" name="subCode6" placeholder="Enter subject code6" required></td>
        
        <td><input type="text" id="subName" name="subName6" placeholder="Enter subject5 name" required></td>
        
       <td> <input type="number" id="ia1Marks" name="ia1Marks6" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia2Marks" name="ia2Marks6" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="ia3Marks" name="ia3Marks6" min="0" max="20" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="totalInternalMarks" name="totalInternalMarks6" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="externalMarks" name="externalMarks6" min="0" max="50" placeholder="Enter marks" required></td>
        
        <td><input type="number" id="credits" name="credits6" min="0" placeholder="Enter Credits" required></td>
     </tr>  
        
       </table>
        <br><br>
        <%String usn=null;
        Cookie[] coo=request.getCookies();
        for(Cookie co:coo){
        	if(co.getName().equals("usn")){
        		usn=co.getValue();
        	}
        }
        %>
       <input type="hidden" name="usn" value=usn>
       <input type="hidden" name="page" value="submittingform7">
        <input type="submit" value="Submit">
    </form>

</body>
</html>