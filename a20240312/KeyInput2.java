package a20240312;
/*
 * 작성일:2024.3.12
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:이름 나이 몸무게
*/
import java.util.Scanner;

public class KeyInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("이름과 나이 몸무게를 입력하세요.");
		String name = stdIn.next();
		int age = stdIn.nextInt();
		double weight = stdIn.nextDouble();
		System.out.println(name+"닙의 나이는 "+age+"이고,");
		System.out.println("몸무게는 "+weight+"kg 입니다.");
	}
}
