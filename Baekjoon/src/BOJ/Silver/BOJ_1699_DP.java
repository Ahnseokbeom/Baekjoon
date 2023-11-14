package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1699_DP {
	static int n;
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		dp[1] = 1;
		System.out.println(DP());
	}
	public static int DP() {
		for(int i = 2;i<=n;i++) {
			dp[i] = 100001;
			for(int j = 1;j<=i/2;j++) {
				if(j*j==i) {
					dp[i] = 1;
					break;
				}
				dp[i] = Math.min(dp[i], dp[j]+dp[i-j]);
			}
		}
		return dp[n];
	}
}
