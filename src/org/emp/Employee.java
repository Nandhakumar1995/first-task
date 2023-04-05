//package 1
package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

//class 1
public class Employee {
	private void empName() {
		System.out.println("employee name : nandha");		
	}
public static void main(String[]args) {
	Employee e = new Employee();
	e.empName();
	Company co = new Company();
	co.companyName();
	Client c = new Client();
	c.clientName();
	Project p = new Project();
	p.projectName();
	
}
}
