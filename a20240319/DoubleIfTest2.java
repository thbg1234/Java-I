package a20240319;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:if문 실습
 *     짝수,홀수
*/
public class DoubleIfTest2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수자를 입력:");
		int num = stdIn.nextInt();
		if(num>=0) {
		    if(num == 0) {
			    System.out.println(num+"은(는) 짝수입니다");
		    }
		    else if(num % 2 == 0) {
			    System.out.println(num+"은(는) 짝수입니다");
		    }else {
			    System.out.println(num+"은(는) 홀수입니다");
		    }
		}else {
			System.out.println("양수 입력하세요.");
		}
	}
	
}
