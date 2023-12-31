package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11052_DP {
	static int n;
	static int[] arr,dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i = 1;i<=n;i++) arr[i] = Integer.parseInt(st.nextToken());

		System.out.println(DP());
		System.out.println(Arrays.toString(dp));
	}
	public static int DP() {
		for(int i = 1;i<=n;i++)
			for(int j = 1;j<=i;j++) dp[i] = Math.max(dp[i], dp[i-j]+arr[j]);
		return dp[n];
	}
}
