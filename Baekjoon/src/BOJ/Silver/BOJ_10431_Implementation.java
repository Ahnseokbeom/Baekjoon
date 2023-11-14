package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10431_Implementation {
	static int[] arr;
	static int p;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		p = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(p-->0) {
			st = new StringTokenizer(br.readLine());
			int count = 0;
			arr = new int[20];
			sb.append(st.nextToken()).append(" ");
			for(int i = 0;i<arr.length;i++) arr[i] = Integer.parseInt(st.nextToken());

			for(int i = 0;i<arr.length;i++) for(int j = 0;j<i;j++) if(arr[i] < arr[j]) count++;
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
