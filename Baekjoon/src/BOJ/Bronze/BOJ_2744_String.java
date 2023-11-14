package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2744_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) result += Character.toUpperCase(c);
			else result += Character.toLowerCase(c);
		}
		sc.close();
		System.out.println(result);
	}
}
