package BOJ.Silver;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_18870_Sort {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		int[] answer = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();


		for(int i = 0; i < N; i++) answer[i] = arr[i] = sc.nextInt();

		Arrays.sort(answer);


		int rank = 0;
		for(int v : answer) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int key : arr) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
		sc.close();
	}
}
