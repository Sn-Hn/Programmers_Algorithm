package winter_Coding;

/*

가로 길이가 Wcm, 세로 길이가 Hcm인 직사각형 종이가 있습니다. 
종이에는 가로, 세로 방향과 평행하게 격자 형태로 선이 그어져 있으며, 모든 격자칸은 1cm x 1cm 크기입니다. 
이 종이를 격자 선을 따라 1cm × 1cm의 정사각형으로 잘라 사용할 예정이었는데, 
누군가가 이 종이를 대각선 꼭지점 2개를 잇는 방향으로 잘라 놓았습니다. 
그러므로 현재 직사각형 종이는 크기가 같은 직각삼각형 2개로 나누어진 상태입니다. 
새로운 종이를 구할 수 없는 상태이기 때문에, 이 종이에서 원래 종이의 가로, 세로 방향과 평행하게 1cm × 1cm로 잘라 사용할 수 있는 만큼만 사용하기로 하였습니다.
가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 정사각형의 개수를 구하는 solution 함수를 완성해 주세요.

제한사항
W, H : 1억 이하의 자연수
입출력 예
W	H	result
8	12	80
입출력 예 설명
입출력 예 #1
가로가 8, 세로가 12인 직사각형을 대각선 방향으로 자르면 총 16개 정사각형을 사용할 수 없게 됩니다. 
원래 직사각형에서는 96개의 정사각형을 만들 수 있었으므로, 96 - 16 = 80 을 반환합니다.

최대 공약수가 중요할 것 같다.

*/


public class IntactQuadrangle {
	public long solution(int w, int h) {
		// 최대공약수가 1일 때, 온전하지 못한 사각형은 w+h-1개
		long answer = 1;
		long gcb = 0;
		long wi, he;
		wi = Long.parseLong(String.valueOf(w));
		he = Long.parseLong(String.valueOf(h));
		
		answer = wi*he;
		gcb = gcb(wi, he);
		wi = wi/gcb;
		he = he/gcb;
		
		answer = answer-((wi+he-1)*gcb);
		return answer;
	}
	
	private static long gcb(long w, long h) {
		long gcb = 1;
		long big, small;
		big = w >= h ? w : h;
		small = w < h ? w : h;
		
		for(int i = 1; i <= small/2; i++) {
			if(small == 2 && small % 2 == 0 && big % 2 == 0) {
				gcb = 2;
			}else if(small % i == 0 && big % i == 0 ) {
				gcb = i;
			}
		}
		
		return gcb;
	}
	
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(new IntactQuadrangle().solution(w, h));
	}
	
//	public long solution(long w, long h) {
//		long answer = 1;
//		int gcb = 0;
//		
//		answer = w*h;
//		gcb = gcb(w, h);
//		w = w/gcb;
//		h = h/gcb;
//		
//		answer = answer-((w+h-1)*gcb);
//		return answer;
//	}
//	
//	private static int gcb(long w, long h) {
//		int gcb = 1;
//		long big, small;
//		big = w >= h ? w : h;
//		small = w < h ? w : h;
//		
//		for(int i = 1; i <= small; i++) {
//			if(small % i == 0 && big % i == 0 ) {
//				gcb = i;
//			}
//		}
//		
//		return gcb;
//	}
	
	
	
}
