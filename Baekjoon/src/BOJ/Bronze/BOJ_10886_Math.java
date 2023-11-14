package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10886_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cute = new int[n];
		for(int i = 0;i<n;i++) cute[i] = sc.nextInt();
		int zero = (int)Arrays.stream(cute).filter(i -> i==0).count();
		int one = (int)Arrays.stream(cute).filter(i -> i==1).count();
		System.out.println(zero > one? "Junhee is not cute!":"Junhee is cute!");
		sc.close();
	}
}
