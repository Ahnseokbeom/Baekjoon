package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1292_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] list = new int[1002];
		int count = 1;
		for(int i = 1;i<=1000;i++) {
			for(int j = 0;j<i;j++) {
				if(count==1001) break;
				list[count] = i;
				count++;
			}
		}
		int sum = 0;
		for(int i = a; i<=b;i++) {
			sum += list[i];
		}
		System.out.println(sum);
	}
}
