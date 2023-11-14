package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1351_HashMap {
	static HashMap<Long, Long> map = new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Long n = Long.parseLong(st.nextToken());
		Long p = Long.parseLong(st.nextToken());
		Long q = Long.parseLong(st.nextToken());

		map.put(0L, 1L);
		System.out.println(solution(n, p, q));
	}
	static Long solution(Long n, Long p, Long q) {
		if(n==0) return 1L;
			Long n1 = n/p;
			Long n2 = n/q;
			if(map.get(n)==null)
				map.put(n, solution(n1, p, q)+solution(n2, p, q));
			return map.get(n);
	}
}
