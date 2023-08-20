package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3613 {
	static int cnt1 = 0;
	static int cnt2 = 0;
	static String s;
	static String answer = "";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();

		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='_') {
				cnt1++;
				break;
			}else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				cnt2++;
				break;
			}
		}
		System.out.println(cnt1+" "+cnt2);
		if(Java()) {
			if(cnt1==1) CtoJava();
			else if(cnt2==1) JavatoC();
			else answer = "Error!";
		}
		else answer = "Error!";
		System.out.println(answer);
	}
	public static void CtoJava() {
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='_') {
				i++;
				answer+=String.valueOf(s.charAt(i)).toUpperCase();
			}
			answer+=s.charAt(i);
		}
	}
	public static void JavatoC() {
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				answer+="_";
				answer+= String.valueOf(s.charAt(i)).toLowerCase();
				continue;
			}
			answer+=s.charAt(i);
			System.out.println(answer);
		}
	}
	public static boolean Java() {
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				if(s.charAt(i+1)=='_') return false;
			}
			if(s.charAt(i)=='_') {
				if(s.charAt(i+1)>='A' && s.charAt(i+1)<='Z') return false;
				if(s.charAt(i+1)=='_') return false;
			}
		}
		return true;
	}
}
