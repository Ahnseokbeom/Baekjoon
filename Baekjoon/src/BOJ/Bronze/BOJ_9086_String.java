package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086_String {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			System.out.println(solution(s));
		}
	}
	public static String solution(String s) {
		return s.charAt(0)+""+s.charAt(s.length()-1)+"";
	}
}
