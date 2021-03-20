package com.bit.sugang.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.sugang.model.SugangListDao;

@WebServlet("/checksugang.bit")
public class CheckController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		String check=req.getParameter("check");
		SugangListDao dao=new SugangListDao();
		dao.check(num,check);
		
		
	}
}