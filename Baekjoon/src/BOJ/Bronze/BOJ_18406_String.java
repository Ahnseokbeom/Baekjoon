package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_18406_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		int lsum = 0;
		int rsum = 0;
		int length = s.length()/2;
		for(int i = 0;i<s.length();i++) {
			if(i<length) {
				lsum += s.charAt(i)-'0';
			}else {
				rsum += s.charAt(i)-'0';
			}
		}
		System.out.println(lsum==rsum?"LUCKY":"READY");
		sc.close();
	}
}
