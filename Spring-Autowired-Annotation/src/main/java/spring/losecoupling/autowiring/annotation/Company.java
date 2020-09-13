package spring.losecoupling.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	@Autowired
	@Qualifier("dept2")
	Dept dept;


	public void companyWork() {
		if(dept == null)
			System.out.println("No client No Work!");
		else
			dept.work();
	}
	
	
}
