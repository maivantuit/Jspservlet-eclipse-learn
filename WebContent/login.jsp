<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
	#form1{
		border: 1px solid blue;
		width:400px;
		height:120px;
		background:#ccc;	
	}
	#form1 input{
		display:block;		
	}
</style>
</head>
<body>
	<div id="form1">
		<form action="login" method="post">
				User name: <input type ="text" value="" name="username"/>
				Password: <input type ="password" value="" name="password"/>
				<input type="submit" value="OK"/>	
		</form>
	</div>
</body>
</html>
