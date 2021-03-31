package com.bi.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bi.gradelist.model.GradelistDao;
import com.bit.classes.model.ClassDao;

@WebServlet("/gradedetail.bit")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String group=req.getParameter("group");
		//System.out.println(group);
		GradelistDao dao=new GradelistDao();
		req.setAttribute("gradeDetail", dao.gradeDetail(group)); 
		req.getRequestDispatcher("gradedetail.jsp").forward(req, resp);
		
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!(req.getSession().getAttribute("position").equals("행정")
					|| req.getSession().getAttribute("position").equals("강사")))
			resp.sendRedirect("index.jsp");
	}
}