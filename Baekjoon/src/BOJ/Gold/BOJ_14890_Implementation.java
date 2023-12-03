package BOJ.Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14890_Implementation {
	static int N, L;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        for(int i=0; i<N; i++) {
            if(solution(i, 0, true)) cnt++;
            if(solution(0, i, false)) cnt++;
        }
        System.out.printf("%d", cnt);
    }

    public static boolean solution(int x, int y, boolean isRow) {
        int[] height = new int[N];
        boolean[] isRunway = new boolean[N];
        for(int i=0; i<N; i++) {
            if(isRow) height[i] = map[x][y+i];
            else height[i] = map[x+i][y];
        }

        for(int i=0; i<N-1; i++) {
            int heightDiff = height[i] - height[i+1];
            if(Math.abs(heightDiff) >= 2) return false;
            if(heightDiff == 0) continue;
            if(heightDiff == 1) {
                for(int j =i+1; j<=i+L; j++) {
                    if(!(0<=j && j<N) || height[i+1] != height[j] || isRunway[j]) return false;
                    isRunway[j] = true;
                }
                i+=L-1;
            } else if(heightDiff == -1) {
                for(int j=i; j>i-L; j--) {
                    if(!(0<=j && j<N) || height[i] != height[j] || isRunway[j]) return false;
                    isRunway[j] = true;
                }
            }
        }

        return true;
    }

}
