package a20240315;
/*
 * 작성일:2024.3.12
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:
*/
public class VarDatatype {

	public static void main(String[] args) {
		// 상수 선언
		final int MAX = 100;
		final double PI = 3.14;
		
		//PI = 3.14159;  //오류 발생 ,상수는 한번 값이 결정되면 변할 수 없다.
		int r = 5;  //정수
		double pi = 3.14159;  //실수 변수
		String name = "석홍신";  //문자열
		char blood = 'A';  //문자
		//char blood1 = 'AB';  //오류 발생,문자는 1ㅠㅛㅅㄷ
		
		//원주을 출력
		System.out.println("원주율은 "+ PI +"입니다");
		System.out.println("원주율은 "+ pi +"입니다");
		
		//원의 넓이 계산하여 출력
		int d = r * 2;
		System.out.println("반지름이"+r+"인 원의 넓이는"+r*r*pi+"입니다");
		
		//원의 넓이를 계산하기
		double area = r*r*pi;
		System.out.println("반지름이"+r+"인 원의 넓이는"+area+"입니다");
		
		area = r*r*PI;
		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.\n",r,area);
		
		

	}

}
