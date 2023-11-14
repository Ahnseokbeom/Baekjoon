package BOJ.Bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println(st.countTokens());
		sc.close();
	}
}
