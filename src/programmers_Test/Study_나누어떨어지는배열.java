package programmers_Test;

import java.util.ArrayList;

public class Study_나누어떨어지는배열 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i : arr) {
			if(i%divisor==0) {
				al.add(i);
			}
		}
		al.sort(null);

		answer = new int[al.size()];
		if(answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			
			for(int i = 0; i < answer.length; i++) {
				answer[i] = al.get(i);
				
			}
		}

		
		
		return answer;
	}

	public static void main(String[] args) {
		Study_나누어떨어지는배열 st = new Study_나누어떨어지는배열();
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		st.solution(arr, divisor);
	}

}
