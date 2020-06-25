package programmers_greedy_탐욕법;

public class Study_greedy_다른사람 {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n];
		int answer = n;

		for (int l : lost)		// 배열 for문 : lost의 값을 int형 변수 l에 하나씩 대입
			people[l - 1]--;	// people배열의 idx번호를 맞추기 위해 l-1 (즉, 1번 학생이 잃어버렸으면 people[0]를 --)
		for (int r : reserve)	// 배열 for문 : reserve의 값을 int형 변수 l에 하나씩 대입
			people[r - 1]++;	// people배열의 idx번호를 맞추기 위해 r-1 (즉, 1번 학생이 여벌을 가져왔으면 people[0]를 ++)

		for (int i = 0; i < people.length; i++) {
			if (people[i] == -1) {				// people배열 각각의 값이 -1이라면 잃어버린 학생이라는 조건문
				// (i - 1 >= 0) -> 2번 학생들부터 전 번호의 학생이 여벌을 가져왔으면!
				if (i - 1 >= 0 && people[i - 1] == 1) {		// (people[i - 1] == 1) -> 2번학생부터 여벌을 가져온 사람
					people[i]++;		// i번 학생은 빌릴 수 있으니 ++
					people[i - 1]--;	// i-1번 학생은 i번 학생에게 빌려줬으니 --
				} 
				// 1번학생부터 마지막 학생 전까지 && 다음 번호의 학생이 여벌을 가져왔으면!
				else if (i + 1 < people.length && people[i + 1] == 1) {
					people[i]++;		// i번 학생은 빌릴 수 있으니 ++
					people[i + 1]--;	// i+1번 학생은 i번 학생에게 빌려줬으니 --
				} else					// 그 외 모든 사람은 빌리지 못한 사람들이니
					answer--;			// 전체 수에서 한명씩 차감
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Study_greedy_다른사람 sg = new Study_greedy_다른사람();
		int n = 10;
		int[] lost = {3, 9, 10};
		int[] reserve = {3, 8, 9};
		System.out.println(sg.solution(n, lost, reserve));
//		sg.solution(n, lost, reserve);
	}

}
