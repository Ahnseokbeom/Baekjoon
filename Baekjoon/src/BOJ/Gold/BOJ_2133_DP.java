package BOJ.Gold;

import java.util.Scanner;

public class BOJ_2133_DP {
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(DP(n));
		sc.close();
	}
	public static int DP(int n) {
		dp[0] = 1;
		for(int i = 2;i<=n;i+=2) {
			dp[i] = dp[i-2]*3;
			for(int j = i-4;j>=0;j-=2) {
				dp[i]+=dp[j]*2;
			}
		}
		return n%2==0?dp[n]:0;
	}
}
