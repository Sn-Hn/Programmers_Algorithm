package bruthForceSearch_완전탐색;

import java.util.ArrayList;
import java.util.TreeSet;

/*
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

numbers	return
17	3
011	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
*/

public class PrimeNumber {

	private int count;
	private TreeSet<String> set = new TreeSet<>();

	public int solution(String numbers) {

		int size = numbers.length();

		// 리스트에 담아줌
		ArrayList<Character> arr = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arr.add(numbers.charAt(i));
		}

		// 결과를 저장할 리스트
		ArrayList<Character> result = new ArrayList<>();

		// nPr에서 r을 계속 늘리면서 순열 알고리즘 수행
		for (int i = 0; i < size; i++) {
			permutation(arr, result, size, i + 1);
		}

		return count;
	}

	public static boolean primeNumber(int n) {
		int i;
		int sqrt = (int) Math.sqrt(n);

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수와 1은 소수가 아님
		if (n % 2 == 0 || n == 1)
			return false;

		// 제곱근까지만 홀수로 나눠보면 됨
		for (i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public void permutation(ArrayList<Character> arr, ArrayList<Character> result, int n, int r) {
		if (r == 0) {

			// 0으로 시작하는 부분집합은 제외
			if (result.get(0) != '0') {

				String str = "";
				int size = result.size();
				for (int i = 0; i < size; i++) {
					str += result.get(i);
				}

				int num = 0;

				// 이미 나온 숫자 조합이 아닐 경우
				if (!set.contains(str)) {
					num = Integer.parseInt(str);
					set.add(str);

					// 소수 판별
					if (primeNumber(num)) {
						System.out.println(num);
						count++;
					}
				}
			}

			return;
		}

		for (int i = 0; i < n; i++) {

			result.add(arr.remove(i));
			permutation(arr, result, n - 1, r - 1);		// 재귀함수 호출
			arr.add(i, result.remove(result.size() - 1));		// result 배열 끝에 있는 인덱스를 지우면서 arr 배열 i 인덱스에 추가
		}

	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
//		String numbers = "17"; // return : 3
		String numbers = "011112";

		System.out.println(pn.solution(numbers));

	}

}
