package com.bit.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.emp.model.EbbDao;

@WebServlet("/emplist.bit")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//임시용
		req.getSession().setAttribute("ID", "stxz00");
		req.getSession().setAttribute("NAME", "이해남");
		req.getSession().setAttribute("POSITION", "취업");
		
		EbbDao dao=new EbbDao();
		req.setAttribute("ebbList", dao.ebbList()); 
		req.getRequestDispatcher("emplist.jsp").forward(req, resp);
	
	}
}
