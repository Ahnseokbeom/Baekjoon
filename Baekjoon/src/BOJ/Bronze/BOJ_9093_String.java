package BOJ.Bronze;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9093_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine() + "\n";
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ' || s.charAt(j) == '\n') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(s.charAt(j));
                }
                else {
                    stack.add(s.charAt(j));
                }
            }
        }
        sc.close();
        System.out.print(sb.toString());
	}
}
