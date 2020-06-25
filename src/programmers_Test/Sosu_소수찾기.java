package programmers_Test;

public class Sosu_소수찾기 {
	public int sosu(int n) {
		int answer = 0;
	    boolean flag;
	    for(int i = 2; i <= n; i++) {
	        flag = true;
	        // for(int j = 2; j <= i/2; j++) {		// 내가 생각한 이중 for문(모든 수의 약수는 그 수의 반 이상을 넘어갈 수 없기 때문)
	        for(int j = 2; j*j <= i; j++) {			// 제곱근까지만 나누어 떨어지는지 보면 된다.
	            if(i%j==0 && i != 2) {				// 이유는 x^2 = n 일때 약수는 1 ~ x, x ~ n 까지의 값이 대칭으로 있다
	               flag = false;					// 그렇기 떄문에 1 ~ x까지 약수가 없다면 그 값은 소수가 된다!!!!!
	               break;							// 알고리즘 시간복잡도를 최대한으로 줄이는 방법!!!! *중요*
	            }else if (i == 2) {
	                flag = true;
	                break;
	            }
	        }
	        if(flag) {
	            answer += 1;
	        } 
	    }     
	    return answer;
	}
	
	
	public static void main(String[] args) {
		Sosu_소수찾기 so = new Sosu_소수찾기();
		System.out.println(so.sosu(222259));
	}

}
