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
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!req.getSession().getAttribute("POSITION").equals("행정"))
			resp.sendRedirect("classlist.bit");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String ID=(String) req.getSession().getAttribute("ID");
			String NAME=(String) req.getSession().getAttribute("NAME");
			String POSITION=(String) req.getSession().getAttribute("POSITION");
			String group=req.getParameter("group");
			String gangsa=req.getParameter("gangsa");
			String period=req.getParameter("period");
			ClassDao dao=new ClassDao();
			dao.insertList(ID, NAME, POSITION, group, gangsa, period);
			
			resp.sendRedirect("classlist.bit");
	}
}