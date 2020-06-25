package programmers_sort;

import java.util.ArrayList;

public class Array_sort_라이브러리사용 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < commands.length; i++) {
//			for (int j = 0; j < commands[i].length; j++) {
//				System.out.print(commands[i][j]);
//			}
//			System.out.println();
//		}
		for (int k = 0; k < commands.length; k++) {
			al.clear();
			for (int i = commands[k][0] - 1; i <= commands[k][1] - 1; i++) {
				al.add(array[i]);
				al.sort(null);
			}
			System.out.println(al.get(commands[k][2] - 1));
			ans.add(al.get(commands[k][2]-1));
			
		}
		System.out.println("----------");
//		answer = new int[ans.size()];
		for(int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
			System.out.print(answer[i] + " ");
			
		}
		System.out.println();
		

		return answer;
	}

	public static void main(String[] args) {
		Array_sort_라이브러리사용 as = new Array_sort_라이브러리사용();
		int[] arr1 = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(as.solution(arr1, arr2));
//		as.solution(arr1, arr2);
		// {5, 6, 3}
	}

}
