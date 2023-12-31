package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2004_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());

		long count5 = five(n) - five(n-m) - five(m);
		long count2 = two(n) - two(n-m) - two(m);

		System.out.println(Math.min(count5,count2));

	}
	static long five(long num) {
		int count = 0;
		while(num >= 5) {
			count+=num/5;
			num/=5;
		}
		return count;
	}
	static long two(long num) {
		int count = 0;
		while(num>=2) {
			count+=num/2;
			num/=2;
		}
		return count;
	}
}
