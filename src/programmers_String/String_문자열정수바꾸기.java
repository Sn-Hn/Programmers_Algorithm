package programmers_String;
/*

문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

*/
public class String_문자열정수바꾸기 {
	public int solution(String s) {
		int answer = 0;
		int re = 0;
		boolean flag = false;
//		answer = Integer.parseInt(s);		// 함수 사용
		
		if(s.charAt(0) == '-' || s.charAt(0) == '+') {
			for(int i = 1; i < s.length(); i++) {
//				char형은 ASCII코드로 받기 때문에 0~9 : 48~57이다 따라서 (int)char 값에 -48을 해줌
//				answer += ((int)s.charAt(i)-48) * (int)Math.pow(10, s.length()-i-1);
//				Character.getNumericValue(char c)는 char형 변수 c의 int값을 불러옴
				answer += Character.getNumericValue(s.charAt(i)) * (int)Math.pow(10, s.length()-i-1);
			}
			if(s.charAt(0) == '-') flag = true;		// 첫번째 자리에 -가 들어있으면 flag = true
		}else {
			for(int i = 0; i < s.length(); i++) {
//				answer += ((int)s.charAt(i)-48) * (int)Math.pow(10, s.length()-i-1);
				answer += Character.getNumericValue(s.charAt(i)) * (int)Math.pow(10, s.length()-i-1);
			}
		}
		if(flag) {
			answer *= -1;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String s = "-1234";
		String_문자열정수바꾸기 st = new String_문자열정수바꾸기();
		System.out.println(st.solution(s));
	}

}
