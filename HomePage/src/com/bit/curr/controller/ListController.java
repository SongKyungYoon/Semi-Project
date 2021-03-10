package com.bit.curr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.bit.curr.model.CbbDao;

@WebServlet("/currlist.bit")
public class ListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CbbDao dao=new CbbDao();
		req.setAttribute("currList", dao.currList()); 
		req.getRequestDispatcher("currlist.jsp").forward(req, resp);
	}
}
