package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2420_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		System.out.println(solution(N, M));
		sc.close();
	}
	public static long solution(long N, long M) {
		return Math.abs(N)+Math.abs(M);
	}
}
