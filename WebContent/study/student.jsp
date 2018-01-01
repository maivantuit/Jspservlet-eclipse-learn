<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#form2{
		background: #ccc;
		width:300px;
		height:100px;
		border: 1px solid blue;
		margin: 0 auto;
	}
</style>
</head>
<body>
	<div id="form2">
		<form action="detail.jsp" method="get">
			Studen name: <input type="text" name="name"/>
			</br>
			<select name="region">
				<option value="asia">Asia</option>
				<option value="america">America</option>
				<option value="urope">Europe</option>
				<option value="africa">Africa</option>
			</select>
			</br>
			<input type="submit" value="OK"/>
		</form>
	</div>
</body>
</html>