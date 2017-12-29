package servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HumanDao;
import entity.HumanInfo;

public class DelectHumanServlet extends HttpServlet {

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			
			int id = Integer.parseInt(request.getParameter("id")); 
			new HumanDao().delect(id);
			
			response.sendRedirect("/CarSystem/listCar");
			
			
		
	}

}
