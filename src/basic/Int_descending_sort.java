package basic;

import java.util.ArrayList;

public class Int_descending_sort {
	String res = "";
	public long solution(long n) { 
		long answer = 0;
		String s = "" + n;
		ArrayList al = new ArrayList();
		
		for(int i = 0; i < s.length(); i++ ) {
			al.add(s.charAt(i));
		}
		al.sort(null);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < al.size(); i++) {
			sb.append(al.get(i));
		}
		sb.reverse();
		s = sb.toString();
		answer = Long.parseLong(s);
		
		
		return answer;
	}
	/* 다른사람의 풀이법 */
	public long solution1(long n){
    	// 라이브러리 중요!
    	
        res = "";
        Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Long.parseLong(res);
    }
	public static void main(String[] args) {
		Int_descending_sort id = new Int_descending_sort();
		long n = 13542015153153L;
		System.out.println(id.solution(n));
	}
}
