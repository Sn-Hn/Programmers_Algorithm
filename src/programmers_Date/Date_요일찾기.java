package programmers_Date;

import java.util.Date;

public class Date_요일찾기 {
	public String solution(int a, int b) {
		String answer = "";
		int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		String[] str= {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		for(int i = 0; i < a-1; i++) {
			b += arr[i];
		}
		for(int i = 0; i < 7; i++) {
			if(b%7==i) answer = str[i];
		}
		
//		switch(b%7) {
//		case 0: answer="THU"; break;
//		case 1: answer="FRY"; break;
//		case 2: answer="SAT"; break;
//		case 3: answer="SUN"; break;
//		case 4: answer="MON"; break;
//		case 5: answer="TUE"; break;
//		case 6: answer="WED"; break;
//		}
		
//		if(b%7==0) answer="THU";
//		else if(b%7==1) answer="FRY";
//		else if(b%7==2) answer="SAT";
//		else if(b%7==3) answer="SUN";
//		else if(b%7==4) answer="MON";
//		else if(b%7==5) answer="TUE";
//		else if(b%7==6) answer="WED";
		

		return answer;
	}
	
	public static void main(String[] args) {
		Date_요일찾기 da = new Date_요일찾기();
		System.out.println(da.solution(5, 24));
	}

}
