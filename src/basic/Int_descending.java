package basic;

import java.util.ArrayList;


/*
함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

단, n은 1이상 8,000,000,000 이하인 자연수입니다.
*/
public class Int_descending {
	// 퀵정렬 중복을 제거하지 않음 따로 만들어줘야한다.
	public long solution(long n) {
		long answer = 0;
		String s = "" + n;
		int[] arr = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = Character.getNumericValue(s.charAt(i));
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		quickSort(arr, 0, arr.length-1);
		s = "";
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			s += arr[i];
		}
		System.out.println();
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	
	public static int partition(int arr[], int l, int r) {
		int pivot = arr[(l+r)/2];
		int temp;
		
		while(l < r) {
			while((arr[l] < pivot)) l++;
			while((arr[r] > pivot)) r--;
			
			if(l < r) {
				temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}			
		}	
		
		return l;
	}
	
	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivot = partition(arr, left, right);

			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}

	}
	
	public static void main(String[] args) {
		Int_descending id = new Int_descending();
		long n = 13542015;
		System.out.println(id.solution(n));
	}

}
