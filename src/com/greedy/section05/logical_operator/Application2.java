package com.greedy.section05.logical_operator;

public class Application2 {

	public static void main(String[] args) {
		
		/* 논리 연산자의 우선순위와 활용 */
		/* 논리 and 연산자와 논리 or 연산자의 우선순위
		 * && : 11순위
		 * || : 12순위
		 * */
		
		/* 1. 1부터 100 사이의 값인지 확인 */
		/* 1 <= 변수 <= 100 이렇게 사용하지 못함 --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
		int num1 = 55;
		System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));
		
		/* 2. 영어 대문자인지 확인 */
		char ch1 = 'G';
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		
		/* 3. 대소문자 상관 없이 영문자 y인지 확인 */
		char ch3 = 'Y';
		System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
		
		/* 4. 영문자인지 확인 */
		char ch4 = 'f';
		System.out.println("영문자인지 확인 : " + ((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z')));
	}

}









