package kakao_2019;

import java.util.Stack;

/*
board 배열은 2차원 배열로 크기는 5 x 5 이상 30 x 30 이하입니다.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
moves 배열의 크기는 1 이상 1,000 이하입니다.
moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.

							board									  moves     		result
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]		   4

*/

public class Crane_Game {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<Integer>();
        
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		int y = moves[i]-1;
        		if(board[j][y] != 0) {
        			st.add(board[j][y]);
        			for(int k = 1; k < st.size(); k++) {
        				if(st.get(k) == st.get(k-1)) {
        					st.pop();
        					st.pop();
        					answer+=2;
        				}
        			}
        			board[j][y] = 0;
        			break;
        		}
        	}
        	System.out.println(moves[i]);
        }
        System.out.println(st);
//        for(int i = 0; i < st.size()-1; i++) {
//        	if(st.get(i) == st.get(i+1)) {
//        		System.out.println(st.get(i) + " , " + st.get(i+1));
//        		st.remove(i);
//        		st.remove(i-1);
//        	}
//        }
        
        System.out.println(st);
        
        
        
        return answer;
    }
    public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		Crane_Game cg = new Crane_Game();
		
		System.out.println(cg.solution(board, moves));			// => 4
		
		
	}
    
    
}
