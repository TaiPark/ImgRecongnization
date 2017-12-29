package servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HumanDao;
import entity.HumanInfo;

public class UpdateHumanServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		

		HumanInfo human = new HumanInfo();
		human.setHumanId(Integer.parseInt(request.getParameter("humanid")));
		human.setHumanName(request.getParameter("humanname"));
		human.setHumanAge(Integer.parseInt(request.getParameter("humanage")));
		human.setHumanBeauty(Integer.parseInt(request.getParameter("humanbeauty")));
		new HumanDao().update(human);
		

		response.sendRedirect("Result.jsp");

	}

}
