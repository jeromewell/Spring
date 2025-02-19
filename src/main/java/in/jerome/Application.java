package in.jerome;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
 public static void main(String[] args) {
	  
	 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("appbeans.xml");
	 RestaurentBill bean = context.getBean(RestaurentBill.class);
	 bean.collectBill();
}
}
 