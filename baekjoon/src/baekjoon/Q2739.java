package baekjoon;

import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		// 숫자를 입력받는다.	(2 ~ 9)
		// 해당 숫자에 맞는 구구단 출력한다.
		
		int gugudan = 0;
		
		System.out.print("출력할 단을 입력해 주세요 > ");
		
		Scanner sc = new Scanner(System.in);
		gugudan = Integer.parseInt(sc.nextLine());
		
		// 입력받은 단이 구구단 범위를 벗어나면 종료
		if (gugudan < 2 || gugudan > 9) {
			return ;
		}
		
		// 구구단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", gugudan, i, gugudan * i);
		}
	}
}