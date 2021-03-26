package com.bit.classes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;

@WebServlet("/classlist.bit")
public class ListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("ID", "stxz11");
		req.getSession().setAttribute("NAME", "김열조");
		req.getSession().setAttribute("POSITION", "강사");
		
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!(req.getSession().getAttribute("POSITION").equals("행정")
						||req.getSession().getAttribute("POSITION").equals("강사")))
			resp.sendRedirect("index.jsp");
		
		ClassDao dao=new ClassDao();
		req.setAttribute("classList", dao.classList()); 
		req.getRequestDispatcher("classlist.jsp").forward(req, resp);
	}
}