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
		req.getSession().setAttribute("ID", "stxz00");
		req.getSession().setAttribute("NAME", "이해남");
		req.getSession().setAttribute("POSITION", "영업");
		RequestDispatcher rd=req.getRequestDispatcher("currinsert.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String ID=(String) req.getSession().getAttribute("ID");
			String NAME=(String) req.getSession().getAttribute("NAME");
			String POSITION=(String) req.getSession().getAttribute("POSITION");
			//System.out.println(ID+NAME+POSITION);
			String sub=req.getParameter("sub");
			
			LocalDate ld = LocalDate.parse(req.getParameter("open"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			java.sql.Date open = java.sql.Date.valueOf(ld);
			
			String period=req.getParameter("period");
			String qual=req.getParameter("qual");
			String content=req.getParameter("content");
			//System.out.println(sub+content);
			CbbDao dao=new CbbDao();
			dao.insertList(ID, NAME, POSITION, sub, open, period, qual, content);
			
			resp.sendRedirect("currlist.bit");
	}
	
}
