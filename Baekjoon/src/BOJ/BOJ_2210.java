package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2210 {
	static List<String> list = new ArrayList<>();
	static HashSet<String> set = new HashSet<>();
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static String[][] map;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new String[5][5];
		for(int i = 0;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<5;j++) {
				map[i][j] = st.nextToken();
			}
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				dfs(i,j,0,map[i][j]);
			}
		}
		System.out.println(set.size());

	}
	private static void dfs(int x, int y, int count, String s) {
		if(count==5) {
			set.add(s);
			return;
		}
		for(int i = 0;i<4;i++) {
			int nowX = x+dx[i];
			int nowY = y+dy[i];
			if((0<=nowX&&nowX<5) && (0<=nowY && nowY < 5)) {
				dfs(nowX,nowY,count+1,s+map[nowX][nowY]);
			}
		}
	}

}
