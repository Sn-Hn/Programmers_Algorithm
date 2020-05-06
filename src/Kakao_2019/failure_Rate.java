package Kakao_2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 
그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 
원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 
역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 
오렐리를 위해 실패율을 구하는 코드를 완성하라.

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
*/

public class failure_Rate {

	public int[] solution(int n, int[] stages) {
		int[] answer = new int[n];
		double participant = stages.length;
		int[] cnt = new int[n];
		double[] rate = new double[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < participant; j++) {
				if (stages[j] == i + 1) {
					cnt[i]++;
				}
			}
		}
		HashMap hm = new HashMap();
		for (int i = 0; i < n; i++) {
			rate[i] = (double) (cnt[i] / participant);
			participant -= cnt[i];
			hm.put(i + 1, rate[i]);

		}
		Arrays.sort(rate);
		

		for (int i = 0; i < rate.length; i++) {
			answer[i] = (int) getKey(hm, rate[i]);
			hm.remove(answer[i], rate[i]);
		}

		for (int i = 0; i < rate.length; i++) {
			System.out.print(rate[i] + ", ");
			System.out.print(cnt[i] + " : ");
			System.out.println(i + 1);
		}
		System.out.println(hm);
		for (int i = 0; i < rate.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static Object getKey(HashMap m, Object value) {
		for (Object o : m.keySet()) {
			if (m.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		failure_Rate fr = new failure_Rate();
		int n = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
//		int n = 4;
//		int[] stages = {4, 4, 4, 4, 4}; 

		fr.solution(n, stages);

	}

}
