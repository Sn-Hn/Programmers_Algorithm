package programmers_greedy_탐욕법;
/*

점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
학생들의 번호는 체격 순으로 매겨져 있어,
바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

*/
public class Study_greedy {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		answer = n - lost.length;
		// * 조건 *
		// 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 
		// 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
		// 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
		// 코딩 테스트 볼 때 조건도 꼭 중요시하게 볼 것!!
		for(int i = 0; i < lost.length; i++) { 				// 잃어버린 사람 중
			for(int j = 0; j < reserve.length; j++) {		// 여벌을 갖고 온 사람을 찾기 위한 이중 for문
				if(lost[i] == reserve[j]) {					// 잃어버린 사람과 여벌을 갖고 온 사람이 같다면 자기 것을 입으면 됨
					answer++;								// 체육 수업을 들을 수 있는 사람 +1
					lost[i] = -1;							// 잃어버린 사람이 여벌을 가지고 왔으므로
					reserve[j] = -10;						// 잃어버린 사람의 번호와 여벌을 갖고 온 사람의 번호를 
					System.out.println(answer + "하");		// 알 수 없는 값으로 줌
					break;									// 나감
				}
			}
		}
		for(int i = 0; i < reserve.length; i++) {			// 잃어버린 사람에게 여벌옷을 빌려주기 위한 이중 for문
			for(int j = 0; j < lost.length; j++) {
				// 여벌을 가지고 온 사람의 앞 뒤 사람한테만 줄 수 있으므로 +1, -1 한 값이 잃어버린 사람의 번호와 일치하는지 확인하는 조건문
				if((reserve[i]+1) == lost[j] || (reserve[i]-1) == lost[j]) {
					answer ++;								// 여벌을 빌려줄 수 있다면 수업을 들을 수 있는 사람 +1
					lost[j] = -1;							// 여벌을 빌렸으니 잃어버린 사람의 번호를 알 수 없는 값으로 줌
					System.out.println(answer + " 뭐야");	// 이유는 2번이 1번한테 여벌을 빌렸는데 그대로 놔둔다면 
					System.out.println(lost[j]);			// 3번이 2번에게 또 여벌을 빌려주기 때문
					break;									// 나감
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {	// 확인을 위한 main문
		Study_greedy sg = new Study_greedy();
		int n = 10;
		int[] lost = {3, 9, 10};
		int[] reserve = {3, 8, 9};
		System.out.println(sg.solution(n, lost, reserve));
//		sg.solution(n, lost, reserve);
	}

}
