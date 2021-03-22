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
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")==null ||
				!req.getSession().getAttribute("POSITION").equals("행정"))
			resp.sendRedirect("index.jsp");
		
		req.getSession().setAttribute("ID", "stxz11");
		req.getSession().setAttribute("NAME", "이해남");
		req.getSession().setAttribute("POSITION", "행정");
		
		int num=Integer.parseInt(req.getParameter("num"));
		ClassDao dao=new ClassDao();
		req.setAttribute("classDetail", dao.classDetail(num)); 
		req.getRequestDispatcher("classupdate.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		String group=req.getParameter("group");
		String gangsa=req.getParameter("gangsa");
		String period=req.getParameter("period");
		
		ClassDao dao=new ClassDao();
		dao.updateClass(num, group, gangsa, period);
		
		resp.sendRedirect("classlist.bit");
	}
}
