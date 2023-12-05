package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17266_BinarySearch {
	static int n,m;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<m;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(binarySearch());
	}
	public static int binarySearch() {
		int left = 1;
        int right = n;
        int answer = 0;

        // 이분탐색
        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
	}
	public static boolean check(int t) {
        int s = 0;
        for (int i = 0; i < m; i++) {
            if (arr[i] - t <= s) {
                s = arr[i] + t;
            } else {
                return false;
            }
        }
        return n - s <= 0;
    }
}
