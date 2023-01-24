package baekjoon;

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		int numOfCase = 0;			// 테스트 케이스 수
		int numOfStd = 0;			// 학생 수
		int[] eachScore;			// 각 학생마다의 점수
		int count = 0;
		
		int totalScore = 0;
		double avgScore = 0.0;		// 평균 점수
		
		System.out.print("테스트 케이스의 수를 입력해 주세요 > ");
		Scanner sc = new Scanner(System.in);
		
		numOfCase = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numOfCase; i++) {
			
			numOfStd = Integer.parseInt(sc.next());		// 학생 수 입력
			eachScore = new int[numOfStd];
			
			// 성적 입력 부분
			for (int j = 0; j < eachScore.length; j++) {				
				eachScore[j] = Integer.parseInt(sc.next());
				totalScore += eachScore[j];
			}
			
			// 평균 점수 계산
			avgScore = totalScore / numOfStd;

			
			// 평균점수보다 낮은 학생들 카운트
			for (int j = 0; j < numOfStd; j++) {
				if (eachScore[j] > avgScore) {
					count++;
				}
			}
			
			
			// % 출력하려면 %% 이렇게 2번 쓰기
			System.out.printf("%.3f%%", (double)count / numOfStd * 100);
			System.out.println();
			
			
			// totalScore 랑 count 값 초기화	 (이거 안하면 다른 값 발생함)
			totalScore = 0;
			count = 0;
		}
	}
}