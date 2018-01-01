<%@ page import="models.Image"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Image name: <%=((Image)request.getAttribute("imageName")).getName()%> <!-- casting type image -->
	<img alt="dang nhap thanh cong" src="images/phaidangnhap.jpg">
	</br>
	<% pageContext.setAttribute("scope", "Page Context"); %>
	
	Scope of the attribute: <%= pageContext.getAttribute("scope") %>
	</br>
	<!-- Expresstion Language -->
	Scope of the attribute By Expresstion Language: ${pageScope.scope}
	</br>
	Scope of the attribute By Expresstion Language: ${4+5}
	</br>	 
	Student name is: ${requestScope.s1.name}
	</br>	
	Friendsaigon: ${requestScope.friesaigon}
	</br>
	Friendsaigon: ${requestScope.friesaigon[0]}
	</br>
	Friendsaigon: ${requestScope.friesaigon[1]}
	</br>
	Friendsaigon: ${requestScope.friesaigon[2]}
	
	</br>
	<!-- End Expresstion Language -->
	

		</br>	
	Others scope of the attribute: <%= pageContext.findAttribute("otherScope") %>
	</br>
	Sesstion scope of the attribute: <%= pageContext.getAttribute("otherScope",PageContext.SESSION_SCOPE) %>
	</br>
	Request scope of the attribute: <%= pageContext.getAttribute("otherScope",PageContext.REQUEST_SCOPE) %>
	</br>
	Application scope of the attribute: <%= pageContext.getAttribute("otherScope",PageContext.APPLICATION_SCOPE) %>
	</br>
	<!-- useBean -->
		<jsp:useBean id="s1" class="models.Student"  scope="request">
			<!-- setProperty -->
			<jsp:setProperty property="name" name="s1" value="Laura Girl"/>					
			<!-- end setProperty -->
		</jsp:useBean>			
		Get property name: <jsp:getProperty property="name" name="s1"/>
	<!-- End useBean -->
</body>
</html>