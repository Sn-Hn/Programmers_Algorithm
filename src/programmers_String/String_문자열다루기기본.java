package programmers_String;
/*
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
solution을 완성하세요.
예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
*/
// ASCII코드로 0~9까지의 수는 48~57이다
public class String_문자열다루기기본 {
	public boolean solution(String s) {
	      boolean answer = true;
	      for(int i = 0; i < s.length(); i++) {
	    	  if(s.charAt(i) < 48 || s.charAt(i) > 57) {
	    		  answer = false;
	    		  break;
	    	  }
	      }
	      
	      
	      return answer;
	  }
	public static void main(String[] args) {
		String_문자열다루기기본 st = new String_문자열다루기기본();
		String s = "ab24";
		System.out.println(st.solution(s));
	}
}
