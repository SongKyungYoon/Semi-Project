package com.bit.emp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.emp.model.EbbDao;

@WebServlet("/empdetail.bit")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EbbDao dao=new EbbDao();
		int num=Integer.parseInt(req.getParameter("num"));
		int count=Integer.parseInt(req.getParameter("count"));
		dao.countEmp(num, count);
		req.setAttribute("ebbDetail", dao.ebbDetail(num)); 
		req.getRequestDispatcher("empdetail.jsp").forward(req, resp);
	}
	
}