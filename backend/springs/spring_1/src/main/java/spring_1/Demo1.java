package spring_1;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo1 {

	public static void main(String[] args) throws SQLException {
		Demo1 demo1 = new Demo1();
		System.out.println(demo1);
		Demo1 demo2 = new Demo1();
		System.out.println(demo2);
		System.out.println("-----------------------");

//	  creating a core container to create objects in it. 
		Resource r = new ClassPathResource("bean.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		System.out.println(bf);
		Demo1 d3 = bf.getBean(Demo1.class);
		System.out.println(d3);
		Demo1 d4 = bf.getBean(Demo1.class);
		System.out.println(d4);
// creating advance/J2EE conatiner
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Demo1 d5 = bf.getBean(Demo1.class);
		System.out.println(d5);
		Demo1 d6 = bf.getBean(Demo1.class);
		System.out.println(d6);
/**
 * singleton - spring by default it creates singleton objects 
 *           - it avoids object creation for more than one time in memory
 * to change the scope need to use scope="prototype" in bean tag
 *           
 */
		
	}
}
