package com.jieun.student;

import java.util.Scanner;

public class StudentInput {
	//addStudent메서드
	//학생 한명을 만들어서 학생을 리턴
	public  Student addStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		student.setName(sc.next());
		System.out.println("번호 : ");
		student.setNum(sc.nextInt());
		System.out.println("국어 :");
		student.setKor(sc.nextInt());
		System.out.println("영어 :");
		student.setEng(sc.nextInt());
		System.out.println("수학 :");
		student.setMath(sc.nextInt());
		student.setTotal(student.getKor()+student.getEng()+student.getMath());
		student.setAvg(student.getTotal()/3);
		
		return student;
	}
}
