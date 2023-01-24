package baekjoon;

import java.util.Scanner;

public class Q10430 {
	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		System.out.print("숫자 3개를 입력해 주세요 (띄어쓰기로 구분) > ");
		Scanner sc = new Scanner(System.in);
		
		// 띄어쓰기로 구분
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		C = Integer.parseInt(sc.next());
		
		if ((A < 2 || A > 10000) || (B < 2 || B > 10000) || (C < 2 || C > 10000) ) {
			return ;
		}
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}