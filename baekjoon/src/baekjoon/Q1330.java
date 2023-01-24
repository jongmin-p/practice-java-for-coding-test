package baekjoon;

import java.util.Scanner;

public class Q1330 {
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		System.out.print("두 수를 입력해 주세요 (띄어쓰기 사용) > ");
		Scanner sc = new Scanner(System.in);
		
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		
		if ((A < -10000 || A > 10000) || (B < -10000 || B > 10000)) {
			return ;
		}
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}