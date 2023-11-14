package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2805_BinarySearch {
	static int[] list;
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		int max = 0;
		int min = 0;
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(max < list[i]) max = list[i];
		}
		System.out.println(binarySearch(max, min));
	}
	public static int binarySearch(int max, int min) {
		while(min < max) {
			int mid = (min+max)/2;
			long sum = 0;
			for(int height : list) {
				if(height - mid > 0) {
					sum+=height-mid;
				}
			}
			if(sum < m) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		return min-1;
	}
}
