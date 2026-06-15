package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {
	/*
	 [조건]
	 둘레 공식: 한 변의 길이 x 4
	 넓이 공식: 한 변의 길이 x 한 변의 길이
	 
	 [입력 예시] 
	 정사각형 한 변의 길이 : 5
	 
	 [출력 예시] 
	 정사각형 한 변의 길이 : 5
	 둘레의 길이 : 20
	 넓이 : 25
	 */

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정사각형 한 변의 길이 : ");
	int length = sc.nextInt();
	
	// 정사각형 한 변의 길이
	System.out.println("정사각형 한 변의 길이 : " + length);
	
	// 둘레의 길이
	int result = length * 4;
	System.out.println("둘레의 길이 : " + result);
	
	// 넓이
	int result2 = length * length;
	System.out.println("넓이 : " + result2);
	
	sc.close();

	}

}
