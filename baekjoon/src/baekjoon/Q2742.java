package baekjoon;

import java.util.Scanner;

public class Q2742 {
	public static void main(String[] args) {
		int number = 0;
		
		System.out.print("값을 입력해 주세요 > ");
		Scanner sc = new Scanner(System.in);
		number = Integer.parseInt(sc.nextLine());
		
		if (number > 1000000 || number <= 0) {
			return ;
		}
		
		for(int i = number; i >= 1; i--) {
			System.out.println(number);
			number--;
		}
	}
}