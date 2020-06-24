package kakao_2018;

import java.util.ArrayList;

/*

다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

*/

public class DartGame {
	public int solution(String d) {
		int answer = 0;
		int score[] = new int[3];
		int cnt = -1;				// 배열의 인덱스 기준은 0이기 때문에 
									// 숫자가 들어온다면 cnt++ 시켜 0이 됨 --> 실질적으로 숫자 1개
		for(int i = 0; i < d.length(); i++) {
			if(d.charAt(i) >= '0' && d.charAt(i) <= '9') {
				cnt++;
				if(d.charAt(i) == '1' && d.charAt(i+1) == '0') {
					i++;						// i++ 해주는 이유는 10이 나왔을 경우 i값이 2증가하기 때문에 i를 1증가시킨다 나머지 1은 for문에서 돌기 때문!
					score[cnt] = 10;
				}else {
					score[cnt] = Character.getNumericValue(d.charAt(i));	// 라이브러리 이용
//					score[cnt] = d.charAt(i) - '0';						// char 형은 ASCII코드로 읽기 때문에 0을 빼줘야 수가 나온다
				}
			}else if(d.charAt(i) == 'D') {
				score[cnt] *= score[cnt];
			}else if(d.charAt(i) == 'T') {
				score[cnt] *= score[cnt] * score[cnt];
			}else if(d.charAt(i) == '*') {
				if(cnt == 0) {
					score[cnt] *= 2;
				}else {
					score[cnt-1] *= 2;
					score[cnt] *= 2;
				}
			}else if(d.charAt(i) == '#') {
				score[cnt] *= -1;
			}
		}
		for(int i = 0; i < score.length; i++) {
			answer += score[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		DartGame d = new DartGame();
		String s = "1S2D*3T";
		System.out.println(d.solution(s));
	}

}
