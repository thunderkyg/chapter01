package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		// 로또
		for (int i = 0; i < 6; i++) {
			int num = (int) ((Math.random() * 45) + 1);
			System.out.print(num + "	");
		}

	}

}
