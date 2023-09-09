package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		int start = 0;

		boolean check = true;

		while(n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(start < num) {
				for(int i = start+1;i<=num;i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = num;
			}else if(stack.peek()!=num) {
				check = false;
				break;
			}
			stack.pop();
			sb.append("-\n");
		}
		System.out.println(check?sb:"NO");
	}
}
