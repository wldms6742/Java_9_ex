package com.jieun.s2;

public class Test_1 {

	public static void main(String[] args) {
		//시간당 급여7530
		//9-6
		//6시이후 초과근무 시급 1.5배
		//4대보험
		//국민연금 급여 0.015
		//의료보험 급여0.02
		//산재보험 급여 0.005
		//고용보험 급여 0.025
		
		int normalTime = 8;
		int overTime = 4;
		int weekTime=10;
		Salary salary = new Salary();
		Emp emp = new Emp();
		emp.setNormalTime(8);
		emp.setOverTime(4);
		emp.setWeekTime(10);
		//월급 전문 계산
		salary.cal(emp);
		
		System.out.println(emp.getSal());
		
		Insurance insurance = new Insurance();
		double d=insurance.ins1(emp.getSal());
		emp.setSal(d);
		
		d = insurance.ins2(emp.getSal());
		emp.setSal(d);
		
		emp.setSal(insurance.ins3(emp.getSal()));//d대신에 사용
		
		
		emp.setSal(insurance.ins4(emp.getSal()));
		
				
		View view = new View();
		
		view.view(emp);
	}

}
