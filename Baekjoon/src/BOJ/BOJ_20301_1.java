package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_20301_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        Deque<Integer> q = new ArrayDeque<Integer>();

        for(Integer i=1; i<=n; i++)
            q.add(i);

        int count = 0;
        int directionCount = 0;
        boolean isLeftToRight = true;

        while (!q.isEmpty()) {
            int number;
            if (isLeftToRight) {
                number = q.pollFirst();
            } else {
                number = q.pollLast();
            }

            count += 1;
            if (count == k) {
                count = 0;
                directionCount += 1;
                sb.append(number)
                  .append("\n");
            } else {
                if(isLeftToRight) {
                    q.addLast(number);
                } else {
                    q.addFirst(number);
                }
            }

            if (directionCount == m) {
                directionCount = 0;
                isLeftToRight = !isLeftToRight;
            }
        }
        System.out.println(sb);
        br.close();
	}

}
