package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_10870_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
		sc.close();
	}
	public static int fibo(int n) {
		int answer = 0;
		if(n == 0) return answer;
		if(n == 1) {
			answer = 1;
			return answer;
		}
		if(n >= 2) {
			answer = fibo(n-2)+fibo(n-1);
			return answer;
		}
		return answer;
	}
}
