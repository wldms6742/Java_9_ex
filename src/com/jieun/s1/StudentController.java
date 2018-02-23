package com.jieun.s1;

import java.util.Scanner;

import com.jieun.student.Student;
import com.jieun.student.StudentAddService;
import com.jieun.student.StudentInput;

public class StudentController {

	private Scanner sc;
	public StudentController() {
		sc = new Scanner(System.in);
	}
	
	
	public void start() {
/*	StudentAddService sa  = new StudentAddService();
	sa.execute();*/
		boolean check=true;
		while(check) {
			System.out.println("1. 학생추가");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 프로그램종료");
			
		}
		
	}
}
