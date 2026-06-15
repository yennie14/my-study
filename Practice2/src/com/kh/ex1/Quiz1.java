package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		
		// 이름 자료형 변수
		String name;
		name = sc.nextLine();
		
		System.out.print("나이: ");
		// 나이 자료형 변수
		int age;
		age = sc.nextInt();
		
		System.out.print("키: ");
		// 키 자료형 변수
		double height;
		height = sc.nextDouble();
		
		/*
		====================
		이름: 이순신
		나이: 25세
		키: 176.5cm
		====================
		 */

		System.out.println("====================");
		System.out.println("이름: " + name);
		System.out.printf("나이: %d\n", age);
		System.out.println("키: " + height + "cm");
		System.out.println("====================");
		
		sc.close();
		
	}

}
