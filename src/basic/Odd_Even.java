package basic;

public class Odd_Even {
	// 삼항 연산자
	public String solution(int num) {
		String answer = "";
		
		answer = num%2 == 0 ? "Even" : "Odd";
		
		return answer;
	}
	public static void main(String[] args) {
		Odd_Even oe = new Odd_Even();
		System.out.println(oe.solution(10));
	}
}
