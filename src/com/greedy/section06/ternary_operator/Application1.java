package com.greedy.section06.ternary_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 삼항연산자 
		 * (조건식)? 참일 때 반환값: 거짓일 때 반환값;
		 * */
		
		int num1 = 10;
		int num2 = -10;
		
		String result1 = (num1 > 0)? "양수다.": "양수가 아니다.";
		System.out.println("result1 : " + result1);
		
		String result2 = (num2 > 0)? "양수다.": "양수가 아니다.";
		System.out.println("result2 : " + result2);

		/* 중첩 사용도 가능하다. */
		int num3 = 5;
		int num4 = 0;
		int num5 = -5;
		
		String result3 = (num3 > 0)? "양수다.": (num3 == 0)? "0이다.": "음수다.";
		System.out.println("num3은 " + result3);
		
		String result4 = (num4 > 0)? "양수다.": (num4 == 0)? "0이다.": "음수다.";
		System.out.println("num4는 " + result4);
		
		String result5 = (num5 > 0)? "양수다.": (num5 == 0)? "0이다.": "음수다";
		System.out.println("num5는 " + result5);
		
	}

}
