package a20240319;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:if문 실습
*/
public class SimpleIfTest1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수자를 입력:");
		int num = stdIn.nextInt();
		if(num<0) {
			System.out.println(num+"은(는) 음수입니다.");
		}
        if(num>0) {
			System.out.println(num+"은(는) 양수입니다.");
		}
        if(num<0) {
			System.out.println(num+"은(는) 음수입니다.");
		}else {
			System.out.println(num+"은(는) 양수입니다.");
		}
		System.out.println("프로그램 종료.");
		
	}

}
