package basic;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		int size = a.length();
		for(int i = 0; i < size; i++) {
			int sc = Character.getNumericValue(a.charAt(i));
			for(int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
