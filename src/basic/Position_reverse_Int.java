package basic;

import java.util.ArrayList;
/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

단, n은 10,000,000,000이하의 자연수이다(long)
*/
public class Position_reverse_Int {
	public int[] solution(long n) {
		int[] answer = {};
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		long a = 0;
//		while(n >= 1) {
//			a = n%10;
//			al.add((int)a);
//			n /= 10;
//		}
//		answer = new int[al.size()];
//		for(int i = 0; i < al.size(); i++) {
//			answer[i] = al.get(i);
//		}
		
		int len = Long.toString(n).length();
		answer = new int[len];
		long a = 0;				// 데이터 타입이 long이므로 따로 long 변수를 만들어줘야한다. 만들어주지 않으면 int형으로 자동형변환 되어 계산됨!!
		int i = 0;
		while(n >= 1) {
			a = n%10;
			answer[i] = ((int)a);
			n /= 10;
			i++;
		}
		
		return answer;
	}
	public void prt(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Position_reverse_Int pi = new Position_reverse_Int();
		long n = 8000000000L;
		pi.prt(pi.solution(n));
	}

}
