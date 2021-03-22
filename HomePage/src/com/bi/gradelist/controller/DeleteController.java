package com.bi.gradelist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bi.gradelist.model.GradelistDao;
import com.bit.classes.model.ClassDao;
import com.sun.xml.internal.bind.v2.runtime.Location;

@WebServlet("/gradedelete.bit")
public class DeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		GradelistDao dao=new GradelistDao();
		dao.deleteGrade(num);
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!req.getSession().getAttribute("POSITION").equals("행정"))
			resp.sendRedirect("index.jsp");
		
		req.getRequestDispatcher("gradedelete.jsp").forward(req, resp);
	}
}
