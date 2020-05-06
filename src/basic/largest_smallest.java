package basic;

/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
*/
public class largest_smallest {
	public int[] solution(int n, int m) {
		int[] answer = {};
		answer = new int[2];

		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
		answer[1] = n*m/answer[0];				// 최소공배수는 두 수의 곱을 최대공약수로 나누면 됨

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		largest_smallest ls = new largest_smallest();

		ls.solution(6, 9);
		ls.solution(10, 15);
	}

}
