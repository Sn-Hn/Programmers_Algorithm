package programmers_String;

public class String_문자열다루기기본_exception {
	public boolean solution(String s) {
		// 예외처리를 이용한 방법
		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s); // 문자열 s를 Integer형으로 바꾸어 에러가 안나면 true
				return true;
			} catch (NumberFormatException e) { // 에러가 나면 false
				return false;
			}
		} else
			return false;
	}

	public static void main(String[] args) {
		String_문자열다루기기본 st = new String_문자열다루기기본();
		String s = "4424";
		System.out.println(st.solution(s));
	}
}
