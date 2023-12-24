package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_12738_BinarySearch {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());
        System.out.println(binarySearch(n,A));
    }
	public static int binarySearch(int n,int[] A) {

        int[] answer = new int[n];
        int len = 0; // answer의 길이

        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(answer, 0, len, A[i]);

            if (index < 0) index = -index - 1;

            answer[index] = A[i];

            if (index == len) len++;
        }
        return len;
	}
}
