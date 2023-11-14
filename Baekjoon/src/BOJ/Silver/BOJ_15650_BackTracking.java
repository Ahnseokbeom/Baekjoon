package BOJ.Silver;

import java.util.Scanner;

public class BOJ_15650_BackTracking {
	static int n;
	static int m;
	static int[] list;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        list = new int[m];
        backTracking(1, 0);

    }

    public static void backTracking(int order, int num) {
        if (num == m) {
            for (int a : list) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = order; i <= n; i++) {
            list[num] = i;
            backTracking(i + 1, num + 1);
        }
    }
}
