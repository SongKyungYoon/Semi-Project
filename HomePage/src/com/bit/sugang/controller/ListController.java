package com.bit.sugang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.sugang.model.SugangListDao;

@WebServlet("/listsugang.bit")
public class ListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SugangListDao dao=new SugangListDao();
		req.setAttribute("list",dao.sugangList());
		RequestDispatcher rd=req.getRequestDispatcher("/suganglist.jsp");
		rd.forward(req, resp);
	}

}
