package sort_basic;

public class Insertion_sort {
	// 삽입정렬은 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식
	public int[] sort(int[] arr) {
		int temp;
		int j = 0;
		for(int i = 1; i < arr.length; i++) {		// arr[0]부터 정렬되어 있다고 생각!
			temp = arr[i];							// arr[1]을 temp에 임시 저장
			// j는 i의 위치에서(j = i-1) 한칸씩 내려가며(j--) 자신의 위치를 찾기 위함
			for(j = i-1; j >= 0 && temp < arr[j]; j--) {	// j는 index위치이기 때문에 0보다 클때만 반복문이 돌아야 하고
															// temp가 arr[j]보다 작을 때 위치를 바꿔주면 됨
				arr[j+1] = arr[j];							// temp가 arr[j]보다 작기 때문에 arr[j+1]에 arr[j]를 넣음
			}												// arr[1]이 arr[0]보다 작으면 arr[1]에 arr[0]을 넣음
			arr[j+1] = temp;					// 임시 저장된 temp값을 arr[j+1]에 넣음
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 2, 1, 7, 12, 1341,1561, 15};
		Insertion_sort is = new Insertion_sort();
		
		is.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
