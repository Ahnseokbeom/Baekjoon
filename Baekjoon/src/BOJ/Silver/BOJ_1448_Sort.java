package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1448_Sort {
	static int[] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		System.out.println(solution());
	}
	public static int solution() {
		for(int i = arr.length-3;i>=0;i--) {
			if(arr[i] + arr[i+1] > arr[i+2]) {
				return arr[i]+arr[i+1]+arr[i+2];
			}
		}
		return -1;
	}
}
