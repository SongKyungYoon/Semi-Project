package com.bit.sugang.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.sugang.model.SugangListDao;

@WebServlet("/insertsugang.bit")
public class InsertContoller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		
		LocalDate ld = LocalDate.parse(req.getParameter("date"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		java.sql.Date date = java.sql.Date.valueOf(ld);
		System.out.println(date);
		
		String pnum=req.getParameter("number1")+req.getParameter("number2")+req.getParameter("number3");
		String email=req.getParameter("email");
		SugangListDao dao=new SugangListDao();
		dao.inputList(name, date, pnum,email);
		
	}
}
