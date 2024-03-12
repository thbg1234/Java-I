package a20240312;

import java.util.*;

/*
 * 작성일:2024.3.12
 * 작성자:컴퓨터공학부 202195056 석홍신
 * 설명:이름 입력
*/
public class KeyInput {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in); 
	System.out.println("당신의 이름을 입력하세요:");
	String name = stdIn.next();
	System.out.println("안녕하세요."+name+"님 반갑습니다.");
    }
}
