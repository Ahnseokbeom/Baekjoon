package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2438_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		rec(n,1);
		sc.close();
	}
	public static void rec(int n, int num) {
		if(n<num) return;
		for(int i = 0;i<num;i++) {
			System.out.print("*");
		}
		System.out.println();
		rec(n,num+1);
	}
}
