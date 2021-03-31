package com.bit.classes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.classes.model.ClassDao;

@WebServlet("/classupdate.bit")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("행정"))
			resp.sendRedirect("index.jsp");
		
		int num=Integer.parseInt(req.getParameter("num"));
		ClassDao dao=new ClassDao();
		req.setAttribute("classDetail", dao.classDetail(num)); 
		req.getRequestDispatcher("classupdate.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(req.getParameter("num"));
		String group=req.getParameter("group");
		String gangsa=req.getParameter("gangsa");
		String period=req.getParameter("period");
		
		ClassDao dao=new ClassDao();
		dao.updateClass(num, group, gangsa, period);
		
		resp.sendRedirect("classlist.bit");
	}
}