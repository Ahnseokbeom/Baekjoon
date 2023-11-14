package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_10872_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fact(sc.nextInt()));
		sc.close();
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}else if(n <= 1) {
			return n;
		}else {
			return fact(n-1)*n;
		}
	}
}
