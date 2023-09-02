package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1244 {
	static String[] str;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int stu = Integer.parseInt(br.readLine());
		for(int i = 0;i<stu;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x==1) boy(x,y);
			else girl(x,y);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void boy(int x, int y) {
		while(y <= arr.length) {
			change(y);
			y *= 2;
		}
	}
	public static void girl(int x, int y) {
		int idx = 1;
		change(y);
		while(true) {
			int left = y-idx;
			int right = y+idx;
			if(left <= 0 || right > arr.length || arr[left]!= arr[right]) break;
			if(arr[left]!= arr[right]) {
				change(left);
				change(right);
			}
			idx++;
		}
	}
	public static void change(int n) {
		if(arr[n]== 1) arr[n] = 0;
		else arr[n] = 1;
	}
}
