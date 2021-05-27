package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무 시간을 입력하세요: ");
		int worktime = sc.nextInt();

		if (worktime < 0) {
			System.out.println("잘못된 값");
		} else if (worktime <= 8) {
			int salary = 10000;
			System.out.println("임금은 " + (worktime * salary) + " 입니다");
		} else {
			int salary = 10000;
			int overtime = (int) (salary * 1.2);
			System.out.println("임금은 " + ((worktime - 8) * overtime + (salary * 8) + "원 입니다"));
		}

		sc.close();
	}

}
