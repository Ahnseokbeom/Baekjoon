package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18111 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, arr[i][j]);
				max = Math.max(max, arr[i][j]);
			}
		}

		int ansS = Integer.MAX_VALUE;
		int ansH = -1;
		for (int f = min; f <= max; f++) {
			int time = 0;
			int block = b;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int dif = arr[i][j] - f;

					if (dif > 0) {
						time += Math.abs(dif) * 2;
						block += Math.abs(dif);
					} else if (dif < 0) {
						time += Math.abs(dif);
						block -= Math.abs(dif);
					}

				}
			}
			if (block < 0)
				continue;
			if (ansS >= time) {
				ansS = time;
				ansH = f;
			}
		}

		System.out.println(ansS + " " + ansH);
	}

}
