package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1309_DP {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][3];
		Arrays.fill(dp[1], 1);
		int mod = 9901;
		for(int i = 2;i<=n;i++) {
			dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2]) % mod;
			dp[i][1] = (dp[i-1][0]+dp[i-1][2]) % mod;
			dp[i][2] = (dp[i-1][0]+dp[i-1][1]) % mod;
		}
		int answer = (dp[n][0]+dp[n][1]+dp[n][2] % mod);
		System.out.println(answer);
	}
}
