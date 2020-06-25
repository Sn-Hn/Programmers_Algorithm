package sort_basic;

// sort, partition 함수 두개가 필요
// 재귀
public class Quick_sort {
	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

	public static void main(String[] args) {
		int data[] = { 66, 10, 1, 34, 5, -10 };

		Quick_sort quick = new Quick_sort();
		quick.sort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] : " + data[i]);
		}

	}

}