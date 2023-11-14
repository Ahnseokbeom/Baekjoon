package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_1212_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] eight = {"000","001","010","011","100","101","110","111"};
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
			int a =  s.charAt(i)-'0';
			sb.append(eight[a]);
		}
		if(s.equals("0")) System.out.println(s);
		else{
			while(sb.charAt(0) == '0') sb = new StringBuilder(sb.substring(1));
			System.out.println(sb);
		}
		sc.close();
	}
}
