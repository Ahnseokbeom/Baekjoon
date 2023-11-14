package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463_Recursion {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(dec(n,0));
	}
	static int dec(int n,int count) {
		if(n<2) {
			return count;
		}
		return Math.min(dec(n/2,count+1+(n%2)), dec(n/3,count+1+(n%3)));
	}
}
