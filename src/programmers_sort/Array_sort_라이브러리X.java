package programmers_sort;

import java.util.ArrayList;

public class Array_sort_라이브러리X {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] a = {};
		
		for (int k = 0; k < commands.length; k++) {
			int j = 0;
			a = new int[commands[k][1]-commands[k][0]+1];
			for (int i = commands[k][0] - 1; i <= commands[k][1] - 1; i++) {
				a[j++] = array[i];
				sort(a);
			}		
		}
		System.out.println("----------");
		
//		answer = new int[ans.size()];
		
		
		
		return answer;
	}
	
	public int[] sort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length-1; i ++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}
		
		return arr;
	}
	public static void main(String[] args) {
		Array_sort_라이브러리X as = new Array_sort_라이브러리X();
		int[] arr1 = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(as.solution(arr1, arr2));
//		as.solution(arr1, arr2);
	}

}
