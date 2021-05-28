package com.javaex.ex04;

import java.util.Iterator;

public class Ex13 {

	public static void main(String[] args) {

		// 로또
		for (int i = 0; i < 6; i++) {
			int num = (int) ((Math.random() * 45) + 1);
			System.out.print(num + "	");
		}

	}

}
