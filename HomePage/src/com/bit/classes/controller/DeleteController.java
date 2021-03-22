package com.bit.classes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;
import com.sun.xml.internal.bind.v2.runtime.Location;

@WebServlet("/classdelete.bit")
public class DeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!req.getSession().getAttribute("POSITION").equals("행정"))
			resp.sendRedirect("index.jsp");
		
		int num=Integer.parseInt(req.getParameter("num"));
		ClassDao dao=new ClassDao();
		dao.deleteClass(num);
		req.getRequestDispatcher("classdelete.jsp").forward(req, resp);
	}
}
