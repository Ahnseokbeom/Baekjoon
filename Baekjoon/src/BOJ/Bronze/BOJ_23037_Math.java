package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23037_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0;
		String s = String.valueOf(n);
		for(int i = 0;i<s.length();i++) {
			answer+= Math.pow(s.charAt(i)-'0',5);
		}
		return answer;
	}
}
