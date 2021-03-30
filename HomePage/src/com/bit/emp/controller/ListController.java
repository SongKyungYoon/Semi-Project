package com.bit.emp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.emp.model.EbbDao;

@WebServlet("/emplist.bit")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EbbDao dao=new EbbDao();
		req.setAttribute("ebbList", dao.ebbList()); 
		req.getRequestDispatcher("emplist.jsp").forward(req, resp);
	
	}
}