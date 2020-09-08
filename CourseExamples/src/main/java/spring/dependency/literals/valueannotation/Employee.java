package spring.dependency.literals.valueannotation;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	 @Value("${employee.name}") 
	private String empName;
	 
	 @Value("${employee.id}")
	private int empId;
	 
	 @Value("${employee.skills}")
	private String empOtherSkills;
	
	/*
	 * //@Value("Sneha")
	 * 
	 * @Value("${employee.name}") public void setEmpName(String empName) {
	 * this.empName = empName; }
	 * 
	 * 
	 * @Value("${employee.id}") public void setEmpId(int empId) { this.empId =
	 * empId; }
	 * 
	 * 
	 * @Value("${employee.skills}") public void setEmpOtherSkills(String
	 * empOtherSkills) { this.empOtherSkills = empOtherSkills; }
	 */


	public void showDetails() {
		System.out.println("Name : "+empName);
		System.out.println("Id : "+empId);
		System.out.println("Skills : "+empOtherSkills);
	}

}
