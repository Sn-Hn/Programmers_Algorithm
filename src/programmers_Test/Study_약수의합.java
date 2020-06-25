package programmers_Test;
/*
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
*/
public class Study_약수의합 {
	public int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Study_약수의합 st = new Study_약수의합();
		
		System.out.println(st.solution(12));
		
	}

}
