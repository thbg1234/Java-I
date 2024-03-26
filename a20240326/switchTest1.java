package a20240326;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명: 3.4.5=>봄
 * 6.7.8=>여름
 * 9.10.11=>가을
 * 12.1.2=>겨울
*/
public class switchTest1 {

	private void syso() {
		// TODO 自动生成的方法存根

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("월를 입력:");
		int month = stdIn.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
			
		default:
			System.out.println("해당 월은 없습니다.");
			break;
		}
	}
}











