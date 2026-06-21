package codeup.q1066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if(a % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		
//		if(b % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		
//		if(c % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
		
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		for (int n : arr) {
			System.out.println(n % 2 == 0 ? "even" : "odd");
		}
		
		sc.close();

	}

}
