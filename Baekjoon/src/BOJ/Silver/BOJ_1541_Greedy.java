package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541_Greedy {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");

		while(st.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer str = new StringTokenizer(st.nextToken(),"+");

			while(str.hasMoreTokens()) {
				temp += Integer.parseInt(str.nextToken());
			}
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
}
