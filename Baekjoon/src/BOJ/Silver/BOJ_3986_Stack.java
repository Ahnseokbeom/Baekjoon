package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_3986_Stack {
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		count = 0;
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			solution(i,s);
		}
		System.out.println(count);
	}
	public static void solution(int n,String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int j = 0;j<s.length();j++) {
			char c = s.charAt(j);
			if(stack.size()==0) {
				stack.push(c);
			}else if(stack.peek().equals(c)) {
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		if(stack.size()==0) count++;
	}
}
