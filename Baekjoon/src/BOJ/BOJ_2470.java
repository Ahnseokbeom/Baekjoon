package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2470 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++) list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		System.out.println(list);
	}
	public static void binarysearch() {

	}

}
