package a20240315;

import java.util.Scanner;

/*
 * 작성일:2024.3.15
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:두개의 정수를 입력 받아 평균을 계산하는 프로그램
*/
public class DataTypeOper {
	public static void main(String[] args) {
		//두개의 정수를 입력 받는다
		//scanner 객채 생상
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력:");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력:");
		int num2 = stdIn.nextInt();
		
		double avg1 = (num1+num2)/2;
		System.out.println("정수 연산:"+num1+"+"+num2+"="+avg1);
		double avg2 = (num1+num2)/2.0;
		System.out.println("실수 연산:"+num1+"+"+num2+"="+avg2);
	}

}
