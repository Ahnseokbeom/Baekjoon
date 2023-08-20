package BOJ;

import java.util.Scanner;

public class BOJ_2133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3==0 || n==1) System.out.println(0);
		else System.out.println(3*(n/2));
		sc.close();
	}

}
