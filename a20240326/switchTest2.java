package a20240326;
/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명: 3.4.5=>봄
 * 6.7.8=>여름
 * 9.10.11=>가을
 * 12.1.2=>겨울
*/
import java.util.Scanner;

public class switchTest2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("월를 입력:");
		int month = stdIn.nextInt();
		String MtoS;
		switch(month) {
		case 12:
		case 1:
		case 2:
			MtoS = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			MtoS = "봄";
			break;
		case 6:
		case 7:
		case 8:
			MtoS = "여름";
			break;
		case 9:
			System.out.print("멋진 9월과");
		case 10:
			System.out.print(" 아름다운 10월과");
		case 11:
			System.out.print(" 낙엽의 11월은");
			MtoS = "가을입니다.";
			break;
		default:
			MtoS = "1~12월을 벗어난 달입니다.";
			break;
		}
		System.out.println(MtoS);
	}
}
















