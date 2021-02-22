package lv3;

public class 풍선터뜨리기 {
	private static int solution(int[] a) {
		int answer = 2; // 처음과 끝은 무조건 남길 수 있다. 찬스를 이용해서
		int l = a[0], r = a[a.length - 1];
		for (int i = 1; i < a.length - 1; i++) { // 가운데 풍선을 걸러낸다.
			if (l > a[i]) {
				l = a[i];
				answer++;
			}
			if (r > a[a.length - 1 - i]) {
				r = a[a.length - 1 - i];
				answer++;
			}
		}
		return l == r ? answer - 1 : answer; // l과 r이 같으면 중복 발생
	}

	public static void main(String[] args) {
//		int a[] = {9, -1, -5};
		int a[] = { -16, 27, 65, -2, 58, -92, -71, -68, -61, -33 };

		System.out.println(solution(a));
	}
}
