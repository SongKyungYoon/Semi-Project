package com.bit.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;
import com.bit.gradelist.model.GradelistDao;

@WebServlet("/gradeupdate2.bit")
public class UpdateController2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("강사"))
			resp.sendRedirect("index.jsp");
		
		int num=Integer.parseInt(req.getParameter("num"));
		GradelistDao dao=new GradelistDao();
		req.setAttribute("gradeDetail", dao.gradeDetail(num)); 
		req.getRequestDispatcher("gradeupdate.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		String group=req.getParameter("group");
		String stuname=req.getParameter("stuname");
		int java=Integer.parseInt(req.getParameter("java"));
		int database=Integer.parseInt(req.getParameter("database"));
		int framework=Integer.parseInt(req.getParameter("framework"));
		
		GradelistDao dao=new GradelistDao();
		dao.updateGrade(num, group, stuname, java,database,framework);
		
		resp.sendRedirect("gradelist.bit");
	}
}