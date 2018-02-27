package com.jieun.s3;

import java.util.Scanner;

public class Menu {
	private Steak_Chef s;//멤버변수선언
	private Pasta_Chef p;
	private Customer c;
	public Menu() {
		s = new Steak_Chef();
		p = new Pasta_Chef();
		c = new Customer();
	}
	public void start() {
		boolean check = true;
		Scanner sc  = new Scanner(System.in);
		

		while(check) {
			System.out.println("1.Steak");
			System.out.println("2.Pasta");
			System.out.println("3.End  ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				Steak steak = s.makeSteak();
				c.eat(steak);

				break;

			case 2:
				Pasta pasta = p.makePasta();
				c.eat(pasta);

				break;

			default:
				System.out.println("집에가자");
				check=!check;
				break;
			}
		}
	}
}
