package programmers_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
// 배울점이 많다..
public class String_문자열정렬_다른사람 {
	/* 다른 사람 1 */
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			arr.add("" + strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(arr);
		answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length());
		}
		return answer;
	}
	/* 다른 사람 2 */
	public String[] solution1(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.charAt(n) > s2.charAt(n))
					return 1;
				else if (s1.charAt(n) == s2.charAt(n))
					return s1.compareTo(s2);
				else if (s1.charAt(n) < s2.charAt(n))
					return -1;
				else
					return 0;
			}
		});
		return strings;
	}

}
