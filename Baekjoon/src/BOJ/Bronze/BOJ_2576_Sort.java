package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2576_Sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i = 0;i<7;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n % 2 != 0) {
				list.add(n);
				sum += n;
			}
		}
		Collections.sort(list);
		System.out.println(list.isEmpty()?-1:sum+"\n"+list.get(0));
	}
}
