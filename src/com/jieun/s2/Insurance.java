package com.jieun.s2;

public class Insurance {

	//국민 연금 계산
	public double ins1(double sal) {
		sal = sal-sal*0.015;
		return sal;
		}
	//의료 보험 계산
	public double ins2(double sal) {
		sal = sal-sal*0.02;
		return sal;
	}
	//산재
	public double ins3(double sal) {

		sal = sal-sal*0.005;
		return sal;
		}
	//고용보험계산
	public double ins4(double sal) {

		sal = sal-sal*0.025;
		return sal;
	}

}
