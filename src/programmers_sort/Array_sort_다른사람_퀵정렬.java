package programmers_sort;

public class Array_sort_다른사람_퀵정렬 {
	public int[] solution(int[] array, int[][] commands) {
		int n = 0;
		int[] ret = new int[commands.length];

		while (n < commands.length) {
			int m = commands[n][1] - commands[n][0] + 1;

			if (m == 1) {
				ret[n] = array[commands[n++][0] - 1];
				continue;
			}

			int[] a = new int[m];
			int j = 0;
			for (int i = commands[n][0] - 1; i < commands[n][1]; i++)
				a[j++] = array[i];

			sort(a, 0, m - 1);

			ret[n] = a[commands[n++][2] - 1];
		}

		return ret;
	}

	void sort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr) {
				int temp = a[pl];
				a[pl] = a[pr];
				a[pr] = temp;
				pl++;
				pr--;
			}
		} while (pl <= pr);

		if (left < pr)
			sort(a, left, pr);
		if (right > pl)
			sort(a, pl, right);
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
