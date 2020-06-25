package programmers_Hash;


/*
해시 X

수많은 마라톤 선수들이 마라톤에 참여하였습니다.
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

단, 동명이인이 있음
mislav는 참여자 명단에는 두 명이 있지만,
완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*/

public class Marton {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden", "leo"};
		String[] completion = {"leo", "kiki", "eden"};
		String answer = "";
		boolean flag;
		
		for(int i = 0; i < participant.length; i++) {
			flag = true;

			for(int j = 0; j < completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					System.out.println(participant[i] + "님은 완주하셨습니다.");
					completion[j] = null;
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(participant[i] + "님은 완주하지 못하셨습니다.");
				answer = participant[i];
			}
			System.out.println(answer);
		}
		
	}

}

/*

 String answer = "";
        boolean flag;
        for(int i =0; i < participant.length; i++) {
            flag = true;
            for(int j = 0; j < completion.length; j++) {
               if(participant[i].equals(completion[j])) {
                    completion[j] = null;
                    flag = false;
                    break;
               }
            }
            if(flag) {
                answer = participant[i];
            }
        }
    
        return answer;

*/