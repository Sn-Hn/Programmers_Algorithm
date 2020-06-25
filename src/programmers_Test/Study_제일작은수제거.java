package programmers_Test;

public class Study_제일작은수제거 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int st = arr[0];
		int j = 0;
		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arr.length - 1];
			for (int i : arr) {
				if (i < st) {
					st = i;
				}
			}
			
			for (int i : arr) {
				if (st != i) {
					answer[j] += i;
					j++;

				}
			}
			
//			for (int i : arr) {
//				if (st != i) {
//					s += i;
//				}
//			}
//			for (int i = 0; i < s.length(); i++) {
//				answer[i] = Character.getNumericValue(s.charAt(i));
//			}

		}
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Study_제일작은수제거 st = new Study_제일작은수제거();
		int arr[] = {4, 2, 3, 1, 5, 7, 10, 15, 6, 26};
		st.solution(arr);
	}

}
