package spring.annotationconfig;

import org.springframework.stereotype.Component;

@Component // ------ > <bean id = "company" class = "spring.annotationconfig.Company"/>
//@Component("myCompany")
public class Company {

	SoftwareEngineer engineer;

	public void setEngineer(SoftwareEngineer engineer) {
		this.engineer = engineer;
		System.out.println("I am in setter");
	}

	public Company(SoftwareEngineer engineer) {
		this.engineer = engineer;
		System.out.println("I am in constructor");
	}

	public void showDetails() {
		System.out.println("Welcome to Synerzip!");
	}
}
