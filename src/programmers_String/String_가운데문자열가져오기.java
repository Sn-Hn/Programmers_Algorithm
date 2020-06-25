package programmers_String;

public class String_가운데문자열가져오기 {
	public static void main(String[] args) {
		String s = "abcd";
		String answer = "";
		
		int length = s.length()/2;
		
		if(s.length()%2 == 1) {
			answer = s.substring(length, length+1);
		}else if(s.length()%2 == 0) {
			answer = s.substring(length-1, length+1);
		}
	}

}
