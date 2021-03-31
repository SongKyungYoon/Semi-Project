package com.bit.classes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;


@WebServlet("/classinsert.bit")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("classinsert.jsp").forward(req, resp);
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("행정"))
			resp.sendRedirect("classlist.bit");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			String id=(String) req.getSession().getAttribute("id");
			String name=(String) req.getSession().getAttribute("name");
			String position=(String) req.getSession().getAttribute("position");
			String group=req.getParameter("group");
			String gangsa=req.getParameter("gangsa");
			String period=req.getParameter("period");
			ClassDao dao=new ClassDao();
			dao.insertList(id, name, position, group, gangsa, period);
			
			resp.sendRedirect("classlist.bit");
	}
}