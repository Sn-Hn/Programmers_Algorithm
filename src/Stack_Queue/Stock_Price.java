package Stack_Queue;

/*
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

prices			return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]

1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.


*/

public class Stock_Price {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length; i++) {
			int cnt = 0;
			for(int j = i+1; j < prices.length; j++) {
				if(prices[i] <= prices[j]) {
					cnt++;
				}else {
					cnt++;
					break;
				}
//				System.out.println("i : " + i + ", j : " + j + " , " + " prices[" + i + "] : " + prices[i] + ", prices[" + j + "] : " + prices[j] + ", cnt : " + cnt); 
			}
			answer[i] = cnt;
		}
//		answer[prices.length-1] = 0;
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Stock_Price sp = new Stock_Price();
		int[] prices = {1, 2, 3, 2, 3};
		
		int[] result = sp.solution(prices);
		for(int i : result) {
			System.out.println(i);
		}
		
	}

}
