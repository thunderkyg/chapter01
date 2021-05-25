package com.javaex.ex02;

public class Ex01 {
	
	public static void main (String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "김영기";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println("str");
		
		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println("illl");
		
		System.out.print("안녕");
		System.out.println("하");
		
		System.out.println("안녕");
		System.out.println("하");
		
		; 
		System.out.println("==================================================");
		
		System.out.println(i);
		System.out.println(i+i);

		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(str+i); // "굿모닝" + "2345"
		System.out.println(str+d); // "굿모닝" + 3.14 --> "굿모닝" + "3.14"
//		str 랑 i "굿모닝랑2345"
		System.out.println(str + "이랑" + i + "다");
		
//		주의
		System.out.println(c);
		System.out.println(c + c); // 주의
		System.out.println(s + c);
		System.out.println(c + s);
		
		// 제 이름은 김영기 입니다.
		System.out.println("제 이름은 " + name + " 입니다.");
		
//		안녕하세요
		System.out.println("안녕하세요");
		System.out.println("안녕'하'세요");
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\"하\"세요");

		System.out.println("안녕\t하\t세요");
		System.out.println("안녕\n하\n세요");
		
		
		
	}

}
