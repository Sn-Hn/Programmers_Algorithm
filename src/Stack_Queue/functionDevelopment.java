package Stack_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 
각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
*/

public class functionDevelopment {
	
	// 다른 사람이 푼 예제
	public int[] solution1(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
	
	
	

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		Queue<Integer> que = new LinkedList<Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < progresses.length; i++) {
			
			if((100-progresses[i])%speeds[i] == 0) {
				que.add((100-progresses[i])/speeds[i]);
			}else {
				que.add((100-progresses[i])/speeds[i]+1);
			}
			
		}
		
		int standard = que.poll();
		int cnt = 1;
		while(!que.isEmpty()) {
			int poll = que.poll();
			if(standard >= poll) {
				cnt++;
			}else {
				list.add(cnt);
				cnt = 1;
				standard = poll;
			}
			
		}
		list.add(cnt);
		
		answer = new int[list.size()];
		for(int j = 0; j < list.size(); j++) {
			answer[j] = list.get(j);
		}
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};	// return [2, 1]
		functionDevelopment fd = new functionDevelopment();
		int[] answer = fd.solution(progresses, speeds);	
		
	}
}
