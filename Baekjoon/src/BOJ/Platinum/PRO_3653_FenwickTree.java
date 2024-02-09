package BOJ.Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO_3653_FenwickTree {
	static int[] fwTree;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < t; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            fwTree = new int[n + m + 1];

            initTree();

            int[] indexMap = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                indexMap[i] = n - i + 1;
            }

            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int selectedMovie = Integer.parseInt(st.nextToken());
                int idx = indexMap[selectedMovie];
                if (idx == n + i + 1) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(updateTree(idx, n + i + 1)).append(" ");
                    indexMap[selectedMovie] = n + i + 1;
                }
            }
            System.out.println(sb.toString());
        }
    }

    static void initTree() {
        for (int i = 1; i <= n + m; i++) {
            if (i <= n) {
                fwTree[i] = i & -i;
            } else {
                fwTree[i] = Math.max(0, n - (i - (i & -i)));
            }
        }
    }

    static int updateTree(int curIdx, int nextIdx) {
        int temp = curIdx;
        int result = 0;
        while (temp > 0) {
            result += fwTree[temp];
            temp -= temp & -temp;
        }
        while (curIdx <= n + m) {
            fwTree[curIdx] -= 1;
            curIdx += curIdx & -curIdx;
        }
        while (nextIdx <= n + m) {
            fwTree[nextIdx] += 1;
            nextIdx += nextIdx & -nextIdx;
        }
        return n - result;
    }
}
