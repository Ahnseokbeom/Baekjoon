package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5073_Math {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0) break;
			solution(a, b, c);
		}
		System.out.println(sb.toString());
	}
	public static void solution(int a, int b, int c) {
		if(a >= b+c || b >= a+c || c >= a+b) sb.append("Invalid\n");
		else if(a==b && b==c && a==c) sb.append("Equilateral\n");
		else if(a==b || b==c || a==c) sb.append("Isosceles\n");
		else sb.append("Scalene\n");
	}
}
