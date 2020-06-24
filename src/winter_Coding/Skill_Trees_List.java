package winter_Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Skill_Trees_List {
	
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // Arrays.asList() - 배열을 리스트로 만들어 반환
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));		
        //ArrayList<String> skillTrees = new ArrayList<String>()
        /*
        public interface Iterator {		-> Iterator 인터페이스
        	boolean hasNext();			-> 읽어 올 요소가 남아 있는 지 확인 (true, false)
        	Object next();				-> 다음 요소를 읽어 옴
        	void remove();				-> next()로 읽어 온 요소 삭제
        }
		*/
        Iterator<String> it = skillTrees.iterator();
        while (it.hasNext()) {		// 읽어 올 요소가 있으면 반복
        	
        	// it.next().replaceAll() -> 다음 요소의 skill을 제외한 다른 것들을 공백("")으로 치환 
        	// skill.indexOf() -> 치환 한 후 skill의 인덱스 번호 
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {		//
                it.remove();		// 인덱스 번호가 0이 아니면 읽어 온 요소를 삭제
            }						// 인덱스 번호가 0이 되려면 it.next가 읽어온 요소가 skill의 순서와 같아야 함.
        }
        answer = skillTrees.size();
        return answer;
    }
	
	public static void main(String[] args) {
		Skill_Trees_List st = new Skill_Trees_List();
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		
		System.out.println(st.solution(skill, skill_trees));
	}

}
