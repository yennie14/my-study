package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		상품명을 입력하세요: 아메리카노
		수량을 입력하세요: 3
		단가를 입력하세요: 4100.5
		 */
		
		// 1) 상품명 입력하세요: 출력
		System.out.print("상품명을 입력하세요: ");
		
		// 2) 상품명 입력받기
		String name = sc.nextLine();
		
		// 3) 수량을 입력하세요: 출력
		System.out.print("수량을 입력하세요: ");
		
		// 4) 수량 입력받기
		int qty = sc.nextInt();
		
		// 5) 단가를 입력하세요: 출력
		System.out.print("단가를 입력하세요: ");
		
		// 6) 단가 입력받기
		double price = sc.nextDouble();
		
		/* 7) 결과 출력
		 	--- 장바구니 영수증 ---
			상품명    : 아메리카노
			수량      : 3 잔
			단가      : 4100.50 원
			----------------------
			총 금액   : 12301.50 원
		 */
		System.out.println("--- 장바구니 영수증 ---");
		System.out.printf("%-7s: %s\n", "상품명", name);
		// System.out.printf("상품명    : %s/n", name); <이것도되고
		System.out.printf("%-7s: %d 잔\n", "수량", qty);
		System.out.printf("%-7s: %.2f 원\n", "단가", price);
		System.out.println("----------------------");
		System.out.printf("%-7s: %.2f 원", "총 금액", qty * price);
		
		
	}

}
