package servlet_project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.dao.CrudOperation;
@WebServlet("/login")
public class LoginProgram extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		System.out.println(name+" "+phone);
		CrudOperation operation=new CrudOperation();
		try {
		if(operation.login(name, phone))
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			req.setAttribute("errorMsg", name+" your data is incorrect pls provide correct credentials");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
