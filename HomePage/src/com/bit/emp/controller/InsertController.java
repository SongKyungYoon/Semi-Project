package com.bit.emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.emp.model.EbbDao;

@WebServlet("/empinsert.bit")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("id", "stxz00");
		req.getSession().setAttribute("name", "ÀÌÇØ³²");
		req.getSession().setAttribute("position", "Ãë¾÷");
		RequestDispatcher rd=req.getRequestDispatcher("empinsert.jsp");
		rd.forward(req, resp);
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")!=null ||
				!req.getSession().getAttribute("position").equals("Ãë¾÷"))
			resp.sendRedirect("emplist.bit");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=(String) req.getSession().getAttribute("id");
			String name=(String) req.getSession().getAttribute("name");
			String position=(String) req.getSession().getAttribute("position");
			//System.out.println(ID+NAME+POSITION);
			String coname=req.getParameter("coname");
			String content=req.getParameter("content");
			String deadline=req.getParameter("deadline");
			String coposition=req.getParameter("coposition");
			//System.out.println(sub+content);
			EbbDao dao=new EbbDao();
			dao.insertList(id, name, position, coname, content, deadline, coposition);
			resp.sendRedirect("emplist.bit");
	}
	
}