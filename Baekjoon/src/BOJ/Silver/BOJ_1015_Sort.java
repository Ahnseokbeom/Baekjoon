package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1015_Sort {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        int[] b = new int[n];

        String[] temp = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            a[i][0] = Integer.parseInt(temp[i]);
            a[i][1] = i;
        }

        Sort(a);

        for (int i = 0; i < n; i++){
            int idx = a[i][1];
            b[idx] = i;
        }

        for (int num : b) sb.append(num).append(" ");
        System.out.println(sb.toString());
    }

    public static void Sort(int[][] a){
        Arrays.sort(a, (next, current) ->{
            if (next[0] < current[0]){
                return -1;
            }else if (next[0] > current[0]){
                return 1;
            }else return Integer.compare(next[1], current[1]);
        });
    }
}
