package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19941_Greedy {
	static int n,k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		String[] str = s.split("");
		boolean[] check = new boolean[n];
		int answer = 0;
		for(int i = 0;i<n;i++) {
			if(str[i].equals("P")) {
				int left = Math.max(i-k, 0);
				int right = Math.min(i+k, n-1);
				for(int j = left;j<=right;j++) {
					if(str[j].equals("H") && !check[j]) {
						check[j] = true;
						answer++;
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
