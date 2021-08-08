package com.greedy.section03.increment_decrement_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 증감연산자 */
		/* 피연산자의 앞 or 뒤에 사용 가능하다 
		 * ++ : 1 증가의 의미
		 * -- : 1 감소의 의미
		 * */
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		/* 다른 연산자와 함께 사용할 때 의미가 달라진다. */
		/* ++var : 피연산자의 값을 먼저 1을 증가시키고 난 후 다른 연산을 진행함
		 * var++ : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
		 * --var : 피연산자의 값을 먼저 1 감소시킨 후 다른 연산을 진행함
		 * var-- : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
		 * */
		int firstNum = 20;
		int result1 = firstNum++ * 3;
		
		System.out.println("result1 : " + result1);
		System.out.println("firstNum : " + firstNum);
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		
		System.out.println("result2 : " + result2);
		System.out.println("secondNum : " + secondNum);
		
	}

}










