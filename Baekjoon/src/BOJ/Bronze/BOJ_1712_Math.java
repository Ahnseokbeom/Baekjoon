package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_1712_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c<=b?"-1":(a/(c-b))+1);
		sc.close();
	}
}
