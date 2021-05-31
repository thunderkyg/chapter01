package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int [] intArray = new int[3];
		
		intArray[0] = 11;
		intArray[1] = 3;
		//intArray[2] = 78;

		System.out.println("================");
		System.out.println(intArray.length);
		System.out.println("================");
		
		for (int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("================");
		
		//ArrayIndexOutofBoundException --> 없는 방을 사용하려고 할때
		for(int i = 0; i <intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
