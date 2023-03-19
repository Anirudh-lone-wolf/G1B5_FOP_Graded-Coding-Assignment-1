package com.greatlearning.problem;

public class HrDepartment extends SuperDepartment{//This is a Sub Class of Super Department class

	
	@Override
	public String departmentName() {
		return "Welcome to HR department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team Lunch";
	}

}
