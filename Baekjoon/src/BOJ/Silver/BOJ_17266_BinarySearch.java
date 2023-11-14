package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17266_BinarySearch {
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<m;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int left = 1;
		int right = n;
		int answer = 0;
		while(left <= right) {
			int mid = (left+right)/2;
			if(check(mid,arr)) {
				answer = mid;
				right = mid-1;
			}else left = mid+1;
		}
		System.out.println(answer);
	}
	public static boolean check(int num, int[] arr) {
		int s = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]-num<=s) s = arr[i]+num;
			else return false;
		}
		return n-s<=0;
	}
}
