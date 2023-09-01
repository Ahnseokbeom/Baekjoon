package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_25757 {
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
		for(int i = 0;i<n;i++) set.add(br.readLine());
		System.out.println(solution(s));
	}
	public static int solution(String s) {
		int answer = set.size();
		if(s.equals("F")) answer /= 2;
		if(s.equals("O")) answer /= 3;
		return answer;
	}
}
