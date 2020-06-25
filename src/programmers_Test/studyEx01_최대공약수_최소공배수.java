package programmers_Test;
import java.util.Scanner;

public class studyEx01_최대공약수_최소공배수 {
	public static void main(String[] args) {
		int[] answer = new int[2];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int nm = n*m;
		
	      int count = 0;
	      
	      if(n>=m) {
	          for(int i = 2; i <= n; i++) {
	              if(n%i==0 && m%i==0) {	// 공통된 약수들을 구한다
	                  answer[0] = i;		// break를 넣지 않았기 떄문에 i가 큰 값까지 돌아 answer[0]에는 최대인 약수가 들어감
	                  count++;				// count를 세는 이유는 두수에 공통된 약수가 없을 때를 위함
	              } 						// 공통된 약수가 없을 때는 최대공약수가 1이다 ex) 2-5, 3-7, 10-11, ...
	          }
	          if(count == 0) {				// 공통된 약수가 없을 때 if문
	              answer[0] = 1;
	          }
	          answer[1] = nm/answer[0];		// 최소공배수는 두수의 곱을 최대공약수로 나누면 최대공배수가 된다.
	          								// 최소공배수 (공통된 배수들 중 최소인 것)
	          								// 최대공약수 (공통된 약수들 중 최대인 것)
	      }else {							// 다른 방법으로는 배수들을 구하여 서로 비교하여 최소인 값을 구하면 된다.
	          for(int i = 2; i <= m; i++) {
	              if(n%i==0 && m%i==0) {
	                  answer[0] = i;
	                  count++;
	              } 
	          }
	          if(count == 0) {
	              answer[0] = 1;
	          }
	          answer[1] = nm/answer[0];
	      }
	    
	      for(int i = 0; i <2; i++) {
	    	  System.out.println(answer[i]);
	      }
	      
	}

}
