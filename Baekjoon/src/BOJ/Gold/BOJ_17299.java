package BOJ.Gold;

import java.io.IOException;
import java.util.Stack;

public class BOJ_17299 {
	public static void main(String[] args) throws IOException {
	 	 System.out.println((solution(7,new int[] {1,1,2,3,4,2,1})));

    }
	public static String solution(int n,int[] A) {
		StringBuilder sb = new StringBuilder();
        int[] answer = new int[n];
        int[] arr = new int[1000001];  // Ai의 등장 횟수를 저장할 배열
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[A[i]]++;  // Ai의 등장 횟수 증가
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[A[i]] >= arr[stack.peek()]) {
                stack.pop();  // 현재 원소보다 작거나 같은 원소는 스택에서 제거
            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek();  // 스택의 top이 오등큰수
            } else {
                answer[i] = -1;  // 오른쪽에 오등큰수가 없는 경우
            }
            stack.push(A[i]);
        }
        for(int i : answer) sb.append(i+" ");
        return sb.toString();
    }
}
