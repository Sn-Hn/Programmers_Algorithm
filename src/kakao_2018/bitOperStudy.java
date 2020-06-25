package kakao_2018;

import java.util.Arrays;

public class bitOperStudy {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n];
		int[] bit_Oper = new int[n];
		
		for(int i = 0; i < n; i++) {
			bit_Oper[i] = arr1[i] | arr2[i];			// 비트연산자 공부하기..... | 은 OR  & 은 AND ^ 은 XOR
			System.out.print(bit_Oper[i] + " ");
			
			answer[i] = Integer.toBinaryString(bit_Oper[i]);		// int형 수를 이진수로 바꿔주는 라이브러리
			System.out.println(answer[i]);
		}
		for(int i = 0; i < n; i++ ) {
			String str = "";
			for(int j = 0; j < n; j++) {
				if(answer[i].charAt(j) == '1') {
					str += "#";
				}else str += " ";
			}
			answer[i] = str;
		}
		

		return answer;
	}

	public static void main(String[] args) {
		bitOperStudy hm = new bitOperStudy();
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		hm.solution(n, arr1, arr2);

	}

}
