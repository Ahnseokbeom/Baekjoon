package BOJ.Silver;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10799_Stack {
	static String s;
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		Stack<Integer> stack = new Stack<>();
		System.out.println(solution(stack));
		sc.close();
	}
	public static int solution(Stack<Integer> stack) {
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='(') stack.push(i);
			else {
				if(stack.pop()==i-1) answer+=stack.size();
				else answer+=1;
			}
		}
		return answer;
	}
}
