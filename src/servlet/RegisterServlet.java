package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.UserInfo;
import dao.HumanDao;

public class RegisterServlet extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset=UTF-8");
				
				UserInfo user = new UserInfo();
				user.setUserEmail(request.getParameter("registerUserEmail"));
				user.setUserPassword(request.getParameter("registerPassword"));
				
				new HumanDao().register(user);
				response.sendRedirect("login.jsp");
				
				
			}
}
