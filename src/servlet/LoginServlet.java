package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ValidateDao;

public class LoginServlet extends HttpServlet {
	protected void service (HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String inputEmail = request.getParameter("inputEmail");
		String inputPassword = request.getParameter("inputPassword");
	
		if (ValidateDao.LoginValidate(inputEmail, inputPassword).getUserEmail().equals(inputEmail)) {
			request.getSession().setAttribute("loginFlg", inputEmail);
			response.sendRedirect("Home.jsp");
			
		} else {
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
	
	}
}
