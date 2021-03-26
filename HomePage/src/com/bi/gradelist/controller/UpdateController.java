package com.bi.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bi.gradelist.model.GradelistDao;
import com.bit.classes.model.ClassDao;

@WebServlet("/gradeupdate.bit")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("ID", "stxz11");
		req.getSession().setAttribute("NAME", "이해남");
		req.getSession().setAttribute("POSITION", "행정");
		
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!(req.getSession().getAttribute("POSITION").equals("행정")
				|| req.getSession().getAttribute("POSITION").equals("강사")))
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