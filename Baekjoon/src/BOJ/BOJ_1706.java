package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_1706 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		String[][] arr = new String[r][c];
		for(int i = 0;i<r;i++) {
			String[] str = br.readLine().split("");
			for(int j = 0;j<c;j++) arr[i][j] = str[j];
		}
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;i<r;i++) {
			String s = "";
			for(int j = 0;j<c;j++) s+=arr[i][j];
			String[] str = s.split("#");
			for(int k = 0;k<str.length;k++) if(str[k].length()>1) list.add(str[k]);
		}
		for(int i = 0;i<c;i++) {
			String s = "";
			for(int j = 0;j<r;j++) s+=arr[j][i];
			String[] str = s.split("#");
			for(int k = 0;k<str.length;k++) if(str[k].length()>1) list.add(str[k]);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
