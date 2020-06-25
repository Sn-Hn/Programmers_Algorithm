package programmers_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/*
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다
*/
public class String_문자열정렬 {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		String temp;
		Arrays.sort(strings);		// 미리 정렬을 시켜놓음
		// 문자열의 n번째 문자를 통해 버블정렬!
		for(int j = 0; j < strings.length; j++) {		
			for(int i = 0; i < strings.length-1; i++) {
				if(strings[i].charAt(n) > strings[i+1].charAt(n)) {
					temp = strings[i];
					strings[i] = strings[i+1];
					strings[i+1] = temp;
				}
			}
			
		}
		answer = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			answer[i] = strings[i];
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String_문자열정렬 st = new String_문자열정렬();
		String[] str = {"sun", "bed", "car"};
		int n = 1;
		st.solution(str, n);
	}

}
