package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_27497 {
	static StringBuilder sb = new StringBuilder();
	static Stack<String> stack = new Stack<>();
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int sum1 = 0;
	int sum2 = 0;
	for(int i = 0;i<n;i++) {
		String s = br.readLine();
		if(s.charAt(0)=='1' || s.charAt(0)=='2') {
			arr.add(s);
			sum1++;
		}
		else{
			arr.add(String.valueOf(i));
			sum2++;
		}
	}
	System.out.println(arr);
	if(sum1 <= sum2) System.out.println(0);
	else {
		solution(sum2);
		System.out.println(arr);
	}
	}
	public static void solution(int n) {
		for(int i = 0;i<n;i++) {
			if(arr.get(i).length()==1) {
				arr.remove(Integer.parseInt(arr.get(i))-1);
			}
		}
	}
}
