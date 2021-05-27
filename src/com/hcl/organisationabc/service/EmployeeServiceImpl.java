package com.hcl.organisationabc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hcl.organisationabc.modal.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
// Names of all employees in the sorted order are
	
	public List<String> sortingNames(ArrayList<Employee> employeeList) {
		
		Collections.sort(employeeList, new EmployeeNameComparator());
		
		List<String> list=new ArrayList<String>();

		for(Employee e: employeeList){
            list.add(e.getName());
		}
		return list;
	 }
	
// Count of Employees from each city
	public Map<String, Integer> cityNameCount(ArrayList<Employee> employeeList) {

		HashSet<String> set=new HashSet<String>();
		Map<String, Integer> map=new TreeMap<String, Integer>();
		
           for(Employee e : employeeList){
    	      if(set.contains(e.getCity())){
    		  
    	      }else{
    		     set.add(e.getCity());
    	      }  
            }
      
             for(String e1: set){
            	 int count=0;
    	         for(Employee e2: employeeList){
    		         if(e1.contains(e2.getCity())){
    			         count++;
    		        }
    		     map.put(e1, count);
    	      } 
            }
             
	    return map;
		
	}
	
// Monthly Salary of employee along with their id is
	
    public Map<Integer, Integer> monthlySalary(ArrayList<Employee> employeeList) {
 
    	  Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
    	
    	   for(Employee e: employeeList){
    		   int monthlySalary=e.getSalary()/12;
    		   map.put(e.getId(), monthlySalary);
    	     }
    	    return map; 
	 }

}
