package controllers;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Student;

/**
 * Servlet implementation class ImageShow
 */
@WebServlet("/ImageShow")
public class ImageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ImageShow() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCheck(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCheck(request, response);
		
	}
	private void doCheck(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();		
		String username = (String)ses.getAttribute("username");		
		if(username==null){
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}else{
			
			Cookie []list= request.getCookies(); /* vì nó trả về 1 danh sách cookie*/
			for(Cookie c: list){
				System.out.println(c.getName());
				System.out.println(c.getValue());
			}
			
			this.getServletContext().setAttribute("otherScope", "Application scope");
			request.setAttribute("otherScope", "Sesstion Scope");
			request.setAttribute("otherScope", "Request Scope");
			
			/*Expresstion Language*/
			
				/* jsp:useBean*/
				Student s1 = new Student();
				s1.setName("Mai Van Tu");
				request.setAttribute("s1", s1);
				/*end jsp:useBean*/
			ArrayList<String> friesaigon = new ArrayList<String>();
			friesaigon.add("KhanhNhi");
			friesaigon.add("XuanQuynh");
			friesaigon.add("QuocLuyen");
			request.setAttribute("friesaigon", friesaigon);
			/*End Expresstion Language*/
			
			RequestDispatcher rd = request.getRequestDispatcher("/crocodile.jsp");		
			rd.forward(request, response);
		}
	}

}
