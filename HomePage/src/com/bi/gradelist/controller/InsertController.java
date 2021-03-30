package com.bi.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bi.gradelist.model.GradelistDao;
import com.bit.classes.model.ClassDao;


@WebServlet("/gradeinsert.bit")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("gradeinsert.jsp").forward(req, resp);
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("행정"))
			resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=(String) req.getSession().getAttribute("id");
			String name=(String) req.getSession().getAttribute("name");
			String position=(String) req.getSession().getAttribute("position");
			String group=req.getParameter("group");
			String stuname=req.getParameter("stuname");
			int java=Integer.parseInt(req.getParameter("java"));
			int database=Integer.parseInt(req.getParameter("database"));
			int framework=Integer.parseInt(req.getParameter("framework"));
			GradelistDao dao=new GradelistDao();
			dao.insertList(id, name, position, group, stuname, java,database,framework);
			
			resp.sendRedirect("gradelist.bit");
	}
}