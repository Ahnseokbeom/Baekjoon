package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2960_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[n+1];

		int count = 0;

		for(int i = 2;i<=n;i++) {
			prime[i] = true;
		}
		for(int i = 2;i<=n;i++) {
			for(int j = i;j<=n;j+=i) {
				if(!prime[j]) continue;
				prime[j] = false;
				count++;
				if(count==k) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}
}
