package programmers_String;

import java.util.Arrays;

public class String_김서방_다른사람 {
	public String solution(String[] seoul) {
		String answer = "";
		
		int num = Arrays.asList(seoul).indexOf("Kim");	// seoul 배열에 Kim인덱스를 찾아라(몇 번째)
		
		answer = "김서방은 " + num + "에 있다";
		return answer;
	}
	public static void main(String[] args) {
		String_김서방_다른사람 str = new String_김서방_다른사람();
		String[] arr = { "Jane", "Kim" };
		System.out.println(str.solution(arr));
	}

}
