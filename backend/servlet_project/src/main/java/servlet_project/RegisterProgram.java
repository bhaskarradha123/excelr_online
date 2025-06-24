package servlet_project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

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
	
	}

}
