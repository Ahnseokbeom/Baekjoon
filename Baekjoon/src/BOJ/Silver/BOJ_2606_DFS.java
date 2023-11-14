package BOJ.Silver;

import java.util.Scanner;

public class BOJ_2606_DFS {
	static boolean[] check;
	static int[][] arr;
	static int n,m;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		check = new boolean[n+1];
		for(int i=1;i<=m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

//		System.out.println(bfs(1));
		System.out.println(dfs(1));
		sc.close();
	}
//	public static int bfs(int x) {
//		Queue<Integer> q = new LinkedList<>();
//		check[x] = true;
//		q.offer(x);
//		while(!q.isEmpty()) {
//			int num = q.poll();
//			for(int i = 1;i<arr.length;i++) {
//				if(arr[num][i]==1 && !check[i]) {
//					q.offer(i);
//					check[i] = true;
//					count++;
//				}
//			}
//		}
//		return count;
//	}
	public static int dfs(int x) {
		check[x] = true;
		for(int i = 1;i<=n;i++) {
			if(arr[x][i]==1 && !check[i]) {
				count++;
				dfs(i);
			}
		}
		return count;
	}
}
