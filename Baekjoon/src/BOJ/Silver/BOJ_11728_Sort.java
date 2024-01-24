package BOJ.Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_11728_Sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<a;i++) pq.add(Integer.parseInt(st.nextToken()));

		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<b;i++) pq.add(Integer.parseInt(st.nextToken()));

		while(!pq.isEmpty()) bw.write(pq.poll()+" ");

		bw.flush();
		bw.close();
	}
}
