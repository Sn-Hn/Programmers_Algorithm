package programmers_String;

public class String_WaterMelon {
	public String StringEx(int n) {
		return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	}
	public static void main(String[] args) {
		String_WaterMelon wm = new String_WaterMelon();
		System.out.println(wm.StringEx(3));
		System.out.println(wm.StringEx(4));
	}

}
/* 
	String result = "";
    for (int i = 0; i < n; i++) {
        result += i % 2 == 0 ? "수" : "박";	  // 3항연산자  // i를 2로나눈 나머지가 0이면 수 아니면 박을 result에 넣어라 !
        return result;
    }
*/
