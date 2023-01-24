package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10871 {
	public static void main(String[] args) {
		ArrayList<Integer> numArr = new ArrayList<>();		// 난수로 채운 배열

		int arrLength = 0;		// 배열 길이
		int specificNumber = 0;	// 기준값 설정
		int eachNumber = 0;
		
		
		System.out.print("배열 개수와 기준 숫자를 입력하세요 (띄어쓰기로 구분) > ");
		Scanner sc = new Scanner(System.in);
		
		// 배열 길이와 기준값을 입력 받는다.
		arrLength = Integer.parseInt(sc.next());
		specificNumber = Integer.parseInt(sc.next());
		
		System.out.print("배열 값 : ");
		
		for (int i = 0; i < arrLength; i++) {
			eachNumber = (int)(Math.random() * 10000) + 1;		// 난수 생성
			System.out.print(eachNumber + " ");				// 난수 배열 확인용
			
			// 만약 난수가 기준값보다 작으면, numArr 에다가 추가
			if(eachNumber < specificNumber) {
				numArr.add(eachNumber);
			}
		}
		
		System.out.println("\n\n아래는 결과입니다\n");
		
		// numArr 사이즈가 0 이면, 즉 빈 배열이면 임의로 1개 추가해줌. (기준값 - 1 한 값을 넣어줌)
		if(numArr.size() == 0) {
			System.out.println(numArr.add(specificNumber - 1));
			System.out.print("아무 숫자도 없어서 그냥 -1 해서 넣음");
		} else {
			// numArr 사이즈가 1 이상이면, 즉 빈 배열이 아니면 전체 출력
			for(int i = 0; i < numArr.size(); i++) {
				System.out.print(numArr.get(i) + " ");
			}
		}
	}
}


/*
	public static void main(String[] args) {
		int[] numArr = {};		// 난수로 채운 배열

		int arrLength = 0;		// 배열 길이
		int specificNumber = 0;	// 기준값 설정
		int eachNumber = 0;
		
		
		System.out.print("배열 개수와 기준 숫자를 입력하세요 (띄어쓰기로 구분) > ");
		Scanner sc = new Scanner(System.in);
		
		// 배열 길이와 기준값을 입력 받는다.
		arrLength = Integer.parseInt(sc.next());
		specificNumber = Integer.parseInt(sc.next());
		
//		numArr = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			eachNumber = (int)(Math.random() * 10) + 1;
			
			if(eachNumber < specificNumber) {
				for(int j = 0; j < )
				numArr[numArr.length] = eachNumber;
			}
		}
		
		if(numArr.length == 0) {
			numArr[0] = specificNumber - 1;
			System.out.print("아무 숫자도 없어서 그냥 -1 해서 넣음");
		}
	}
 */