package a20240326;

import java.util.Scanner;

/*
 * 작성일:2024.3.19
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명: 숫자와 연산자를 입력 받아
 * 		사칙연산 프로그램을 작성하시오
 * 		입력 방식:3+4(띄이쓰기로 구분)
 * 
 * 		숫자 연산자 숫자를 입력받아
 * 		해당 연산자에 따른 결과 출력 한다.
 * 
 * 		num2=0 X
 * 
*/
public class switchTest3 {

	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);

	        System.out.print("숫자와 연산자를 입력하세요 (예: 3 + 4): ");
	        double num1 = stdIn.nextDouble();
	        char op = stdIn.next().charAt(0); 
	        double num2 = stdIn.nextDouble();

	        double result;

	        switch (op) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	            	if(num2 == 0) {
	            		System.out.println("error");
	            	}else {
	            		result = num1 / num2;
	            		break;
	            	}
	            default:
	                System.out.println("유효하지 않은 연산자입니다.");
	                return;
	        }

	        System.out.println("결과: " + result);
	    }
	

}
