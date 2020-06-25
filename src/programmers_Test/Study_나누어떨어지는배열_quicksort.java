package programmers_Test;

import java.util.ArrayList;

public class Study_나누어떨어지는배열_quicksort {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i : arr) {
			if(i%divisor==0) {
				al.add(i);
			}
		}
		answer = new int[al.size()];
		if(answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			
			for(int i = 0; i < answer.length; i++) {
				answer[i] = al.get(i);
			}
		}
		sort(answer, 0, answer.length-1);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		
		return answer;
	}
	public void sort(int[] answer, int l, int r) {
		int left = l;
		int right = r;
		int pivot = answer[(l+r)/2];
		
		while(left < right) {
			while((answer[left] < pivot)) left++;
			while((answer[right] > pivot)) right--;
			
			if(left <= right) {
				int temp = answer[left];
				answer[left] = answer[right];
				answer[right] = temp;
				left++;
				right--;	
			}
			
		}
		// 재귀
		if(l < right) {
			sort(answer, l, right);	
		}
		if (r > left) {
			sort(answer, left, r);
		}
	}
	
	public static void main(String[] args) {
		Study_나누어떨어지는배열_quicksort st = new Study_나누어떨어지는배열_quicksort();
		int[] arr = {5, 9, 7, 10, 50, 30, 32, 45, 75, 20};
		int divisor = 5;
		st.solution(arr, divisor);
	}

}
