package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012_BFS {
	static int n,m,k;
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int count = 0;
		for(int i = 0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			check = new boolean[m][n];
			count = 0;

			for(int j = 0;j<k;j++) {
				st = new StringTokenizer(br.readLine()," ");
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				arr[p1][p2] = 1;
			}
			for(int a = 0;a<m;a++) {
				for(int b = 0;b<n;b++) {
					if(arr[a][b] == 1 && !check[a][b]) {
						bfs(a,b);
						count++;
					}
				}
			}
			System.out.println(count);
		}



	}
	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});

		while(!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			check[x][y] = true;
			q.poll();
			for(int i = 0;i<4;i++) {
				int x1 = x+dx[i];
				int y1 = y+dy[i];
				if(x1 >= 0 && y1 >= 0 && x1 < m && y1 < n) {
					if(!check[x1][y1] && arr[x1][y1] ==1) {
						q.add(new int[] {x1,y1});
						check[x1][y1] = true;
					}
				}
			}
		}
	}
}
