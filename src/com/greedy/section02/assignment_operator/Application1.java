package com.greedy.section02.assignment_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 대입연산자와 산술 대입 연산자 */
		
		int num = 12;
		System.out.println("num : " + num);
		
		num = num + 3;
		System.out.println("num : " + num);
		
		num += 3;
		System.out.println("num : " + num);
		
		num -= 5;
		System.out.println("num : " + num);
		
		num *= 2;
		System.out.println("num : " + num);
		
		num /= 2;
		System.out.println("num : " + num);
		
		/* 주의! 순서 바뀌지 않게 할 것 */
		num =- 5;
		System.out.println("num : " + num);
		
	}

}
