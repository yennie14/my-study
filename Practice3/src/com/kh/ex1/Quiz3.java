package com.kh.ex1;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		//보호자 동반 필수 or 단독 탑승 가능
		String result = age < 12 || height < 130 ? "보호자 동반 필수" : "단독 탑승 가능";
		System.out.println(result);
		
		sc.close();
	}

}
