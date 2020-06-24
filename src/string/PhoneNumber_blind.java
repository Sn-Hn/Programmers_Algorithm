package string;
// 끝 4자리만 빼고 *로 바꿔라
public class PhoneNumber_blind {
	public String solution(String p) {
		String answer = "";
		for (int i = 0; i < p.length() - 4; i++) {
			answer += "*";
		}
		for (int i = p.length() - 4; i < p.length(); i++) {
			answer += p.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		PhoneNumber_blind pnb = new PhoneNumber_blind();
		String p = "01099535444";
		System.out.println(pnb.solution(p));
	}

}
