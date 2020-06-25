package programmers_Hash;

import java.util.HashMap;
import java.util.Map;


// 해시를 이용한 방법
public class Maraton_Hash {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden", "leo"};
		String[] completion = {"leo", "kiki", "eden"};
		String answer = "";
		int count = 0;
		
		HashMap <String, Integer> hm = new HashMap<>();
		
		// 배열에 이용되는 for문		participant의 변수들을 part에 처음부터 하나씩 넣어준다
		for(String part : participant) {	// 첫번째에 part에 "leo"가 들어감, 두번쨰엔 "kiki"가 들어감
											// hm.get(part)는 part라는 key값을 찾아 value 호출
			if(hm.get(part) == null) {		// 해시맵에 part인 "leo"를 찾아 value가 null이라면
				hm.put(part, 1);			// 해시맵 key에 part, value에 1을 넣음
			}else {							// key값이 part가 있다면
				count = hm.get(part) + 1;	// count에 value값을 1더해줌
				hm.put(part, count);		// 그러고 다시 key에 part, value에 count를 넣음
			}								// 이유는 동명이인이 있을 수 있으니 동명이인이 있는 경우 value값을 2를 넣어줌
		}									// 동명이인이 없다면 HashMap에 value값은 모두 1
		
		for(String comp : completion) {		// completion의 변수들을 comp에 차례대로 넣어줌
			count = hm.get(comp) - 1;		// HashMap의 key값에서 comp를 찾아 value값에서 1뺀 값을 count에 넣어줌 
			hm.put(comp, count);			// key값에 comp, value값에 count 넣어줌
											// 동명이인이 있다면 value값은 0이 되고 동명이인이 있다면 value값은 1이 된다.
		}									// 따라서 완주를 하지 못한 사람은 value가 1인 사람을 찾으면 된다
		
		for(String key : hm.keySet()) {				// String key에 해시맵 key값들을 하나씩 넣음
			if(hm.get(key) == 1) answer = key;		// 이 key값의 value값이 1이면 answer에 key를 넣음
			
		}
		
		
		System.out.println(answer);
		
	}

}
