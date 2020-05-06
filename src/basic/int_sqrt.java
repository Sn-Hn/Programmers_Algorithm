package basic;
/*
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
*/

public class int_sqrt {
	public long solution(long n) {
		long answer = 0;
		boolean flag = true;
		for(long i = 0; i*i <= n; i++) {
			if(i*i == n) {
				answer += (i+1)*(i+1);
				flag = false;
				break;
			}else flag = true;
			
		}
		if(flag) return -1;


		return answer;
	}
	/* 다른사람의 풀이법 */
	public long solution1(long n) {		
	      if (Math.pow((int)Math.sqrt(n), 2) == n) {
	            return (long) Math.pow(Math.sqrt(n) + 1, 2);
	        }

	        return -1;
	  }
	
	public static void main(String[] args) {
		int_sqrt is = new int_sqrt();
		long n = 168L;
		System.out.println(is.solution(n));
		
	}

}
