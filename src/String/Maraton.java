package String;

public class Maraton {
	public String solution(String[]s, String[] c ) {
		String answer = "";
		boolean flag = false;
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < c.length; j++) {
				if(s[i].equals(c[j])) {
					c[j] = null;
					flag = false;
					break;
				}else {
					flag = true;
				}
				
			}
			if(flag) { 
				answer = s[i];
			}
			
		}
		
		
		
		return answer;
	}
	public static void main(String[] args) {
		Maraton ma = new Maraton();
		String[] arr1 = {"leo", "kiki", "eden", "leo"};
		String[] arr2 = {"kiki", "eden", "leo"};
		System.out.println(ma.solution(arr1, arr2));
	}

}
