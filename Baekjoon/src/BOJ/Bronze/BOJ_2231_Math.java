package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231_Math {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n,1));
	}
	public static int solution(int n, int current) {
	    if (current > n) return 0;

	    int sum = current;
	    int num = current;

	    while (num > 0) {
	        sum += num % 10;
	        num /= 10;
	    }
	    if (sum == n) return current;

	    return solution(n, current + 1);
	}
}
