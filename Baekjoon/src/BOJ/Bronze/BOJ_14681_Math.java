package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_14681_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		System.out.println(x > 0 && y > 0?1:x < 0 && y > 0?2:x < 0 && y < 0?3:4);
	}
}
