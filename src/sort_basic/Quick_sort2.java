package sort_basic;
// 퀵정렬 중요!
public class Quick_sort2 {
	public static int partition(int arr[], int left, int right) {
		// 정렬되지 않은 배열 arr, 가장왼쪽 left, 가장 오른쪽 right
		int pivot = arr[(left + right) / 2];		// 중간 지점을 정해준다

		while (left < right) {		// left가 right보다 작을 때 while문 실행.. 
			// arr[left]값이 피봇보다 작고, left가 right보다 작으면(left와 right가 만나지 않았다면)
			// left를 ++(오른쪽으로 한칸)
			while ((arr[left] < pivot) && (left < right))
				left++;
			// arr[right]값이 피봇보다 크고, left가 right보다 작으면(left와 right가 만나지 않았다면)
			// right를 --(왼쪽으로 한칸)
			while ((arr[right] > pivot) && (left < right))
				right--;
			// arr[left]값이 피봇보다 크다면! 또, arr[right]값이 피봇보다 작다면!
			// while문을 나오게 됨 퀵정렬의 첫번째 순환은 
			// | 기준값보다 작은 값들  |  기준값(피봇)  | 기준값보다 큰 값들 |
			// 이렇게 정렬을 시켜야 하기 때문에 왼쪽에 피봇보다 큰 값들 혹은 오른쪽에 피봇보다 작은 값들이 있으면 서로 그 값을 교환!
			if (left < right) {	
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}					// left를 반환하는 이유는 퀵정렬이 1순환을 끝내고 나면
		return left;		// | 기준값보다 작은 값들 |  기준값(피봇)  | 기준값보다 큰 값들 |
							// 여기서 왼쪽의 마지막에 있거나 혹은 오른쪽의 첫번째에 있기 때문에
	}						// left를 반환하여 왼쪽의 끝으로 재귀호출, 오른쪽의 첫번째로 재귀호출을 하면 되기 떄문
	
	public static void quickSort(int arr[], int left, int right) {
		// left가 right보다 작다면 정렬이 끝나지 않은 상황이기 떄문
		if (left < right) {
			// 파티션 메소드를 호출했으니 | 기준값보다 작은 값들 |  기준값(피봇)  | 기준값보다 큰 값들 | 로 정렬됨
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);	// 재귀 호출를 통해 왼쪽에 있는 것들을 다시 정렬
			quickSort(arr, pivotNewIndex + 1, right);	// 재귀 호출을 통해 오른쪽에 있는 것들을 다시 정렬
		}

	}
	public static void main(String[] args) {
		int data[] = { 66, 10, 1, 34, 5, -10 };

//		Quick_sort2 quick = new Quick_sort2();
		quickSort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] : " + data[i]);
		}

	}

}
