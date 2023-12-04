package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2331_Implementation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		int answer = 0;
		String a = st.nextToken();
		int p = Integer.parseInt(st.nextToken());
		list.add(Integer.parseInt(a));
		while(true) {
			String[] s = a.split("");
			int num = 0;
			for(int j = 0;j<s.length;j++) {
				num+=(int)(Math.pow(Integer.parseInt(s[j]), p));
			}
			System.out.print(num+" ");
			if(list.contains(num)) {
				answer = list.indexOf(num);
				break;
			}else list.add(num);
			a = String.valueOf(num);
		}
		System.out.println(answer);
	}
}
