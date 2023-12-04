package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2491_Implementation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		int leftNum = 1;
		int rightNum = 1;
		int left = 0;
		for(int i = 0;i<n;i++) {
			if(i==0) {
				left = Integer.parseInt(st.nextToken());
				continue;
			}
			int right = Integer.parseInt(st.nextToken());
			leftNum = left <= right?leftNum+1 : 1;
			rightNum = left >= right?rightNum+1 : 1;
			answer = leftNum > rightNum?Math.max(answer, leftNum):Math.max(answer, rightNum);
			left = right;
		}
		System.out.println(answer);
	}

}
