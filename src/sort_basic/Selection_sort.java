package sort_basic;

/*
선택정렬은 배열중에 가장 작은 원소들을 왼쪽부터 채워나가면서 숫자를 정렬하는 방법입니다.
최소원소를 찾은 후 
=> 최소원소를 맨 왼쪽원소와 교환(즉, 왼쪽부터 정렬된 원소로 채워집니다.)
=> 왼쪽원소를 제외하고 원소가 하나남을때 까지 이단계를 반복
*/
public class Selection_sort {
	public int[] sort(int[] arr) {
		int min, temp;		// min은 최소값을 담기 위한 변수, temp는 교환하기 위한 변수
		for(int i = 0; i < arr.length-1; i++ ) {	// i가 0부터 배열의 끝-1 까지 돈다
			min = i;								// min을 0으로 시작해 1씩 증가 시킴 arr[min]을 최소값으로 잡는것.
			for(int j = i+1; j < arr.length; j++) { // i+1부터 배열의 끝까지 돔
				if(arr[min] > arr[j]) {				// arr[0]이 arr[1]보다 크다면 (1회전)
					min = j;						// min(0) 에 j(1)을 넣음	  (1회전)
				}									// arr[0]이 arr[1]보다 작다면 arr[min]을 최소값으로 잡았으니
			}										// 변화 없이 for문 돌리면 됨
			temp = arr[min];						// min이 최소값으로 갱신되었으니 temp에 arr[min](최소값) 저장				
			arr[min] = arr[i];						// arr[min]에 arr[i]를 넣음
			arr[i] = temp;							// arr[min]과 arr[i]를 교환
			
		}
		
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 2, 1, 7, 12, 1341,1561, 15};
		Selection_sort ss = new Selection_sort();
		
		ss.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
