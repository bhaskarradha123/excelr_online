package servlet_project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_project.dao.CrudOperation;

@WebServlet("/save") //deployment descriptor - which helps to connect a req with a servlet class
public class RegisterProgram  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {	
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String phone = req.getParameter("phone");
	String address = req.getParameter("address");
	
	int id_=Integer.parseInt(id); //parsing -converting string into int
	long phone_=Long.parseLong(phone);//parsing-converting String into long
	
	System.out.println(id_+ name+email+phone_+address);
	
	CrudOperation operation=new CrudOperation();
	try {
		if(operation.save(id_, name, email, phone_, address)>0) {
			RequestDispatcher dispatcher =req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res); //dispatch the objects into new resource
		}	
	} catch (SQLException e) {
		RequestDispatcher dispatcher=req.getRequestDispatcher("register.html");
		dispatcher.include(req, res);//dispatch the objects into existing resource
	}
	
	}

}
