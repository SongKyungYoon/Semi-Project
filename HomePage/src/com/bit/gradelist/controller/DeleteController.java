package com.bit.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;
import com.bit.gradelist.model.GradelistDao;
import com.sun.xml.internal.bind.v2.runtime.Location;

@WebServlet("/gradedelete.bit")
public class DeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		GradelistDao dao=new GradelistDao();
		dao.deleteGrade(num);
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("행정"))
			resp.sendRedirect("index.jsp");
		
		req.getRequestDispatcher("gradedelete.jsp").forward(req, resp);
	}
}