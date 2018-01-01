<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	---Khu vuc cua useBean:
	</br>
	<!-- useBean -->
		<jsp:useBean id="s1" class="models.Student" scope="request">
			<!-- setProperty -->
			<jsp:setProperty property="name" name="s1" value="Laura Girl"/>
			<!-- 				
				 -->			
			<!-- end setProperty -->
		</jsp:useBean>		
		Get property name: <jsp:getProperty property="name" name="s1"/>
	<!-- End useBean -->
	</br>
	--Ket thuc use Bean.
	</br>
	---Khu vuc cua jsp Expresstion 1
	</br>
	Student name: <%= request.getParameter("name") %>	
	</br>	
	Region: <%= request.getParameter("region") %>
	</br>
	--Ket thuc jsp Expresstion 1
	</br>
	---Khu vuc su dung Expresstion Language:
	</br>
	<!-- Expresstion Language -->
	Student name: ${param.name} <!-- param là ngầm định có sẵn -->
	</br>	
	Region: ${param.region}
	</br>
	<!-- End expresstion Language -->
	--Ket thuc Expresstion.
</body>

</html>