package Stack_Queue;

import java.util.ArrayList;

/*
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

numbers	return
17	3
011	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
*/

public class primeNumber {
	public int solution(String numbers) {
		int answer = 0;
		int len = numbers.length();
		int cnt = 0;
		String num = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i = 0; i < len; i++) {
			list.add(Character.getNumericValue(numbers.charAt(i)));
		}
		for(int i = 0; i < list.size(); i++) {
			if(primeNumber(list.get(i))) {
				cnt++;
			}
			num += list.get(i);
			for(int j = 0; j < list.size(); j++) {
				if(i!=j) {
					num+=list.get(j);
				}
			}
		}
		
		
		return answer;
	}
	
	public static boolean primeNumber(int num) {
		boolean primeCk = false;
		
		for(int i = 2; i*i < num; i++) {
			if(num%i != 0 && num != 1) {
				primeCk = true;
			}else if(num == 2){
				primeCk = true;
				break;
			}else {
				primeCk = false;
				break;
			}
		}
		
		
		
		return primeCk;
	}
	
	public static void main(String[] args) {
		primeNumber pn = new primeNumber();
		String numbers = "17";		// return : 3
//		String number = "011";
		
		System.out.println(pn.solution(numbers));
		
	}
	
	
	
}
