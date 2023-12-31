package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10845_Implementation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken())); break;
			case "pop":
				sb.append(pop()).append("\n"); break;
			case "size":
				sb.append(size()).append("\n"); break;
			case "empty":
				sb.append(empty()).append("\n"); break;
			case "front":
				sb.append(front()).append("\n"); break;
			case "back":
				sb.append(back()).append("\n"); break;
			}
		}
		System.out.println(sb);
	}
	static int[] queue = new int[10000];
	static int size = 0;
	static int front = 0;
	static int back = 0;

	public static void push(int n) {
		queue[back] = n;
		size++;
		back++;
	}
	public static int pop() {
		if(size==0) {
			return -1;
		}else {
			size--;
			front++;
			return queue[front];
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static int front() {
		if(size==0) {
			return -1;
		}else {
			return queue[front];
		}
	}
	public static int back() {
		if(size==0) {
			return -1;
		}else {
			return queue[back-1];
		}
	}
}
