package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11727 {
	static int[] dp = new int[1001];
	final static int mod = 10007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		dp[1] = 1;
		dp[2] = 3;
		for(int i = 3;i<=n;i++) dp[i] = (dp[i-1]+(dp[i-2]*2))%mod;
		return dp[n];
	}
}
