package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_10162_Greedy {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println(solution(t, a, b, c));
		sc.close();
	}
	public static String solution(int t, int a, int b, int c) {
		StringBuilder sb = new StringBuilder();
		if(t>=300) {
			a = t/300;
			t -= 300 * a;
		}
		if(t>=60) {
			b = t/60;
			t-= 60*b;
		}
		if(t%10 != 0) {
			return "-1";
		}else {
			c = t/10;
			t -= 10*c;
		}
		sb.append(a+" ").append(b+" ").append(c);
		return sb.toString();
	}
}
