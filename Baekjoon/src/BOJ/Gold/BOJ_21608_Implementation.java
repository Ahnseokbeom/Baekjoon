package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ_21608_Implementation {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        int[][] students = new int[n * n][];
        for (int i = 0; i < n * n; i++) {
            String[] s = br.readLine().split(" ");
            students[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) {
                students[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int order = 0; order < n * n; order++) {
            int[] student = students[order];

            List<int[]> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) {
                        int like = 0;
                        int blank = 0;
                        for (int k = 0; k < 4; k++) {
                            int nr = i + dr[k];
                            int nc = j + dc[k];
                            if (0 <= nr && nr < n && 0 <= nc && nc < n) {
                                if (contains(student, arr[nr][nc])) {
                                    like++;
                                }
                                if (arr[nr][nc] == 0) {
                                    blank++;
                                }
                            }
                        }
                        tmp.add(new int[]{like, blank, i, j});
                    }
                }
            }

            Collections.sort(tmp, new Comparator<int[]>() {
                @Override
				public int compare(int[] a, int[] b) {
                    if (b[0] != a[0]) return b[0] - a[0];
                    if (b[1] != a[1]) return b[1] - a[1];
                    if (a[2] != b[2]) return a[2] - b[2];
                    return a[3] - b[3];
                }
            });

            arr[tmp.get(0)[2]][tmp.get(0)[3]] = student[0];
        }
        int result = 0;

        java.util.Arrays.sort(students, new Comparator<int[]>() {
            @Override
			public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ans = 0;
                for (int k = 0; k < 4; k++) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (0 <= nr && nr < n && 0 <= nc && nc < n) {
                        if (contains(students[arr[i][j] - 1], arr[nr][nc])) {
                            ans++;
                        }
                    }
                }
                if (ans != 0) {
                    result += Math.pow(10, ans - 1);
                }
            }
        }
        System.out.println(result);
    }

    private static boolean contains(int[] array, int value) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
