package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("근무 시간을 입력하세요: ");
		int worktime = sc.nextInt();
		int salary = 10000;
		
		if (worktime<=8) {
			System.out.println("임금은 " + (worktime*salary) + " 입니다");

		} else {
			System.out.println("임금은 " + ((worktime-8)*salary*15/10 + salary*8) + " 입니다");
		}
		
		sc.close();

	}

}
