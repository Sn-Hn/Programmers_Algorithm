package programmers_Test;

import java.util.ArrayList;

/*

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

*/

public class study_모의고사 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] count = new int[3];
		int temp;
//		int[] a = new int[n];		// a = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...}
//		int[] b = new int[n];		// b = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, ...}
//		int[] c = new int[n];		// c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...}
		int[] a = {1, 2, 3, 4, 5};					// 5개씩 반복
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};			// 8개씩 반복
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};	// 10개씩 반복
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a[i%a.length]) {
				count[0]++;
			}
			if(answers[i] == b[i%b.length]) {
				count[1]++;
			}
			if(answers[i] == c[i%c.length]) {
				count[2]++;
			}
		}
		
		// 최대 값 구하기
		int max = count[0];	
		for(int i = 1; i < count.length; i++ ) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		// 함수를 이용한 최대 값 구하기
		int maxi = Math.max(Math.max(count[0], count[1]),count[2]);
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < count.length; i++) {
			if(maxi == count[i]) al.add(i+1);
			
		}
		answer = new int[al.size()];
		
		for(int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		study_모의고사 st = new study_모의고사();
		int[] arr = {3, 2, 1, 5, 4, 3, 4, 5, 2, 3, 4, 1, 4, 3, 5, 3, 3, 4};
//		System.out.println(st.solution(arr));
		System.out.println(st.solution(arr));
	}

}
