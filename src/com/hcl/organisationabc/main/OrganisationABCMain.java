package com.hcl.organisationabc.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.hcl.organisationabc.exception.UserInputException;
import com.hcl.organisationabc.modal.Employee;
import com.hcl.organisationabc.service.EmployeeServiceImpl;
import com.hcl.organisationabc.service.IEmployeeService;
import com.hcl.organisationabc.util.UserInputValidation;

public class OrganisationABCMain {

	public static void main(String[] args){
		
		ArrayList<Employee> employeesList = new ArrayList<>();
		
		 IEmployeeService iEmployeeService=new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		
	while(true){
		
		System.out.println("Enter case 1 to add new employee"
				+"\nEnter case 2 to show employee list"
				+"\nEnter case 3 to exit"
				);
		int n=sc.nextInt();
		
	    switch(n){
	    case 1:

		    Employee employee = new Employee();
		    
	         while(true){
	        	    int result=0;
		             System.out.println("Enter employee name");
		             String name=sc.next();
	              	try {
			            result=UserInputValidation.employeeName(name);
		              } catch (UserInputException e2) {
			               e2.printStackTrace();
	                 	}
	              	if(result==1){
	              		employee.setName(name);
			         break;
		            }
	             }

	         while(true){
	        	    int result=0;
		               System.out.println("Enter employee age");
		               int age=sc.nextInt();
		             try {
		               	result=UserInputValidation.employeeAge(age);
		              } catch (UserInputException e2) {
			         e2.printStackTrace();
		            }
		           if(result==1){
		        	   employee.setAge(age);
			         break;
	            	}
	              }
		   
	        while(true){
	            int result=0;
		               System.out.println("Enter employee yearly salary");
		               int salary=sc.nextInt();
		            try {
			            result=UserInputValidation.employeeSalary(salary);
		              } catch (UserInputException e2) {
		          	         e2.printStackTrace();
		               }
		               if(result==1){
		            	   employee.setSalary(salary);
		              	break;
		             }
	              }
	 
	         while(true){
	        	    int result=0;
		                System.out.println("Enter employee department name");
		                String department=sc.next();
		             try {
			              result=UserInputValidation.employeeDepartment(department);
		             } catch (UserInputException e2) {
			              e2.printStackTrace();
	               	}
		           if(result==1){
		        	   employee.setDepartment(department);
			             break;
		               }
	              }
		   
	         while(true){
	        	    int result=0;
		         System.out.println("Enter employee city name");
		         String city=sc.next();
		         try {
			         result=UserInputValidation.employeeCity(city);
		          } catch (UserInputException e2) {
		                e2.printStackTrace();
		           }
		         if(result==1){
		        	     employee.setCity(city);
			             break;
		               }
	            }
		   
	         employeesList.add(employee);

		    break;
		    
	 case 2:
		
		 System.out.println("List of employees");
		    for(Employee eList: employeesList ){
		    	System.out.println(eList.getId()+"   "+eList.getName()+"   "+eList.getAge()+"    "+eList.getSalary()+"    "+eList.getDepartment()+"  "+eList.getCity());
		    }
		 
		  System.out.println("\nNames of all employees in the sorted order are ");
		  List<String> employeeNameList = iEmployeeService.sortingNames(employeesList);
		  System.out.println(employeeNameList);
		    
		  System.out.println("\nCount of Employees from each city");
		  Map<String, Integer> mapCity=iEmployeeService.cityNameCount(employeesList);
		  System.out.println(mapCity);
		    
		  System.out.println("\nMonthly Salary of employee along with their id is");
		  Map<Integer, Integer> mapSalary=iEmployeeService.monthlySalary(employeesList);
		  System.out.println(mapSalary);

		  break;
		  
	 case 3:
		 System.exit(1);
		 break;
		      
	 default:
		 System.out.println("Invalid case");
		
	  }
	
	}
	
  }

}
