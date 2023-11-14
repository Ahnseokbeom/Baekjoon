package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_2506_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) scores[i] = sc.nextInt();

        sc.close();

        int answer = calculate(scores);
        System.out.println(answer);
    }

    public static int calculate(int[] scores) {
        int answer = 0;
        int consecutiveScore = 0;

        for (int score : scores) {
            if (score == 1) {
                consecutiveScore++;
                answer += consecutiveScore;
            } else {
                consecutiveScore = 0;
            }
        }

        return answer;
	}
}
