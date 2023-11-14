package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2908_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solution(a, b));
		sc.close();
	}
	public static int solution(int a, int b) {
		int tempA = a-((a/100)*100)+((a%10)*100)-a%10+a/100;
		int tempB = b-((b/100)*100)+((b%10)*100)-b%10+b/100;
		return tempA>tempB?tempA:tempB;
	}
}
