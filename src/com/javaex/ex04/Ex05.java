package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {

		int sum = 0;

		for (int factor = 2; factor <= 9; factor++) {
			for (int i = 1; i <= 9; i++) {
				sum = factor * i;
				System.out.println(factor + " * " + i + " = " + sum);
			}
		}

	}

}
