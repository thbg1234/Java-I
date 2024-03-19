package a20240319;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:if-else if
*/
public class MultiIfTest1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수자를 입력:");
		int num = stdIn.nextInt();
		
		if(num < 0) {
			System.out.println(num+"은(는) 음수입니다.");
		}else if(num > 0) {
			System.out.println(num+"은(는) 양수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		
	}

}
