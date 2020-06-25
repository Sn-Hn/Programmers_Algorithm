package programmers_Test;

public class Study_시저암호_다른사람 {
	String caesar(String s, int n) {
		String result = "";
		n = n % 26;			// 알파벳 26개 중 몇 번째를 출력! 공부하자..
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}

	public static void main(String[] args) {
		Study_시저암호_다른사람 c = new Study_시저암호_다른사람();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}

}
