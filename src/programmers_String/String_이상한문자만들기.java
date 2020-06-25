package programmers_String;
/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로,
홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
*/
public class String_이상한문자만들기 {
	public String solution(String s) {
		String answer = "";
		String[] st = s.split(" ", -1);			// -1을 넣어주지 않으면 공백들이 다 사라짐
		char ch;								// 따라서 " ab abc " -> " Ab AbC " 가 되어야하는데
												// "Ab AbC"가 되버리므로 오류
		for(int i = 0; i < st.length; i++) {
			for(int j = 0; j <st[i].length(); j++) {
				ch = st[i].charAt(j);
				if(ch >= 65 && ch <= 90) {		// 대문자일 경우
					if(j%2==0) answer += ch;
					else {
						ch += 32;
						answer += ch;
					}
				}else if(ch >= 97 && ch <= 122) {	// 소문자일 경우
					if(j%2==0) {
						ch -= 32;
						answer += ch;
					}else answer += ch;
				}
			}
			if(i < st.length-1) answer += " ";
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String_이상한문자만들기 st = new String_이상한문자만들기();
		String s = "TRY HELLO WORLD";
		System.out.println(st.solution(s));
	}
}
