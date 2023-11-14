package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2902_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.next()));
		sc.close();
	}
	public static String solution(String s) {
		return s.replaceAll("[a-z-]", "");
	}
}
