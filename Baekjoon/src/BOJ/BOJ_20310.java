package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20310 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String answer = "";
		int one = (int)s.chars().filter(c->c=='1').count()/2;
		int zero = (int)s.chars().filter(c->c=='0').count()/2;
		for(int i = 0;i<zero;i++) answer+="0";
		for(int i = 0;i<one;i++) answer+="1";
		System.out.println(answer);
	}
}
