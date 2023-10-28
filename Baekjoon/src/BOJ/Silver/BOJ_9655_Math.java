package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9655_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solution(Integer.parseInt(br.readLine())));
	}
	public static String solution(int n) {
		return n%2==0?"CY":"SK";
	}
}
