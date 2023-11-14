package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932_DP {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[][] = new int[n+1][n+1];
		int dp[][] = new int[n+1][n+1];

		for(int i = 1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 1;j<=i;j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+a[i][j];
			}
		}
		int answer = 0;
		for(int i = 1;i<=n;i++) {
			if(answer < dp[n][i]) answer = dp[n][i];
		}
		System.out.println(answer);
	}
}
