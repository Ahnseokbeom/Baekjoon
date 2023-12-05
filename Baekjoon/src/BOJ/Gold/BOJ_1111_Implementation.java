package BOJ.Gold;

import java.util.Scanner;

public class BOJ_1111_Implementation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String answer = findNextNumber(arr, n);
        System.out.println(answer);
        sc.close();
    }

    private static String findNextNumber(int[] arr, int n) {
        if (n == 1 || (n == 2 && arr[0] != arr[1])) {
            return "A";
        } else if (n == 2) {
            return Integer.toString(arr[0]);
        } else {
            int a, b;
            if (arr[1] == arr[0]) {
                a = 1;
                b = 0;
            } else {
                a = (arr[2] - arr[1]) / (arr[1] - arr[0]);
                b = arr[1] - (arr[0] * a);
            }

            int i = 1;
            for (; i < n; i++) {
                if (arr[i] != (arr[i - 1] * a + b))
                    break;
            }
            if (i != n) {
                return "B";
            } else {
                return Integer.toString(arr[n - 1] * a + b);
            }
        }
    }

}
