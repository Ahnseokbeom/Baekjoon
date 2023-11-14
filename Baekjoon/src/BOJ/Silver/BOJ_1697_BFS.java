package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697_BFS {
	static int n,k;
	static int answer;
	static int[] check = new int[100001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		System.out.println(bfs(n));

	}
	public static int bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		int num = 0;
		check[n] = 1;
		while(!q.isEmpty()) {
			num = q.remove();
			if(num==k) return check[num]-1;
			if(num-1 >= 0 && check[num-1]==0) {
				check[num-1] = check[num]+1;
				q.add(num-1);
			}
			if(num+1 < 100001 && check[num+1]==0) {
				check[num+1] = check[num]+1;
				q.add(num+1);
			}
			if(num*2 < 100001 && check[num*2]==0) {
				check[num*2] = check[num]+1;
				q.add(num*2);
			}
		}
		return -1;
	}
}
