package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1715_PriorityQueue {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i = 0;i<n;i++) {
			pq.offer(Long.parseLong(br.readLine()));
		}
		long sum = 0;
		while(pq.size()>1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();

			sum+= temp1+temp2;
			pq.offer(temp1+temp2);
		}
		System.out.println(sum);
	}
}
