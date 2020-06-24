package stack_Queue;

import java.util.Stack;


// 다른사람의 풀이 (Stack)
public class Tower_Stack {
	class Tower {
        int idx;
        int height;

        public Tower(int idx, int height) {			// 생성자로 인덱스 번호, 높이를 받음
            this.idx = idx;
            this.height = height;
        }

        @Override
        public String toString() {
            return "idx : " + idx + " height : " + height;
        }
    }

    public int[] solution(int[] heights) {
        Stack<Tower> st = new Stack<>();					// 스택 변수 생성
        int[] answer = new int[heights.length];				// answer배열의 길이는 heights의 길이

        for (int i = 0; i < heights.length; i++) {			// 반복문
            Tower tower = new Tower(i + 1, heights[i]);		// Tower클래스 생성자를 이용하여 인덱스 번호와 높이를 전달
            int receiveIdx = 0;								// 받을 인덱스 번호

            while (!st.isEmpty()) {							// 스택이 비어있지 않다면 계속 반복
                Tower top = st.peek();						// Stack.peek() 데이터를 삭제하지 않고 가장 위에 있는 데이터 확인

                if (top.height > tower.height) {			// top의 높이가 tower의 높이보다 크면
                    receiveIdx = top.idx;					// top의 인덱스를 receiveIdx로 받아옴
                    break;
                }

                st.pop();				// stack.pop();
            }

            st.push(tower);				
            answer[i] = receiveIdx;
        }

        return answer;
    }

}

