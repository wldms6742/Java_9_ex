package com.jieun.s3;

public class Customer {

/*	public void eat(Pasta pasta) {
		
	}
	public void eat(Steak steak) {
		
	}//오버로딩
*/
//-> 오버로딩안하고 부모클래스food이용
	public void eat(Food food) {
		System.out.println(food.getName());
	}


}
