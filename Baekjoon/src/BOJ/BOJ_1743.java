package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1743 {
	static int n,m,k,num;
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int max = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n+1][m+1];
		check = new boolean[n+1][m+1];
		for(int i = 0;i<k;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = 1;
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				if(arr[i][j]==1 && !check[i][j]) {
					num = 0;
					dfs(i,j);
					max = Math.max(max,num);
				}
			}
		}
		System.out.println(max);
	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		num++;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx > 0 && nx <= n && ny > 0 && ny <= m) {
				if(arr[nx][ny]==1 && !check[nx][ny]) {
					check[nx][ny] = true;
					dfs(nx,ny);
				}
			}
		}
	}
}
