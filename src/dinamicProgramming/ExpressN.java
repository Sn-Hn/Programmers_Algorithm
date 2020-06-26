package dinamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*

아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.

12 = 5 + 5 + (5 / 5) + (5 / 5)
12 = 55 / 5 + 5 / 5
12 = (55 + 5) / 5

5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
이처럼 숫자 N과 number가 주어질 때, 
N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.

제한사항
N은 1 이상 9 이하입니다.
number는 1 이상 32,000 이하입니다.
수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
최솟값이 8보다 크면 -1을 return 합니다.
입출력 예
N	number	return
5	12	4
2	11	3
입출력 예 설명
예제 #1
문제에 나온 예와 같습니다.

예제 #2
11 = 22 / 2와 같이 2를 3번만 사용하여 표현할 수 있습니다.

*/

public class ExpressN {
	public int solution(int N, int number) {
        int answer = -1;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        s.add(N);
        map.put(1, s);

        loop : for (int i = 2; i < 9; i++) {
            HashSet<Integer> set = new LinkedHashSet<>();

            int NNN = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) - 1)) * N;

            if (NNN == number){
                return i;
            }

            set.add(NNN);

            for (int j = 1; j <= i / 2; j++) {
                Iterator<Integer> it1 = map.get(j).iterator();
                Iterator<Integer> it2 = map.get(i - j).iterator();

                while (it1.hasNext()) {
                    int itValue1 = it1.next();
                    while (it2.hasNext()) {
                        int itValue2 = it2.next();
                        for (Operator o : Operator.values()) {
                            int calculate = o.calculate(itValue1, itValue2);
                            if (calculate == number){
                                answer = i;
                                break loop;
                            }

                            set.add(calculate);
                        }
                    }
                }
            }
            map.put(i, set);
        }

        return answer;
    }

    enum Operator {
        PLUS {
            @Override
            public int calculate(int i, int j) {
                return i + j;
            }
        }, MINUS {
            @Override
            public int calculate(int i, int j) {
                return i - j;
            }
        }, BACKMINUS {
            @Override
            public int calculate(int i, int j) {
                return j - i;
            }
        }, MUL {
            @Override
            public int calculate(int i, int j) {
                return i * j;
            }
        }, DIV {
            @Override
            public int calculate(int i, int j) {
                if (j == 0){
                    return 0;
                }
                return i / j;
            }
        }, BACKDIV {
            @Override
            public int calculate(int i, int j) {
                if (i == 0){
                    return 0;
                }
                return j / i;
            }
        };

        public abstract int calculate(int i, int j);
    }
	
	
	
	
//	int answer = -1;
//	public int solution(int N, int number) {
//        dfs(N, 0, 0, number, "");		
//        return answer;
//    }
//
//	// dfs 방식 (깊이 우선 탐색)
//	// n : 초기값 N, pos : 사칙연산을 몇 번 하는 지, num : 사칙연산으로 받은 결과값, number : 초기값 number, s : 사칙연산이 들어가는 문자열 (확인을 위한 값, 없어도 무방)
//    public void dfs(int n, int pos, int num, int number, String s) {
////    	System.out.println("dfs 시작 => pos : " + pos + ", num : " + num + ", s : " + s);
//    	// pos가 8보다 크면 리턴
//        if (pos > 8) {
//        	
//            return;
//        }
//        if (num == number) {
//            if (pos < answer || answer == -1) {
//                System.out.println(s);
//                answer = pos;
//            }
//            return;
//        }
//        int nn=0;
////        System.out.println("pos : " + pos + ", num : " + num + ", s : " + s);
//        for (int i = 0; i < 8; i++) {
//            nn=nn*10+n;
//            dfs(n, pos + 1+i, num + nn, number, s + "+");
//            dfs(n, pos + 1+i, num - nn, number, s + "-");
//            dfs(n, pos + 1+i, num * nn, number, s + "*");
//            dfs(n, pos + 1+i, num / nn, number, s + "/");
//        }
//        
////        System.out.println("for 후  => pos : " + pos + ", num : " + num + ", s : " + s);
//    }
	
	
	
	public static void main(String[] args) {
		int N = 5;
		int number = 26;		// return : 4
		System.out.println(new ExpressN().solution(N, number));
	}
}
