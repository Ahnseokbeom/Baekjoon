package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244_Implementation {
	static int[] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i = 1;i<=n;i++)  arr[i] = Integer.parseInt(st.nextToken());

		int num = Integer.parseInt(br.readLine());

		for(int i = 0;i<num;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x==1) boy(y);
			else {
				arr[y] = 1 - arr[y];
				girl(y);
			}
		}
		for(int i = 1;i<=n;i++) {
			System.out.print(String.valueOf(arr[i])+" ");
			if(i%20==0) System.out.println();
		}
	}
	public static void boy(int y) {
		for(int i = y;i<=n;i+=y) {
			arr[i] = 1 - arr[i];
		}
	}
	public static void girl(int y) {
		for(int i = 1;y-i > 0 && y+i<=n;i++) {
			if(arr[y-i]==arr[y+i]) {
				arr[y-i] = 1 - arr[y-i];
				arr[y+i] = 1 - arr[y+i];
			}else break;
		}
	}
}
