package Winter_Coding;

import java.util.ArrayList;

/*
선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.

예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 
라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.

위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 
따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 
썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.

선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 
가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.

스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
스킬 순서와 스킬트리는 문자열로 표기합니다.
예를 들어, C → B → D 라면 CBD로 표기합니다
선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
skill_trees는 길이 1 이상 20 이하인 배열입니다.
skill_trees의 원소는 스킬을 나타내는 문자열입니다.
skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다

skill		skill_trees						return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	  2

*/

public class skill_Trees {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String str = "";
        int index = 0;
        
        for(int i = 0; i < skill_trees.length; i++) {		// 스킬트리가 들어있는 배열의 수만큼 반복
        	str = skill_trees[i];
        	boolean flag = true;
        	int skillIndex = 0;			// skill은 무조건 0번 인덱스의 스킬을 배워야만 다음 스킬을 배울 수 있기 때문에  skillIndex = 0 으로 시작
        	for(int j = 0; j < str.length(); j++) {		// str의 크기만큼 반복
        		index = skill.indexOf(str.charAt(j));	// str의 j번째 문자 -> skill의 인덱스 번호 -> index
//        		System.out.println("str : " + str + " index : " + index + " nextIndex : " + nextIndex);
        		if(skillIndex < index) {		// skill의 인덱스가 아닌 문자는 -1이 리턴되고, skill의 인덱스인 경우 0 부터 skill.length만큼의 수가 나온다.
        			flag = false;			// 즉, skill의 인덱스가 아닌 문자는 넘겨버린다.
        			break;
        		}else if(skillIndex == index) {	// skillIndex와 같다면
        			skillIndex++;				// skill의 인덱스를 검사했으니 다음 인덱스를 검사하기 위해 ++를 한다.
        		}							
        		
        	}
        	if(flag ) {
        		answer++;
        	}
        	
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		skill_Trees st = new skill_Trees();
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		
		
		System.out.println(st.solution(skill, skill_trees));
		
		
		
	}

}
