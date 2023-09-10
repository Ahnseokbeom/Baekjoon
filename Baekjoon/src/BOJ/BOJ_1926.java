package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1926 {
	static int n,m;
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int max = 0;
	static int count = 0;
	static int num;
	static boolean zero;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		check = new boolean[n][m];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) zero = false;
			}
		}
		if(zero)System.out.printf("0\n0");
		else {
		for(int i = 0;i<n;i++) {
			num = 0;
			for(int j = 0;j<m;j++) {
				if(arr[i][j]==1 && !check[i][j]) {
					count++;
					num = 0;
					dfs(i,j);
					max = Math.max(max, num);
				}
			}
		}
		System.out.printf("%d\n%d",count,max);
		}
	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		num++;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if(arr[nx][ny]==1 && !check[nx][ny]) {
					check[nx][ny] = true;
					dfs(nx,ny);
				}
			}
		}
	}
}
