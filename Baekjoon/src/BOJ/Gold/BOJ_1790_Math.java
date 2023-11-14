package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1790_Math {
	static int n, k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int answer = 0;
        int div = 1;
        int nine = 9;
        solution(answer, div, nine);
	}
	public static void solution(int answer, int div, int nine) {
		while (k > div * nine) {
            k = k - (div * nine);
            answer = answer + nine;
            div++;
            nine = nine * 10;
        }
        answer = (answer + 1) + (k - 1) / div;
        if (answer > n) {
            System.out.println(-1);
        } else {
            String s = Integer.toString(answer);
            System.out.println(s.charAt((k - 1) % div));
        }
	}
}
