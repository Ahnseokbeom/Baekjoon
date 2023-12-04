package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1652_Implemetation {
	static char[][] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j= 0;j<n;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		System.out.println(solution(n, arr));
	}
	private static String solution(int n, char[][] arr) {
		int row = 0;
		int col = 0;
		for(int i = 0; i < n; i++) {
	        for (int j = 0 ; j < n; j++) {
	            if(i + 1 < n) {
	                if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= n || arr[i+2][j] == 'X')) {
	                    col++;
	                }
	            }
	            if(j + 1 < n) {
	                if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= n || arr[i][j + 2] == 'X')) {
	                    row++;
	                }
	            }
	        }
	    }
		return new StringBuilder().append(row+" ").append(col).toString();
	}
}
