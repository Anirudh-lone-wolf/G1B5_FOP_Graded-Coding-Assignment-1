package com.greatlearning.problem;

public class TechDepartment extends SuperDepartment{//This is a Sub Class of Super Department class

	@Override
	public String departmentName() {
		return "Welcome to Tech department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackinfo() {
		return "Core java";
	}

}
