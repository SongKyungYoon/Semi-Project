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
		
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!(req.getSession().getAttribute("position").equals("행정")
						||req.getSession().getAttribute("position").equals("강사")))
			resp.sendRedirect("index.jsp");
		
		ClassDao dao=new ClassDao();
		req.setAttribute("classList", dao.classList()); 
		req.getRequestDispatcher("classlist.jsp").forward(req, resp);
	}
}