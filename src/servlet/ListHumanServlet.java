package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HumanDao;
import entity.HumanInfo;

public class ListHumanServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		int start = 0;
		int count = 4;
		
		try {
			start = Integer.parseInt(request.getParameter("start"));
		} catch (NumberFormatException e) {
		
		}
		
		int next = start + count;
		int pre = start - count;
		int total = new HumanDao().getTotal();
		
		int last;
		if(0 == total%count)
			last = total -  count;
		else
			last = total - total % count;
		pre = pre < 0 ? 0 : pre;
		next = next > last ? last : next;
		
		request.setAttribute("next", next);
		request.setAttribute("pre", pre);
		request.setAttribute("last", last);
		
		List<HumanInfo> humans = new HumanDao().list(start,count);
		request.setAttribute("humans", humans);
		
		request.getRequestDispatcher("Result.jsp").forward(request,response);
	}
}
