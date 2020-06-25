package programmers_sort;

import java.util.Arrays;

public class Array_sort_다른사람 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];		// answer 배열은 commands의 행 길이만큼 나올 수 밖에 없으니깐 ...
														// 생각..
        for(int i=0; i<commands.length; i++){
        	// copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);		// 정렬
            answer[i] = temp[commands[i][2]-1];
            System.out.println(answer[i]);
        }
        
        return answer;
	}
	
	
	public static void main(String[] args) {
		Array_sort_다른사람 as = new Array_sort_다른사람();
		int[] arr1 = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(as.solution(arr1, arr2));
//		as.solution(arr1, arr2);
	}

}
