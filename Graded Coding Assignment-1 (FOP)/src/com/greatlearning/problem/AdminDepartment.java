package com.greatlearning.problem;

public class AdminDepartment extends SuperDepartment {//This is a Sub Class of Super Department class

	@Override
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
