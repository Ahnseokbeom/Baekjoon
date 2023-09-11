package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1303 {
	static int n,m,sum,w,b;
	static char[][] arr;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		check = new boolean[n][m];
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j = 0;j<m;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(!check[i][j]) {
					sum = 1;
					dfs(i,j,arr[i][j]);
					if(arr[i][j]=='W') w+=(sum*sum);
					else b += (sum*sum);
				}
			}
		}
		System.out.println(w+" "+b);
	}
	public static void dfs(int x, int y,char c) {
		check[x][y] = true;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= n || nx < 0 || ny >= m || ny < 0) continue;
			if(check[nx][ny] || arr[nx][ny] != c) continue;
			sum++;
			dfs(nx,ny,c);
		}
	}
}
