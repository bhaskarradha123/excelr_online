package com.excelR.spring_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelR.spring_2.controller.EmployeeController;
import com.excelR.spring_2.dao.EmployeeDao;
import com.excelR.spring_2.model.Employee;
import com.excelR.spring_2.service.EmployeeService;

@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
//		 creating an advance/J2EE container 
		ApplicationContext ac = SpringApplication.run(Spring2Application.class, args);
		Employee e=ac.getBean(Employee.class); //@Component
		System.out.println(e);
		EmployeeDao dao=ac.getBean(EmployeeDao.class); //@Repository
		System.out.println(dao);
		EmployeeService service=ac.getBean(EmployeeService.class);//@Service
		System.out.println(service);
		EmployeeController controller=ac.getBean(EmployeeController.class);//@Controller  @RestController
		System.out.println(controller);
	}

}
