package servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.HumanDao;
import entity.HumanInfo;


public class SearchHumanServlet extends HttpServlet {

		protected void service(HttpServletRequest request,HttpServletResponse response)
				throws IOException,ServletException{
			String searchValue = request.getParameter("searchValue");
			List<HumanInfo> humans = new HumanDao().query(searchValue);
			request.setAttribute("humans", humans);
			request.getRequestDispatcher("searchCar.jsp").forward(request, response);
		
	}

}
