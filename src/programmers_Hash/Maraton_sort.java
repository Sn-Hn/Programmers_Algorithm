package programmers_Hash;

import java.util.Arrays;
// sort 정렬을 이용한 방법

public class Maraton_sort {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden", "maria", "maria", "als", "qwe"};
		String[] completion = {"leo", "kiki", "eden", "maria", "als", "qwe"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer = "";
		int i;
		
		for(i = 0; i < completion.length; i++) {
//			System.out.println(participant[i]);
			
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}
		
		answer = participant[i];
		System.out.println(answer + "완주 X");
	}

}
