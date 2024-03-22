package a20240322;

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			System.out.println("수자를 입력:");
			int month = stdIn.nextInt();
			
			if(3<=month &&month <=5) {
				System.out.println("봄");
			}else if(6<=month &&month <=8) {
				System.out.println("여름");
			}else if(9<=month &&month <=11) {
				System.out.println("가을");
			}else if(month == 12 || (1<=month && month<=2)) {
				System.out.println("겨울");
			}else {
				System.out.println("올바른 월을 입력하십시오.");
			}
		}
	}
}
