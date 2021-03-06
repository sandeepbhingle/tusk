package injectObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("triangle.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		Triangle triangle2 = (Triangle) context.getBean("triangle");
		triangle.drawTriangle();
		triangle2.drawTriangle();
	}

}
