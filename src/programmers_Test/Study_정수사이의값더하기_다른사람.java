package programmers_Test;

public class Study_정수사이의값더하기_다른사람 {
	public long solution(int a, int b) {
      return sumAtoB(Math.min(a, b), Math.max(b, a));		// 라이브러리 Math 사용

//		내 정답을 삼항연산자를 통해 깔끔하게 줄임
//		long answer = 0;
//		for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)	// for문을 삼항 연산자로 돌려 if문을 줄임
//			answer += i;
//
//		return answer;
	}

	private long sumAtoB(long a, long b) {
		return (b - a + 1) * (a + b) / 2;
	}

	public static void main(String[] args) {
		Study_정수사이의값더하기_다른사람 st = new Study_정수사이의값더하기_다른사람();
		System.out.println(st.solution(3, 5));
	}

}
