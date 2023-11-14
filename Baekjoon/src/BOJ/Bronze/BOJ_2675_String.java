package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2675_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<t;i++) {
			int r = sc.nextInt();
			String str = sc.nextLine();
			for(int j = 1;j<str.length();j++) sb.append(str.substring(j,j+1).repeat(r));
			sb.append("\n");
		}
		sc.close();
		System.out.println(sb);
	}
}
