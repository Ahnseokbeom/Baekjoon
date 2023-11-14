package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2443_Recursion {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rec(N);
        sc.close();
    }

    public static void rec(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
