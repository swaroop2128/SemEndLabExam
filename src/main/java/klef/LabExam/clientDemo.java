package klef.LabExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class clientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ac=new ClassPathXmlApplicationContext("spconfig.xml");
         Object ob=ac.getBean("empbean");
         Employee emp=(Employee)ob; 
         System.out.println(emp.displayEmployee());

	}

}
