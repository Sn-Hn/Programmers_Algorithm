package programmers_Test;

import java.util.ArrayList;

/*

배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

*/
public class Study_중복제거 {
	
	public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList();
//      al.add(arr[0]);					// 첫번째를 넣어줘도 됨	이것을 넣으려면 for문을 1부터 arr.length까지 돌려야함
        for(int i = 0; i < arr.length-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		al.add(arr[i]);
        	}
        }
        al.add(arr[arr.length-1]);		// 마지막은 들어가지 않으니 넣어줘야함
        answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++) {
        	answer[i] = al.get(i);
        	System.out.println(answer[i]);
        }
        

        return answer;
	}
	
	public static void main(String[] args) {
		Study_중복제거 st = new Study_중복제거();
		int[] arr = {3, 3, 4, 4, 5, 1, 1, 2, 2, 3, 3, 4};	// {3, 4, 5, 1, 2, 3}
		System.out.println(st.solution(arr));
	}

}
