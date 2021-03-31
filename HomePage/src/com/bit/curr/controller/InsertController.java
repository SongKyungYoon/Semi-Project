package com.bit.curr.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.bit.curr.model.CbbDao;

@WebServlet("/currinsert.bit")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("currinsert.jsp");
		rd.forward(req, resp);
		if(req.getSession().getAttribute("id")==null ||
				req.getSession().getAttribute("name")==null ||
				!req.getSession().getAttribute("position").equals("¿µ¾÷"))
			resp.sendRedirect("currlist.bit");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=(String) req.getSession().getAttribute("id");
			String name=(String) req.getSession().getAttribute("name");
			String position=(String) req.getSession().getAttribute("position");
			//System.out.println(ID+NAME+POSITION);
			String sub=req.getParameter("sub");
			
			LocalDate ld = LocalDate.parse(req.getParameter("open"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			java.sql.Date open = java.sql.Date.valueOf(ld);
			
			String period=req.getParameter("period");
			String qual=req.getParameter("qual");
			String content=req.getParameter("content");
			//System.out.println(sub+content);
			CbbDao dao=new CbbDao();
			dao.insertList(id, name, position, sub, open, period, qual, content);
			
			resp.sendRedirect("currlist.bit");
	}
	
}