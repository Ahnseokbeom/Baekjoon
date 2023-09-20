package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10844 {
	static long[][] dp;
	static final Long mod = 1000000000L;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(DP(Integer.parseInt(br.readLine())));
	}
	public static long DP(int n) {
		long answer = 0;
		dp = new long[n+1][10];
		for(int i = 1;i<10;i++) dp[1][i] = 1;
		for(int i = 2;i<=n;i++) {
			dp[i][0] = dp[i-1][1]%mod;
			for(int j = 1;j<10;j++) {
				if(j==9) dp[i][j] = dp[i-1][8]%mod;
				else dp[i][j] = ((dp[i-1][j-1]%mod)+(dp[i-1][j+1]%mod))%mod;
			}
		}
		for(int i = 0;i<10;i++) answer+=dp[n][i];
		return answer%mod;
	}
}
