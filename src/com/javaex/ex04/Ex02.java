package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력해주세요.");
		System.out.print("단:");
		int num = sc.nextInt();
		int i = 1;
		while (i <= 9) {
			int sum = (num * i);
			System.out.println(num + " * " + i + " = " + sum);
			i++;
		}

		sc.close();

	}

}
