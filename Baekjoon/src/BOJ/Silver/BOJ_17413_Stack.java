package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17413_Stack {
	public static void main(String[] args) throws IOException{
		boolean check = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='<') {
				check = true;
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(str.charAt(i));
			}else if(str.charAt(i)=='>') {
				check = false;
				System.out.print(str.charAt(i));
			}else if(check) {
				System.out.print(str.charAt(i));
			}else if(!check) {
				if(str.charAt(i)==' ') {
					while(!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(str.charAt(i));
				}else {
					stack.push(str.charAt(i));
				}
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
