package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_4358 {
	public static void main(String[] args) throws IOException{
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = 0;
		String s = br.readLine();
		while(true) {
			map.put(s, map.getOrDefault(s, 0)+1);
			size++;
			s = br.readLine();
			if(s.length()==0 || s==null) break;
		}
		Object[] arr = map.keySet().toArray();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(Object str : arr) {
			String key = (String)str;
			int cnt = map.get(key);
			double answer = (double)(cnt*100)/size;
			sb.append(key+" "+String.format("%.4f", answer)+"\n");
		}
		System.out.println(sb.toString());
	}
}
