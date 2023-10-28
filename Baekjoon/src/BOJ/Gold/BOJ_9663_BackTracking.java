package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663_BackTracking {
	static int[] tmpQueens;
    static int n;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tmpQueens = new int[n];

        nQueen(0);
        System.out.println(cnt);
    }
    private static void nQueen(int k) {
        if (k == n) {
            cnt++;
            return;
        }

        a : for (int j = 0; j < n; j++) {
            for (int i = 0; i < k; i++) {
                if (tmpQueens[i] == j || Math.abs(tmpQueens[i] - j) == k - i) continue a;
            }

            tmpQueens[k] = j;
            nQueen(k + 1);
        }
    }
}
