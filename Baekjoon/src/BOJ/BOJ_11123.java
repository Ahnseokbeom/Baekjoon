package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11123 {
	static int h,w,t;
	static char[][] arr;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static boolean[][] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		arr = new char[h][w];
		check = new boolean[h][w];
		int answer = 0;
		for(int i = 0;i<h;i++) {
			String s = br.readLine();
			for(int j = 0;j<w;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for(int i = 0;i<h;i++) {
			for(int j = 0;j<w;j++) {
				if(arr[i][j]=='#' && !check[i][j]) {
					answer++;
					dfs(i,j);
				}
			}
		}
		sb.append(answer+"\n");
	}
		System.out.println(sb);
}
	public static void dfs(int x, int y) {
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
				if(arr[nx][ny]=='#' && !check[nx][ny]) {
					check[nx][ny] = true;
					dfs(nx,ny);
				}
			}
		}
	}
}
