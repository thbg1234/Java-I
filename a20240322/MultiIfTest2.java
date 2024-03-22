package a20240322;
/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:
 * 90+A
 * 80+B
 * 70+C
 * 60+D
 * 60-F
*/

import java.util.Scanner;

public class MultiIfTest2 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("수자를 입력:");
			int num = stdIn.nextInt();
			
			if(num>=100 || num<0) {
				System.out.println("올바른 성적을 입력하십시오.");	
			}else if(num >= 90) {
				System.out.println("A");
			}else if(num>=80) {
				System.out.println("B");
			}else if(num>=70) {
				System.out.println("C");
			}else if(num>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
	}
}

