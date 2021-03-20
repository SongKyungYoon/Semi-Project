package com.bit.emp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.emp.model.EbbDao;

@WebServlet("/empinsert.bit")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("ID", "stxz00");
		req.getSession().setAttribute("NAME", "ÀÌÇØ³²");
		req.getSession().setAttribute("POSITION", "Ãë¾÷");
		RequestDispatcher rd=req.getRequestDispatcher("empinsert.jsp");
		rd.forward(req, resp);
		if(req.getSession().getAttribute("ID")==null ||
				req.getSession().getAttribute("NAME")!=null ||
				!req.getSession().getAttribute("POSITION").equals("Ãë¾÷"))
			resp.sendRedirect("emplist.bit");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String ID=(String) req.getSession().getAttribute("ID");
			String NAME=(String) req.getSession().getAttribute("NAME");
			String POSITION=(String) req.getSession().getAttribute("POSITION");
			//System.out.println(ID+NAME+POSITION);
			String coname=req.getParameter("coname");
			String content=req.getParameter("content");
			String deadline=req.getParameter("deadline");
			String coposition=req.getParameter("coposition");
			//System.out.println(sub+content);
			EbbDao dao=new EbbDao();
			dao.insertList(ID, NAME, POSITION, coname, content, deadline, coposition);
			
			resp.sendRedirect("emplist.bit");
	}
	
}