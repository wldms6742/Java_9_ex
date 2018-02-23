package com.jieun.student;

import java.util.Scanner;

public class StudentAddService {
//execute 메서드 생성
	//내용은 매개변수로 받은 학생을 
	//ㅅstudentdatabase에있는 students배열에 추가
	//배열은 만들때 크기생성
	//Students의 값이 null이면 배열은 0칸
	//배열한칸 생성해서 학생을 추가한다
	//null이 아니라면 학생을 추가 새로운 배열 추가
	public void execute() {
		StudentInput si = new StudentInput();
		Student student = si.addStudent();
		if(StudentDatabase.students== null) {
			StudentDatabase.students=new Student[1];
			StudentDatabase.students[0]=student;
		}else {
			int count = StudentDatabase.students.length;
			Student [] s = new Student[count+1];
			
			for(int i=0;i<count;i++) {
				s[i]=StudentDatabase.students[i];
			}
			s[count]=student;
		}
	}
}
