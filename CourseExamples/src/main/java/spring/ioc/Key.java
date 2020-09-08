package spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Key {
	
	
	
	public void run(Engine key)
	{
		key.start();
	}
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Engine engine = (Engine)context.getBean("engine");
		
		new Key().run(engine);
		
	}

}
