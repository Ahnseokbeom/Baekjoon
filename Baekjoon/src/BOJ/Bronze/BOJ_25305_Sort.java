package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_25305_Sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 1;i<=n;i++) arr[i] = Integer.parseInt(st.nextToken());
		System.out.println(solution(n, k, arr));
	}
	public static int solution(int n, int k, int[] arr) {
		Arrays.sort(arr);
		return arr[n-k+1];
	}
}
