package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_27964_HashSet {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		HashSet<String> set = new HashSet<>();
		for(int i = 0;i<str.length;i++) {
			if(str[i].length()>=6 && str[i].substring(str[i].length()-6,str[i].length()).equals("Cheese")) set.add(str[i]);
		}
		System.out.println(set.size()>=4?"yummy":"sad");
	}
}
