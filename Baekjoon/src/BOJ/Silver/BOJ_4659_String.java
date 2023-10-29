package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ_4659_String {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		Pattern pattern = Pattern.compile("^[^aeiou]+$|[aeiou]{3,}|[^aeiou]{3,}|([^eo])\\1+");
		Matcher matcher;
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			if(s.equals("end")) break;
			matcher = pattern.matcher(s);
			answer = matcher.find()?"not acceptable.":"acceptable.";
			sb.append("<"+s+"> is "+ answer+"\n");
		}
		System.out.println(sb);
	}
}
