package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ_12789_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] students = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<Integer> waiting = new ArrayDeque<>();
        int current = 1;

        for (int student : students) {
            if (student == current) {
                current++;

                while (!waiting.isEmpty() && waiting.getLast() == current) {
                    waiting.removeLast();
                    current++;
                }
            } else {
                waiting.addLast(student);
            }
        }

        System.out.println(waiting.isEmpty() ? "Nice" : "Sad");
    }
}

