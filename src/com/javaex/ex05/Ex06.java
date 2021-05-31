package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		
		for (int i = 0; i < 6 ; i++) {
			array[i] = (int)((Math.random()*45)+1);
			System.out.println(array [i]);
		}

	}

}
