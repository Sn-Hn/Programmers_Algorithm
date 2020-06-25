package programmers_String;

public class String_수박수박 {
	public static void main(String[] args) {
		int n = 3;
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				answer += "수";
			}else if(i%2 == 1) {
				answer += "박";
			}
			 
		}
		System.out.println(answer);
		
		
	}

}
