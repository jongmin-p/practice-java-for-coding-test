package baekjoon;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		int numOfStar = 0;
		
		System.out.print("출력할 별의 라인 수를 입력해 주세요 > ");
		
		Scanner sc = new Scanner(System.in);
		numOfStar = Integer.parseInt(sc.nextLine());
		
		// 만약 5을 입력 시 5번 회전하면서 줄바꿈
		for (int i = 1; i <= numOfStar; i++) {
			
			// 이제는 같은 라인에서	-> 입력한 숫자의 -1 개 만큼 빈 칸 출력 (5 입력시 빈 칸 4개)
			for (int j = numOfStar; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
					
					// 숫자가 같아지면 (5 == 5), 라인 마지막에는 별 출력
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}