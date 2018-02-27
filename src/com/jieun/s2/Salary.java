package com.jieun.s2;

public class Salary {
	private int perHour;
	public Salary() {
		perHour = 7530;
	}
	
	public void cal(Emp emp) {
		
		double sal=perHour*emp.getNormalTime();
		sal = sal+perHour*1.5*emp.getOverTime();
		sal = sal+perHour*1.5*emp.getWeekTime();
		emp.setSal(sal);
		
		
	}
}
