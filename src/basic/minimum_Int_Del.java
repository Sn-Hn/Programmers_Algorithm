package basic;

import java.util.Arrays;

/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
*/
public class minimum_Int_Del {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int st = arr[0];
		String s = "";
		if (arr.length == 1) {
			return new int[] { -1 };
		}
		answer = new int[arr.length - 1];
		for (int i : arr) {
			if (i < st) {
				st = i;
			}
		}
		System.out.println(st);
		for (int i : arr) {
			if (st != i) {
				s += i;
			}
		}
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			answer[i] = Character.getNumericValue(s.charAt(i));
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		minimum_Int_Del mid = new minimum_Int_Del();
		int[] arr = { 4, 3, 2, 1, 6, 7 };
		mid.solution(arr);

	}

}
