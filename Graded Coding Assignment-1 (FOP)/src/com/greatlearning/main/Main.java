package com.greatlearning.main;

import com.greatlearning.problem.*;

public class Main {

	public static void main(String[] args) {
		//AdminDepartment object
		AdminDepartment admin = new AdminDepartment() ;
		//method overriding and displaying functionalities 
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		//HrDepartment object
		HrDepartment hr = new HrDepartment() ;
		//method overriding and displaying functionalities 
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		//TechDepartment object
		TechDepartment tech = new TechDepartment() ;
		//method overriding and displaying functionalities 
		System.out.println(tech.departmentName()); 
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackinfo());
		System.out.println(tech.isTodayAHoliday());

	}

}
