package greedy;

/*
 * 
조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

조이스틱을 각 방향으로 움직이면 아래와 같습니다.

▲ - 다음 알파벳
▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
▶ - 커서를 오른쪽으로 이동
예를 들어 아래의 방법으로 JAZ를 만들 수 있습니다.

- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
만들고자 하는 이름 name이 매개변수로 주어질 때, 
이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

name	return
JEROEN	56
JAN		23

*/

public class JoyStick {

	public int solution(String name) {
		int answer = 0;
		int result = 0;
		int st = ('Z'-'A')/2;			// Z-A = 35
		int a = 0;
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != 'A') {
				if(st < name.charAt(i) - 'A') {
					answer += ('Z'+1) - name.charAt(i);		// 방향키 아래
					
				}else {
					answer += name.charAt(i)-'A';	// 방향키 위
					
				}
				answer++;
				answer += a;
				a = 0;
			}else {
				a++;
				
			}
			
		}
		
		answer--;
		
		System.out.println("answer : " + answer);
		if(name.charAt(0) != 'A') {
			if(st < name.charAt(0) - 'A') {
				result += ('Z'+1) - name.charAt(0);		// 방향키 아래
			}else {
				result += name.charAt(0)-'A';	// 방향키 위
			}
		}
		result++;
		a = 0;
		for(int i = name.length()-1; i > 0; i--) {		
			if(name.charAt(i) != 'A') {
				if(st < name.charAt(i) - 'A') {
					result += ('Z'+1) - name.charAt(i);		// 방향키 아래	
				}else {
					result += name.charAt(i)-'A';	// 방향키 위
				}
				result++;			// 한칸 옆으로 가므로 ++
				result += a;
				a = 0;
			}else {
				a++;
			}
			
		}
		
		
		result--;		// 마지막일 때도 ++가 되므로 하나 --
		System.out.println("result : " + result);
		
		answer = answer <= result ? answer : result; 
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		JoyStick st = new JoyStick();
//		String name = "JEROEN";
//		String name = "JAN";
//		String name = "JAZ";
//		String name = "BBAAAAABBAAA";
		String name = "BBAABB";
		
		
		System.out.println(st.solution(name));
		
	}

}
