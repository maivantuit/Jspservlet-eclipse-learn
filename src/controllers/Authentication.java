package controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Image;
import models.Databasemanagement;
/**
 * Servlet implementation class Authentication
 */
/*@WebServlet(description = "this is xac thuc", urlPatterns = { "/Authentication" })*/
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Authentication() {
        super();
    }   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*demand giu den model*/
		String username =request.getParameter("username");
		String password =request.getParameter("password");
	
		/*data model giu lai cho controller*/	
		Databasemanagement dm = new Databasemanagement();		
		if(dm.kiemTraUser(username, password)){
			
			/*controller chuyen den cho view, co the o day la 1 html, json, xml, rss...*/
			
			/*ví dụ 1 về cookie:*/		
			Cookie c2 = new Cookie("Location", "VietNam");
			response.addCookie(c2);
								
			HttpSession ses = request.getSession();
			ses.setAttribute("username",username);	
			ses.setMaxInactiveInterval(5);
			RequestDispatcher rd = request.getRequestDispatcher("/ImageShow");
			/* Minh họa cho attribute for object*/
			Image image = new Image("picturename1",300,400);			
			request.setAttribute("imageName",image);/*void setAttribute(string,object)*/			
			ses.setAttribute("test", new Image("picturename1b",300,400));
			ses.removeAttribute("test");
			rd.forward(request, response);
		}else{
			/*controller chuyen den cho view*/			
			response.sendRedirect("view2.jsp");
		}
	}

	
}
