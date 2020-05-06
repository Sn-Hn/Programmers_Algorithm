package basic;

import java.util.Arrays;

public class arr_avg {
	public double solution(int[] arr) {
		double answer = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = sum / arr.length;
		return answer;
	}
	/* 다른 사람 풀이 */
	public double getMean(int[] array) {
		// stream : 컬렉션, 배열등의 저장 요소를 하나씩 참조하며 함수형 인터페이스(람다식)를 적용하며 반복적으로 처리할 수 있도록 해주는 기능
        return Arrays.stream(array).average().orElse(0);	// 8부터 추가된 라이브러리
    }
	
	public static void main(String[] args) {
		arr_avg aa = new arr_avg();
		int[] arr = {1, 2, 3, 4};
		
		System.out.println(aa.getMean(arr));
	}

}
