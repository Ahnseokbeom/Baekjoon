package BOJ.Bronze;

public class BOJ_2501_Math {
	public static void main(String[] args) {
        System.out.println(solution(6, 3));
        System.out.println(solution(25, 4));
        System.out.println(solution(2735, 1));
    }
    public static int solution(int N, int K) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    return i;
                }
            }
        }
        return 0;
    }
}
