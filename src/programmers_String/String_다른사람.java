package programmers_String;

public class String_다른사람 {
	
	public String StringExercise(String s) {
		// s가 홀수/짝수로 나뉨 -> 홀수는 가운데 하나, 짝수는 가운데 두개
		// s.length() => 5  /2 =>  2 (s.length()-1)/2 => 4 /2 => 2 substring(2,3) ((s.length()-1)/2, s.length()/2+1)
		// s.length() => 4  /2 =>  2 (s.length()-1)/2 => 3 /2 => 1 substirng(1,3) ((s.length()-1)/2, s.length()/2+1)
		return s.substring((s.length()-1)/2, s.length()/2+1);
	}
	// 확인을 위한 main문
	public static void main(String[] args) {
		String_다른사람 se = new String_다른사람();
		System.out.println(se.StringExercise("power"));
		System.out.println(se.StringExercise("shin"));
		
	}

}
