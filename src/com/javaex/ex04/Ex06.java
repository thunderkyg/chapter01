package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		
		
		//내 방법
		/*
		String a = "";
		for (int i = 1; i <= 6; i++) {
			a = a + "*";
			System.out.println(a);
		}
		*/
		
		
//		//강사님 방법
//		for (int y = 1; y <= 6; y++) {
//			for (int x = 1; x <= 6; x++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		for (int y = 1; y <= 6; y++) {
			
			for (int x = 1; x < y; x++) {
				System.out.print("*");

			}
			System.out.println("*");
		}

	}

}