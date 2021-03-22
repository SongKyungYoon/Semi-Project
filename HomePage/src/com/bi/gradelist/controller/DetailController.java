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
		req.getSession().setAttribute("ID", "stxz11");
		req.getSession().setAttribute("NAME", "이해남");
		req.getSession().setAttribute("POSITION", "강사");
		
		String group=req.getParameter("group");
		//System.out.println(group);
		GradelistDao dao=new GradelistDao();
		req.setAttribute("gradeDetail", dao.gradeDetail(group)); 
		req.getRequestDispatcher("gradedetail.jsp").forward(req, resp);
		
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!(req.getSession().getAttribute("POSITION").equals("행정")
					|| req.getSession().getAttribute("POSITION").equals("강사")))
			resp.sendRedirect("index.jsp");
	}
}
