package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int number = sc.nextInt();
		
		/*
		강사님 방법
		if(number>0) {
			if(number%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else if(number<0) {
			System.out.println("음수");
		} else { 
			System.out.println("0");
		}
		*/

		
		//내 방법
		if (number < 0) {
			System.out.println("음수입니다.");
		} else if (number == 0) {
			System.out.println("0입니다.");
		} else if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		sc.close();
	}

}
