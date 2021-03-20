package com.bit.curr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.curr.model.CbbDao;

@WebServlet("/currdetail.bit")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CbbDao dao=new CbbDao();
		int num=Integer.parseInt(req.getParameter("num"));
		req.setAttribute("currDetail", dao.currDetail(num)); 
		req.getRequestDispatcher("currdetail.jsp").forward(req, resp);
	}
	
}