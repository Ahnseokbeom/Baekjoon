package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1182 {
	static int[] arr;
	static int n,s;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		arr = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		dfs(0,0);
		System.out.println(s==0 ? answer-1:answer);
	}
	public static void dfs(int idx, int sum) {
		if(idx==n) {
			if(sum == s) answer++;
			return;
		}
		dfs(idx+1,sum+arr[idx]);
		dfs(idx+1,sum);
	}
}
