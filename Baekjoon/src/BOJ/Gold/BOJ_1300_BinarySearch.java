package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1300_BinarySearch {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배열의 크기
		int n = Integer.parseInt(br.readLine());
		// 찾고하자하는 값의 인덱스 번호
		int k = Integer.parseInt(br.readLine());
		int start = 1;
		int end = k;
		System.out.println(binarySearch(n, k, start, end));
	}
	public static int binarySearch(int n, int k,int start, int end) {
		int answer = 0;
		while(start <= end) {
			int mid = (start+end)/2;
			long count = 0;

			for(int i = 1;i<=n;i++) {
				count += Math.min(mid/i,n);
			}
			if(count < k) {
				start = mid+1;
			}else {
				end = mid - 1;
				answer = mid;
			}
		}
		return answer;
	}
}
