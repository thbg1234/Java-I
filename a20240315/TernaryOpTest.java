package a20240315;

import java.util.Scanner;

/*
 * 작성일:2024.3.15
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:3항 연산자
 *     장수를 입력 받아 짝수인지 확인하는 프로그램
*/
public class TernaryOpTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		boolean result ;  // true,flase
		result = (num % 2 == 0) ? true : false;
		
		System.out.println(num + "은 짝수입니까?");
		System.out.println(result);
		
	}

}
