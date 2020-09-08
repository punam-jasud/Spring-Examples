package spring.losecoupling.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	
	HrDept dept;

	public Company(HrDept dept) {
		this.dept = dept;
		//System.out.println("Const");
	}
	
	public void setDept(HrDept dept) {
		this.dept = dept;
		//System.out.println("Setter");
	}

	public void companyWork() {
		if(dept == null)
			System.out.println("No client No Work!");
		else
			dept.work();
	}
	
	
}
