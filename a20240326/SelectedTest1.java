package a20240326;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명: 새 자리의 십전수을 입력받아 각자리의 수자들이 짝수인지 홀수인지 판다.
 * 
 * 짝수 2로 나눈 나머지가 0이다
 * 홀수 2는 나누 나머자가 1이다(0이 아니다)
 * 세자리 수 100~999
 * 예를 들어 ,123을 입력했다면
 * 100 의자리 1은 홀수입니다.
 * 10 의자리 2는 짝수입니다.
 * 1의 자리 3은 홀수입니다.
 * 
 */
public class SelectedTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = stdIn.nextInt();
		if(num>999 || num<100) {
			System.out.println("유효하지 않은 연산자입니다.");
		}else {
			int i;
			int num1=0;
			int num2=0;
			int num3=0;
			for(i=0;num>100;i++) {
				num-=100;
				num1+=1;
			}
			i = i%2;
			switch(i) {
			case 1:
				System.out.println("100 의자리"+num1+" 은 홀수입니다.");
				break;
			case 0 :
				System.out.println("100 의자리"+num1+"은 짝수입니다.");
				break;
			}
			
			
			for(i=0;num>10;i++) {
				num-=10;
				num2+=1;
			}
			i = i%2;
			switch(i) {
			case 1:
				System.out.println("10 의자리"+num2+"은 홀수입니다.");
				break;
			case 0 :
				System.out.println("10 의자리"+num2+"은 짝수입니다.");
				break;
			}
			
			num3 = num;
			num=num%2;
			switch(num) {
			case 1:
				System.out.println("1 의자리"+num3+"은 홀수입니다.");
				break;
			case 0 :
				System.out.println("1 의자리"+num3+"은 짝수입니다.");
				break;
			}
		}
		
	}
}












