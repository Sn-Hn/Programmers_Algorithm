package programmers_Test;
/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다.
z는 1만큼 밀면 a가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수,
solution을 완성해 보세요.

*/

public class Study_시저암호 {
	public String solution(String s, int n) {
		String answer = "";
		char[] ch = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if(ch[i] >= 65 && ch[i] <= 90) {
				if(ch[i]+n > 90) {
					ch[i]+=n;
					ch[i]-=26;
					answer += ch[i];
				} else {
					ch[i] += n;
					answer += ch[i];
				}
				
			}else if(ch[i] >= 97 && ch[i] <= 122) {
				if(ch[i]+n > 122) {
					ch[i]+=n;
					ch[i]-=26;
					answer += ch[i];
				}else {
					ch[i] += n;
					answer += ch[i];
				}
			}else if(ch[i] == 32) {
				answer += ch[i];
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Study_시저암호 st = new Study_시저암호();
		String s = "a b Z";
		int n = 1;
		System.out.println(st.solution(s, n));
	}

}
