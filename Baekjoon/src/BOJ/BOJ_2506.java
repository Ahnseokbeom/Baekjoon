package BOJ;

import java.util.Scanner;

public class BOJ_2506 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		System.out.println(cal());
	}
	public static int cal() {
		int num = 0;
		int answer = 0;
		for(int i = 0;i<n;i++) {
			if(sc.nextInt()==0) num = 0;
			else num +=1;
			answer += num;
		}
		return answer;
	}
}
