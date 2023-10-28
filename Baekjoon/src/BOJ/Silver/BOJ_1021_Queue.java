package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1021_Queue {
	static LinkedList<Integer> q;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		q = new LinkedList<>();
		for(int i = 1;i<=n;i++) {
			q.offer(i);
		}
		st = new StringTokenizer(br.readLine()," ");
		answer = 0;
		for(int i = 0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());
			int a = q.indexOf(num);
			solution(a, num);
		}
		System.out.println(answer);
	}
	public static void solution(int a, int num) {
		if(q.indexOf(num)<=q.size()/2) {
			for(int j = 0;j<a;j++) {
				q.addLast(q.removeFirst());
				answer++;
			}
		}else {
			for(int k = 0;k<q.size()-a;k++) {
				q.addFirst(q.removeLast());
				answer++;
			}
		}
		if(num==q.peekFirst()) {
			q.remove();
		}
	}
}
