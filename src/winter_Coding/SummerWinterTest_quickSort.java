package winter_Coding;
/*
S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다.
그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.

물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.

부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

     d		  budget  result
[1,3,2,5,4]		9		3
[2,2,3,3]		10		4

*/
// 중복값 없을때 가능.... 
public class SummerWinterTest_quickSort {
	public int solution(int[] d, int budget) {
		int answer = 0;
		quickSort(d, 0, d.length-1);
		
		for(int i = 0; i < d.length; i++) {
			budget -= d[i];
			if(budget >= 0) {
				answer ++;
			}else break;
		}
		
		return answer;
	}
	
	static public void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
				
		}
		
	}
	
	static public int partition(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int pivot = arr[(l+r)/2];
		
		while(l < r) {
			if((arr[l] < pivot) && (l < r)) l++;
			if((arr[r] > pivot) && (l < r)) r--;
			
			if(l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		
		return l;
		
	}
	
	
	public static void main(String[] args) {
		SummerWinterTest_quickSort sw = new SummerWinterTest_quickSort();
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		System.out.println(sw.solution(d, budget));
	}

}
