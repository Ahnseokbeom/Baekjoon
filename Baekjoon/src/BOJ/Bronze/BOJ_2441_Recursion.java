package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2441_Recursion {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rec(N, N);
        sc.close();
    }

    public static void rec(int N, int current) {
        if (current == 0) return;

        for (int i = 0; i < N - current; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }

        System.out.println();
        rec(N, current - 1);
    }
}
