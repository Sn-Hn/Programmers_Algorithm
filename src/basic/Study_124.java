package basic;

/*
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
1, 2, 3,  4,  5,  6,  7,  8,  9, 10, 11, 12,  13,  14,  15,  16,  17,  18,  19,  20,  21,  22, ...		-> 10 진법
1, 2, 4, 11, 12, 14, 21, 22, 24, 41, 42, 44, 111, 112, 114, 121, 122, 124, 141, 142, 144, 211, ...		-> 124 진법(?)
*/

public class Study_124 {
	public String solution(int n) {
		String answer = "";
		int num = 0;
		
		while(n > 0) {
			num = n%3;
			n/=3;
			if(num==0) {
				num = 4;
				n -=1;
			}
			
			answer = num + answer;
			
		}
			
	
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Study_124 st = new Study_124();
		int n = 20;			// answer --> 41
		
		System.out.println(st.solution(n));	
	}
}
