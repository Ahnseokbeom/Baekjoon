package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16194_DP {
	static int n;
	static int[] arr,dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i = 1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = Integer.MAX_VALUE;
		}
		System.out.println(DP());
	}
	public static int DP() {
		for(int i = 1;i<=n;i++)
			for(int j = 1;j<=i;j++) dp[i] = Math.min(dp[i], dp[i-j]+arr[j]);
		return dp[n];
	}
}
