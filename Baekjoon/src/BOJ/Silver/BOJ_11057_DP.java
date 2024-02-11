package BOJ.Silver;

import java.util.Scanner;

public class BOJ_11057_DP {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // dp[i][j]는 길이가 i이고 마지막 자리 숫자가 j인 오르막 수의 개수를 저장합니다.
        int[][] dp = new int[N + 1][10];

        // 길이가 1인 경우, 모든 숫자는 오르막 수입니다.
        for (int i = 0; i < 10; i++) dp[1][i] = 1;

        // 길이가 2 이상인 경우, dp 테이블을 채웁니다.
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007;
                }
            }
        }

        // 길이가 N이고 모든 숫자로 끝나는 오르막 수의 개수를 합산합니다.
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer = (answer + dp[N][i]) % 10007;
        }
        sc.close();
        System.out.println(answer);
    }
}
