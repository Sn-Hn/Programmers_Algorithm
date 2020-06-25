package programmers_Test;

public class Study_정수사이의값더하기 {
	public long solution(int a, int b) {
		long answer = 0;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Study_정수사이의값더하기 st = new Study_정수사이의값더하기();
		System.out.println(st.solution(3, 5));
	}

}
