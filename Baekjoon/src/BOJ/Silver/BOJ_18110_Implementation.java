package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BOJ_18110_Implementation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = (int)Math.round(n*0.15);
		double mod = n - num*2;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int sum = IntStream.range(num, n-num)
				.map(i -> arr[i])
				.sum();
		int answer = (int)Math.round(sum/mod);
		System.out.println(answer);
	}
}
