package spring_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        Demo d=ac.getBean(Demo.class);
        System.out.println(d);
        
        Demo2 d2=ac.getBean(Demo2.class);
        System.out.println(d2);
	}
}
