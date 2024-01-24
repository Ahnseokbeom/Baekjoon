package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11000_Sort {
	static class Class implements Comparable<Class>{
		int start;
		int end;
		public Class(int start, int end) {
			this.start = start;
			this.end = end;
		}
		@Override
		public int compareTo(Class c) {
			if(this.start == c.start) {
				return this.end - c.end;
			}else return this.start - c.start;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Class> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list.add(new Class(start,end));
		}
		Collections.sort(list);
		Queue<Integer> q = new LinkedList<>();
		int time = 0;
		for(Class c : list) {
			time = c.end;
			if(!q.isEmpty() && q.peek()<=c.start) q.poll();
			q.add(time);
		}
		System.out.println(q.size());
	}

}
