package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12738 {
	static int[] list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		list = new int[n+1];
		list[0] = -100000001;
		int answer = 0;
		int idx = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] > list[answer]) list[++answer] = arr[i];
			else{
				idx = BinarySearch(0,answer,arr[i]);
				list[idx] = arr[i];
			}
		}
		System.out.println(answer);
	}
	public static int BinarySearch(int left, int right, int target) {
		int mid = 0;
		while(left < right) {
			mid = (left+right)/2;
			if(list[mid] < target) left = mid+1;
			else right = mid;
		}
		return right;
	}
}
