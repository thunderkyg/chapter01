package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		/* 내 방식
		int a = 1;
		
		while (a!=0) {
			if(14*a%6==0) {
				break;
			} else {
				a++;
			}
		}
		
		System.out.println(14*a);
		*/
		
		
		
		// 강사님 방식
		
		int num =1;
		
		while (true) {
			if( (num%6==0) && (num%14==0) ) {
				break;
			}
				num++;
		}
		System.out.println(num);
		
	}
}