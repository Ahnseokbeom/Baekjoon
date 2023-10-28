package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8979_Implementation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][4];
		for(int i = 1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			arr[idx][1] = Integer.parseInt(st.nextToken());
			arr[idx][2] = Integer.parseInt(st.nextToken());
			arr[idx][3] = Integer.parseInt(st.nextToken());
		}
		int answer = 1;
		for(int i = 1;i<=n;i++) {
			if(arr[i][1] > arr[k][1]) answer++;
			else if(arr[i][1]==arr[k][1] && arr[i][2]>arr[k][2]) answer++;
			else if(arr[i][1]==arr[k][1] && arr[i][2]==arr[k][2] && arr[i][3] > arr[k][3]) answer++;
		}
		System.out.println(answer);
	}
}
