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
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!req.getSession().getAttribute("POSITION").equals("행정"))
			resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String ID=(String) req.getSession().getAttribute("ID");
			String NAME=(String) req.getSession().getAttribute("NAME");
			String POSITION=(String) req.getSession().getAttribute("POSITION");
			String group=req.getParameter("group");
			String stuname=req.getParameter("stuname");
			int java=Integer.parseInt(req.getParameter("java"));
			int database=Integer.parseInt(req.getParameter("database"));
			int framework=Integer.parseInt(req.getParameter("framework"));
			GradelistDao dao=new GradelistDao();
			dao.insertList(ID, NAME, POSITION, group, stuname, java,database,framework);
			
			resp.sendRedirect("gradelist.bit");
	}
}