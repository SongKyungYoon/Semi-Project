package com.bit.curr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.curr.model.CbbDao;

@WebServlet("/currdelete.bit")
public class DeleteController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(req.getParameter("num"));
		//System.out.println(num);
		CbbDao dao=new CbbDao();
		dao.deleteCurr(num);
	}
}