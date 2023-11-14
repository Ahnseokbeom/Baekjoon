package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2667_BFS {
	static int dx[] = {0,0,1,-1};
	static int dy[] = {-1,1,0,0};
	static int n;
	static boolean[][] visited = new boolean[25][25];
	static int[][] map = new int[25][25];
	static int count;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			String s = sc.next();
			for(int j = 0;j<n;j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		count = 0;
		list = new ArrayList<>();

		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 1;
					bfs(i,j);
					list.add(count);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.size();i++) sb.append(list.get(i)).append("\n");
		sc.close();
		System.out.println(sb);
}
	public static int bfs(int x, int y) {
		visited[x][y] = true;

		for(int i = 0;i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
				if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
					bfs(nextX,nextY);
					count++;
				}
			}
		}
		return count;
	}
}
