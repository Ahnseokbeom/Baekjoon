package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class BOJ_3009_HashMap {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> mapX = new HashMap<>();
		Map<String, Integer> mapY = new HashMap<>();
		for(int i = 0;i<3;i++) {
			String s = br.readLine();
			mapX.put(s.split(" ")[0],mapX.getOrDefault(s.split(" ")[0], 0)+1);
			mapY.put(s.split(" ")[1],mapY.getOrDefault(s.split(" ")[1], 0)+1);
		}
		System.out.println(X(mapX)+" "+Y(mapY));
	}
	public static String X(Map<String,Integer> mapX) {
		List<String> x = mapX.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
		return x.get(0);
	}
	public static String Y(Map<String,Integer> mapY) {
		List<String> x = mapY.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
		return x.get(0);
	}
}
