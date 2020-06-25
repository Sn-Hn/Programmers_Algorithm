package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330

*/

public class MaxNumber {
	public String solution(int[] numbers) {
		String answer = "";
		int len = numbers.length;
		String[] num = new String[len];
		for (int i = 0; i < len; i++) {
			num[i] = Integer.toString(numbers[i]);

		}
		// 람다식 (매개변수) -> 함수
		// (o1, o2)를 인자로 받아 compareTo 메소드 실행
//		Arrays.sort(num, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
		Arrays.sort(num, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				// 기준값.compareTo(비교대상) -> 동일 하면 0, 기준 값이 비교 대상보다 작으면 -1, 기준 값이 비교 대상보다 큰 경우 1
				return (s2 + s1).compareTo(s1 + s2);

			}

		});
		for (int i = 0; i < len; i++) {
			answer += num[i];
		}
		System.out.println(answer);
		return answer;
	}

	// 다른 사람 풀이
	public String solution1(int[] numbers) {
		String answer = "";

		List<Integer> list = new ArrayList<>(); // list형 배열 선언
		for (int i = 0; i < numbers.length; i++) { // list에 numbers 삽입
			list.add(numbers[i]);
		}
		// Collections 정렬은 사용자 지정 정렬 방식을 사용할 수 있음 (람다식을 이용)
		Collections.sort(list, (a, b) -> { 		// (a, b)를 매개변수로 받아 함수 로 보냄
			// 문자열 as 에 a, 문자열 bs에 b를 대입
			String as = String.valueOf(a), bs = String.valueOf(b);
			
			// Integer형으로 변환하여 compare 수행 -> 문자열 (as+bs)와 (bs+as)를 Integer형으로 변환하여 비교하여 리턴
			// 리턴값에 - 를 준 이유는 내림차순으로 정렬하기 위함
			// 기준값이 비교값과 자리가 바뀌었다면 - 를 쓰지 않아도 됨
//			return Integer.compare(Integer.parseInt(bs + as), Integer.parseInt(as + bs));
			return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
			
		});
		StringBuilder sb = new StringBuilder();
		for (Integer i : list) {
			sb.append(i);
		}
		answer = sb.toString();
		if (answer.charAt(0) == '0') {
			return "0";
		} else {
			return answer;
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 129, 2, 121, 11 };

		System.out.println(new MaxNumber().solution1(numbers));

	}
}
