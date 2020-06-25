package programmers_String;

public class String_이상한문자만들기_다른사람 {

	public String solution(String s) {

		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}

	public static void main(String[] args) {
		String_이상한문자만들기_다른사람 st = new String_이상한문자만들기_다른사람();
		String s = "TRY HELLO WORLD";
		System.out.println(st.solution(s));
	}

}
