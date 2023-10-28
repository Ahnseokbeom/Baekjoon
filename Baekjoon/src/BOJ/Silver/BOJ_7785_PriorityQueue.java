package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_7785_PriorityQueue {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		PriorityQueue<String> q = new PriorityQueue<>(Collections.reverseOrder());

		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			String[] str = s.split(" ");
			if(str[1].equals("enter")) q.add(str[0]);
			else q.remove(str[0]);
		}
		while(!q.isEmpty()) System.out.println(q.poll());
	}
}
