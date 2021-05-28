package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {


		/* 내 방법
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. [0이면 종료]");

		while(true) {
		int num = input.nextInt();
		sum = sum + num;
		System.out.println("합계: " + sum);
			if (num==0) {
				System.out.println("종료");
				break;
			}
			}
		input.close();
		 */



		/* do~while을 사용한 방법
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("숫자를 입력하세요. [0이면 종료]");

		do {
			num = input.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
		} while (num!=0);

		System.out.println("종료");
		 */


	}
}

