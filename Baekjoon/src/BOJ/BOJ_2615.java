package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2615 {
	static int count1 = 0;
	static int count2 = 0;
	static int[][] arr;
	static boolean[][] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 19;
		int [][] d = {{0,1}, {1,0}, {1,1}, {-1,1}};
		arr = new int[n][n];
		StringTokenizer st;
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<n;j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (arr[i][j] == '1' || arr[i][j] == '2') {
					for (int k = 0; k < 4; k++) {
						int nx = i; // x좌표
						int ny = j; // y좌표
						int cnt = 1; // 일치하는 바둑알의 개수
						while (true) {
							nx += d[k][0];
							ny += d[k][1];
							if ( 0 <= nx && nx < 19 && 0 <= ny && ny < 19) {
								if(arr[i][j] == arr[nx][ny])cnt ++;
								else {
									break;
								}
							} else break;
						}
						nx = i;
						ny = j;
						while( true) {
							nx -= d[k][0];
							ny -= d[k][1];
							if ( 0 <= nx && nx < 19 && 0 <= ny && ny < 19) {
								if(arr[i][j] == arr[nx][ny])cnt ++;
								else break;

							} else break;
						}
						if (cnt == 5) {
							System.out.println(arr[i][j]);
							System.out.println((i+1) + " " + (j+1));
							return;
						}
						System.out.println(cnt);
					}
				}
			}
		}
		System.out.println(0);
	}
}
