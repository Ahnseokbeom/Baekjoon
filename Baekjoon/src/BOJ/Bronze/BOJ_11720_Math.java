package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11720_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) arr[i] = s.charAt(i)-'0';
		sc.close();
		System.out.println(Arrays.stream(arr).sum());
	}
}
