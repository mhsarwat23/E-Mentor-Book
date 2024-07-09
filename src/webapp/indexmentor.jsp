<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<style>

body{
background-image:url('background-login.jpg');
    background-size: cover;
    background-position: center;
    justify-content: center;
    align-items: center;
    min-height: 100vh;}
  .toce {
            align: center;
            margin-bottom: 20px; /* Add some margin to create space between the logo and the form */
            display:flex;
            margin-left:45%;
            margin-right:50%;
        }
        .contents {
        	align:center;
        	display:flex;
        	justify-content:center;
            width: 500px;
            background: rgb(30, 122, 156);
            color: #fff;
            padding: 30px;
            border-radius: 15px;
            border: 2px solid rgba(255, 255, 255, 0.2);
            margin-left:auto;
            margin-right:auto;
        }
.contents h1{
    font-size: 36px;
    text-align: center;
}
.contents .input-box{
    width:100%;
    height: 40px;
    margin:30px 0;
}
.input-box input{
    width: 100%;
    height: 100%;
    background: transparent;
    border:none;
    outline:none;
    border:2px solid rgba(255,255,255, 0.2);
    border-radius: 20px;
    font-size: 16px;
    color: #fff;
}
.input-box input::placeholder{
    color:#fff;
}
.contents .btn{
    width:100%;
    height:30px;
    background: #fff;
    border:none;
    outline: none;
    border-radius: 40px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    cursor: pointer;
    font-size: 16px;
    color: #333;
    font-weight: 600;
}
.contents .btn:hover{
    background: grey;
}
</style>
 <title>LOGIN</title>
</head>
<body>
<div class="toce">
            <img  src="oxford2.png" width="150px">
           </div>
     <div class="contents">

 <form action="<%=request.getContextPath() %>/mainservlet3" method="post">
			<h1>MENTOR LOGIN</h1>
		<div class="input-box">
			<input type="text" name="mentor_id" placeholder="Mentor id" required>
		</div>
		<div class="input-box">
			<input type="password" name="password" placeholder="Password" required>
		</div>
		<input type="submit" value="Login" class="btn">
		<input type="hidden" name="page" value="verifymentor">
		
		<a href="index.jsp">Student login?</a>
	</form>
	</div>
	</body>
	</html>