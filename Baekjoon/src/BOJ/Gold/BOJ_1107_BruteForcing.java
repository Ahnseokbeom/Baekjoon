package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107_BruteForcing {
	static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int brokenButton = Integer.parseInt(st.nextToken());
                broken[brokenButton] = true;
            }
        }

        int answer = Math.abs(n - 100);

        for (int i = 0; i <= 1000000; i++) {
            int length = check(i);
            if (length > 0) {
                int press = Math.abs(n - i);
                answer = Math.min(answer, length + press);
            }
        }

        System.out.println(answer);
    }

    public static int check(int channel) {
        if (channel == 0) {
            return broken[0] ? 0 : 1;
        }

        int length = 0;

        while (channel > 0) {
            if (broken[channel % 10]) {
                return 0;
            }
            length++;
            channel /= 10;
        }

        return length;
    }
}
