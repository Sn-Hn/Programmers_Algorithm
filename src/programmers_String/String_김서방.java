package programmers_String;

public class String_김서방 {
	public String solution(String[] seoul) {
		String answer = "";
		int num = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				num = i;
			}
		}
		answer = "김서방은 " + num + "에 있다.";
		return answer;
	}

	public static void main(String[] args) {
		String_김서방 str = new String_김서방();
		String[] arr = { "Jane", "Kim" };
		System.out.println(str.solution(arr));
	}

}
