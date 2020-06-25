package programmers_String;
/*
대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

*/
public class String_py개수 {
	
	public boolean solution(String s) {
		boolean answer = true;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(String.valueOf(s.charAt(i)).equals("p") || String.valueOf(s.charAt(i)).equals("P")) {
				count++;
			}else if(String.valueOf(s.charAt(i)).equals("y") || String.valueOf(s.charAt(i)).equals("Y")) {
				count--;
			}
		}
		if(count == 0) answer = true;
		else answer = false;
		return answer;
	}
	
	public static void main(String[] args) {
		String_py개수 st = new String_py개수();
		String s = "pyyy";
		System.out.println(st.solution(s));
	}

}
