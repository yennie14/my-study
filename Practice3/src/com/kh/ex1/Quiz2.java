package com.kh.ex1;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지불한 돈 : ");
		int money = sc.nextInt();
		
		System.out.print("물건 가격 : ");
		int price = sc.nextInt();
		
		// 거스름돈
		int change = (money - price);
		// 천원 지폐
		int n1 = (change / 1000);
		// 백원 동전
		int n2 = (change % 1000 / 100);
		
		System.out.println("--- 거스름돈 내역 ---");
		System.out.printf("천원 지폐 : %d장\n", n1);
		System.out.printf("백원 동전 : %d개", n2);
		
		sc.close();
		
	}

}
