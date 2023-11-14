package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2581_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 0;

		for(int i = m;i<=n;i++) {
			int j = 2;
			for(;j<n;j++) {
				if(i%j==0)
					break;
			}
			if(j==i) {
				sum += j;
				if(min != 0) {
					continue;
				}else min = j;
			}
		}
		System.out.println(sum==0?-1:sum+"\n"+min);
		sc.close();
	}
}
