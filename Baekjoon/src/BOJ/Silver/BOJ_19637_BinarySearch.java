package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19637_BinarySearch {
	static StringBuilder sb = new StringBuilder();
	static String[] name;
	static int[] power;
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		name = new String[n];
		power = new int[n];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			name[i] = st.nextToken();
			power[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0;i<m;i++) search(Integer.parseInt(br.readLine()));
		System.out.println(sb);
	}
	public static void search(int num) {
		int left = 0;
		int right = n-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(power[mid] < num) left = mid+1;
			else right = mid-1;
		}
		sb.append(name[left]+"\n");
	}
}
