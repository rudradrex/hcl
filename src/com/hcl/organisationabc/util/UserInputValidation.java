package com.hcl.organisationabc.util;

import com.hcl.organisationabc.exception.UserInputException;

public class UserInputValidation{
	
	public static int employeeName(String name) throws UserInputException{
		int result=0;
		if(name.matches("[a-zA-Z]{3,20}")){
			result=1;
		}else{
			result=0;
			throw new UserInputException("Name should be character only and length should be 3 or more");
		}
		return result;
	}
	
	public static int employeeAge(Integer age) throws UserInputException{
		int result=0;
		if(age<0){
			result=0;
			throw new UserInputException("age should be number only");
		}else{
			result=1;
		}
		return result;
	}
	
	public static int employeeSalary(Integer salary) throws UserInputException{
		int result=0;
		if(salary<0){
			result=0;
			throw new UserInputException("salary should be number only");
		}else{
			result=1;
		}
		return result;
	}
	
	public static int employeeDepartment(String department) throws UserInputException{
		int result=0;
		if(department.matches("[a-zA-Z]+")){
			result=1;
		}else{
			result=0;
			throw new UserInputException("department name may be character only");
		}
		return result;
	}
	
	public static int employeeCity(String city) throws UserInputException{
		int result=0;
		if(city.matches("[a-zA-Z]+")){
			result=1;
		}else{
			result=0;
			throw new UserInputException("City name may be character only");
		}
		return result;
	}

}
